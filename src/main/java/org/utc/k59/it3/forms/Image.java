package org.utc.k59.it3.forms;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Image extends JPanel {
    BufferedImage aboutUs;
    public Image(){
        aboutUs = SpriteUtils.loadImage("img/rsz_maxresdefault.jpg");
    }

    @Override
    public void paint(Graphics g) {
        g.drawImage(aboutUs,0,0,null);
    }
}
