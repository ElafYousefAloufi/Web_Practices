package FinalLabExamPackage;

/*
 * Name: Elaf Yousef Aloufi 
 * ID: 1911265
 * Section: AAR
 */

import cpit380practice.*;
import java.io.*;

public class Q2 {

    public static void main(String[] args) {

        try {
            File file = new File("FianLabExam_Q2.html");
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));

            bw.write("<html>");

            bw.write("<head>");
            bw.write("<title> Final Lab Exam Q2 </title>");
            bw.write("</head>");

            bw.write("<body>");
            
            bw.write("<h1> <big> <b> Search Engines </b> </big> </h1>");
            bw.newLine();
            
            bw.write("<p> <b> <big> A search engine </big> </b> is a software system that is designed to carry out web searches. </p>");
            bw.newLine();
            
            bw.write("<h2> <b> Some Examples: </b> </h2>");
            bw.newLine();
            
            bw.write("<ul>");
            bw.write("<li> <a href= \"https://www.google.com.sa/?hl=ar\" target=\"_blank\"> Google </a> </li>");
            bw.write("<li> <a href= \"https://sg.yahoo.com/\" target=\"_blank\"> Yahoo </a> </li>");
            bw.write("</ul>");
            
            bw.write("</body>");

            bw.write("</html>");
            
            bw.close();
        } catch (IOException ex) {
            SimpleOutput.showError("***IO Exception***");
        }
    }
}
