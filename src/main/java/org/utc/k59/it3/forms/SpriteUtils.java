package org.utc.k59.it3.forms;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SpriteUtils {
    public static BufferedImage loadImage(String url) {
        try {
            return ImageIO.read(new File(url));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static ArrayList<BufferedImage> loadImages(String dirPath){
        ArrayList<BufferedImage> images = new ArrayList<>();
        try{
            File directony = new File(dirPath);
            java.util.List<String> fileNames = Arrays.asList(directony.list());
            Collections.sort(fileNames, new Comparator<String>() {

                @Override
                public int compare(String o1, String o2) {
                    return o1.compareTo(o2);
                }
            });
            for (String fileName : fileNames) {
                images.add(loadImage(dirPath + "/" + fileName));
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return images;
    }
}
