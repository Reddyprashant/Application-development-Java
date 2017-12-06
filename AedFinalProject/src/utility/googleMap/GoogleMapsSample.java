/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utility.googleMap;
import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.JSValue;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.net.URLConnection;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;
import javax.xml.xpath.XPathConstants;
import org.w3c.dom.Document;


public class GoogleMapsSample {
  public static final int MIN_ZOOM = 0;
    public static final int MAX_ZOOM = 21;

    /**
     * In map.html file default zoom value is set to 4.
     */
    private static int zoomValue = 4;

    public static void main(String[] args) {
      try {
          BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
          System.out.println("Please enter a location:");
          String postcode=reader.readLine();
          String latLongs[] = getLatLongPositions(postcode);
          System.out.println("Latitude: "+latLongs[0]+" and Longitude: "+latLongs[1]);
          
          
          final Browser browser = new Browser();
          BrowserView view = new BrowserView(browser);
          
          JButton zoomInButton = new JButton("Zoom In");
          zoomInButton.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent e) {
                  if (zoomValue < MAX_ZOOM) {
                      browser.executeJavaScript("map.setZoom(" + ++zoomValue + ")");
                  }
              }
          });
          
          JButton zoomOutButton = new JButton("Zoom Out");
          zoomOutButton.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent e) {
                  if (zoomValue > MIN_ZOOM) {
                      browser.executeJavaScript("map.setZoom(" + --zoomValue + ")");
                  }
              }
          });
          
          
          JButton setMarkerButton = new JButton("Set Marker");
          setMarkerButton.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent e) {
                  
//48.4431727,23.0488126                  
//02120
//JSValue window = browser.executeJavaScriptAndReturnValue(
//                "map.addListener('click', function(e) {\n" +
//                "placeMarker(e.latLng, map);\n" +
//                "});\n" +
//                "\n" +
//                "function placeMarker(position, map) {\n" +
//                "        var marker = new google.maps.Marker({\n" +
//                "        position: position,\n" +
//                "        map: map,\n" +  
//                "        title:'test point',\n " +
//                "    });\n" +
//                "    map.panTo(position);\n" +
//                "}");
 browser.executeJavaScript("var myLatlng = new google.maps.LatLng(48.4431727,23.0488126);\n" +
               "var marker = new google.maps.Marker({\n" +
               "    position: myLatlng,\n" +
               "    map: map,\n" +
               "    title: 'Hello World!'\n" +
               "});");
   }
//JSValue window = browser.executeJavaScriptAndReturnValue(
//        "var a = 20;"
//        + "var b = 30;"
//        + " var c  = a + b;"
//        + "return c"
//);
        

//JSValue window = browser.executeJavaScriptAndReturnValue(
//        "map.addListener(marker, 'click', function(e) {\n"+
//                "var latitude = this.position.lat();\n"+
//                "var longitude = this.position.lng();\n"+
//                "alert(this.position));\n");

//JSValue john = window.asArray().get(0);
//JSValue doe = window.asArray().get(1);
//JSValue doe1 = window.asArray().get(2);
//JSValue doe2 = window.asArray().get(3);
//                System.out.println(".actionPerformed()"+john+doe+doe1+doe2);
//Object obj=window.asJavaObject();
//JavaObject j= new JavaObject();
//System.out.println("---> "+window.getStringValue());
//window.asObject().setProperty("java", j);


//System.out.println(".actiPemed()"+j.getLatitude());
//
//
//JSValue value = window.asObject().getProperty("java");
//if (value.isJavaObject()) {
//    JavaObject object = (JavaObject) value.asJavaObject();
////    System.out.println("obj"+object.getTitle());
//}

