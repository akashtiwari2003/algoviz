
package algoviz;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class algovizFunctions {
public void setBackground(String s, JLabel j){
ImageIcon img = new ImageIcon(getClass().getResource(s));
Image im = img.getImage();
Image fin = im.getScaledInstance(j.getWidth(), j.getHeight(), Image.SCALE_DEFAULT);
ImageIcon background_img = new ImageIcon(fin);
j.setIcon(background_img);
    }    
}
