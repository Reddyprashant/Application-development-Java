/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.LatLong;
import javax.swing.ImageIcon;

/**
 *
 * @author Administrator
 */
public class ShelterWorkRequest extends WorkRequest{
    private ImageIcon image;
    private LatLong latLong;
    
    public ShelterWorkRequest(){
       image= new ImageIcon();
       latLong=new LatLong();
    }

    public ImageIcon getImage() {
        return image;
    }

    public void setImage(ImageIcon image) {
        this.image = image;
    }

    public LatLong getLatLong() {
        return latLong;
    }

    public void setLatLong(LatLong latLong) {
        this.latLong = latLong;
    }
    
   

   
}