//JSValue value = window.asObject().getProperty("java");
//if (value.isJavaObject()) {
//    JavaObject object = (JavaObject) value.asJavaObject();
//    System.out.println("if"+object.getMessage());
//}
              }
              
          );
          
          JPanel toolBar = new JPanel();
          toolBar.add(zoomInButton);
          toolBar.add(zoomOutButton);
          toolBar.add(setMarkerButton);
          
          JFrame frame = new JFrame();
          frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
          frame.add(view, BorderLayout.CENTER);
          frame.add(toolBar, BorderLayout.SOUTH);
          frame.setSize(900, 500);
          frame.setLocationRelativeTo(null);
          frame.setVisible(true);
          
          // Provide the correct full path to the map.html file, e.g. D:\\map.html
          browser.loadURL("C:\\Users\\pooji\\Desktop\\AED\\jxbrowser-6.17-cross-desktop-win_mac_linux\\samples\\map.html");
      } catch (IOException ex) {
          Logger.getLogger(GoogleMapsSample.class.getName()).log(Level.SEVERE, null, ex);
      } catch (Exception ex) {
          Logger.getLogger(GoogleMapsSample.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
    
//    public static void main(String[] args) throws Exception
//  {
//   
//  }
  
  public static String[] getLatLongPositions(String address) throws Exception
  {
    int responseCode = 0;
    String api = "http://maps.googleapis.com/maps/api/geocode/xml?address=" + URLEncoder.encode(address, "UTF-8") + "&sensor=true";
    URL url = new URL(api);
    HttpURLConnection httpConnection = (HttpURLConnection)url.openConnection();
    httpConnection.connect();
    responseCode = httpConnection.getResponseCode();
    if(responseCode == 200)
    {
      DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();;
      Document document = builder.parse(httpConnection.getInputStream());
      XPathFactory xPathfactory = XPathFactory.newInstance();
      XPath xpath = xPathfactory.newXPath();
      XPathExpression expr = xpath.compile("/GeocodeResponse/status");
      String status = (String)expr.evaluate(document, XPathConstants.STRING);
      if(status.equals("OK"))
      {
         expr = xpath.compile("//geometry/location/lat");
         String latitude = (String)expr.evaluate(document, XPathConstants.STRING);
         expr = xpath.compile("//geometry/location/lng");
         String longitude = (String)expr.evaluate(document, XPathConstants.STRING);
         return new String[] {latitude, longitude};
      }
      else
      {
         throw new Exception("Error from the API - response status: "+status);
      }
    }
    return null;
  }
    
    
    
//    public static String getCordinates(String address,String county) throws IOException, ParserConfigurationException, SAXException{
//    String thisLine;
//
//    address = address.replace(",", "+");
//    address = address.replace(" ", "+");
//    county = county.replace(" ", "");
//
//    String fullAddress = address+"+"+county;
//    System.out.println(fullAddress);
//
//    URL url = new URL("http://maps.google.com/maps/geo?q="+fullAddress+"&output=xml&key=ABQIAAAANGTAqDyDam_07aWkklK2NBSD41w" +
//            "X8VhCBpuiDVjGbFNuXE31lhQB8Gkwy-wmYbmaHIbJtfnlR9I_9A");
//
//    BufferedReader theHTML = new BufferedReader(new InputStreamReader(url.openStream()));
//
//    FileWriter fstream = new FileWriter("url.xml");
//    BufferedWriter out = new BufferedWriter(fstream);
//    while ((thisLine = theHTML.readLine()) != null)
//        out.write(thisLine);
//    out.close();
//
//    File file = new File("url.xml");
//    DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
//    DocumentBuilder db = dbf.newDocumentBuilder();
//    Document doc = db.parse(file);
//    doc.getDocumentElement().normalize();
//    NodeList nl = doc.getElementsByTagName("code");
//    Element n = (Element)nl.item(0);
//    String st = n.getFirstChild().getNodeValue();
//
//    if (st.equals("200"))
//    {
//        NodeList n2 = doc.getElementsByTagName("coordinates");
//        Element nn = (Element)n2.item(0);
//        String st1 = nn.getFirstChild().getNodeValue();
//
//
//        return st1;
//    }
//    else
//    {
//        return null;
//    }
//
//
//}
}
