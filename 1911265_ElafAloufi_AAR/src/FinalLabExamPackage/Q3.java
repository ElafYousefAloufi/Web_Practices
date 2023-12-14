package FinalLabExamPackage;

/*
 * Name: Elaf Yousef Aloufi 
 * ID: 1911265
 * Section: AAR
 */

import cpit380practice.*;
import java.awt.*;

public class Q3 {

    public static void main(String[] args) {
        String directory = "Frames";
        FrameSequencer fc = new FrameSequencer(directory);
        int framesPerSec = 30;
        Picture pic = null;
        Graphics graph = null;

        for (int i = 0; i <= 100; i++) {
            pic = new Picture(450, 450);
            graph = pic.getGraphics();
            graph.setColor(Color.blue);
            graph.fillOval(i * 2, i * 2, 50, 50);

            graph.setColor(Color.red);
            graph.fillOval(160, i * 5, 50 + i, 50 + i);

            fc.addFrame(pic);
        }

        fc.play(framesPerSec);
    }

}
