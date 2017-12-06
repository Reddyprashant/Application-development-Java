/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility.googleMap;

import Business.EcoSystem;
import Business.LatLong;
import Business.Network.StateNetwork;
import Business.UserAccount.UserAccount;
import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.JSArray;
import com.teamdev.jxbrowser.chromium.JSValue;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;
import javax.xml.xpath.XPathConstants;
import org.w3c.dom.Document;
import userinterface.EntityAdmin.EntityRequestAreaJPanel;

public class GoogleMapsSample {

    public static final int MIN_ZOOM = 0;
    public static final int MAX_ZOOM = 21;

    /**
     * In map.html file default zoom value is set to 4.
     */
    private static int zoomValue = 4;

    public static void main(String[] args) {
        try {
            GoogleMapsSample g= new GoogleMapsSample();
            g.returnLatLong();
                System.out.println("utility.googleMap.GoogleMapsSample.main()"+g.returnLatLong().getLatitude());
        } catch (Exception ex) {
            Logger.getLogger(GoogleMapsSample.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
        public LatLong returnLatLong(){
        try {
            LatLong latLong= new LatLong();
            final Browser browser = new Browser();
            BrowserView view = new BrowserView(browser);
            browser.loadURL("https://www.google.com/maps");
            JButton markLocation = new JButton("Mark Location");
            
            markLocation.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if(browser.getURL()!= null){
                    System.out.println(browser.getURL());
                    String[] a= browser.getURL().split("/@",0);
                    String[] b= a[1].split(",");
                    System.out.println("Lat"+b[0]+"  "+"Lon"+b[1]);
                    double lat= Double.parseDouble(b[0]);
                    double lon= Double.parseDouble(b[1]);
                    latLong.setLatitude(lat);
                    latLong.setLongitude(lon);
                    }
                }
            });
        

            JPanel toolBar = new JPanel();
            toolBar.add(markLocation);

            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.add(view, BorderLayout.CENTER);
            frame.add(toolBar, BorderLayout.SOUTH);
            frame.setSize(900, 500);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);

        
           return latLong;
        }  
        catch (Exception ex) {
            Logger.getLogger(GoogleMapsSample.class.getName()).log(Level.SEVERE, null, ex);
        }
       return null;
        }
}
