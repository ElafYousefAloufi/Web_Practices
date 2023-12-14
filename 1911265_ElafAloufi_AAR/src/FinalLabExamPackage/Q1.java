package FinalLabExamPackage;

/*
 * Name: Elaf Yousef Aloufi 
 * ID: 1911265
 * Section: AAR
 */

import cpit380practice.*;
import java.awt.*;

public class Q1 {

    public static void main(String[] args) {

        String file = "redMotorcycle.jpg";
        Picture pic = new Picture(file);

        int width = pic.getWidth();
        int height = pic.getHeight();
        int red, green, blue;
        int avg;
        
        for (int i = 0; i < width / 2; i++) {

            for (int j = 0; j < height / 2; j++) {
                red = pic.getPixel(i, j).getRed();
                green = pic.getPixel(i, j).getGreen();
                blue = pic.getPixel(i, j).getBlue();
                avg = (red + green + blue) / 3;
                if (avg < 85) {
                    pic.getPixel(i, j).setColor(Color.green);
                } else if (avg < 170) {
                    pic.getPixel(i, j).setColor(Color.red);
                } else {
                    pic.getPixel(i, j).setColor(Color.BLACK);
                }
            }
        }

        for (int i = width / 2; i < width; i++) {
            for (int j = height / 2; j < height; j++) {
                // pic.getPixel(i, j).setColor(new Color(pic.getPixel(i, j).getRed()* 0.3, pic.getPixel(i, j).getGreen() * 0.3, pic.getPixel(i, j).getBlue() * 0.3));
                pic.getPixel(i, j).setRed((int) (pic.getPixel(i, j).getRed() * 0.3));
                pic.getPixel(i, j).setGreen((int) (pic.getPixel(i, j).getGreen() * 0.3));
                pic.getPixel(i, j).setBlue((int) (pic.getPixel(i, j).getBlue() * 0.3));

            }
        }
        pic.show();
    }
}
