package kr.ac.jbnu.rpicam;

import kr.ac.jbnu.rpicam.RPiCamera;

import kr.ac.jbnu.rpicam.enums.Exposure;
// import kr.ac.jbnu.rpicam.enums.AWB;
// import kr.ac.jbnu.rpicam.enums.DRC;
// import kr.ac.jbnu.rpicam.enums.Encoding;

import kr.ac.jbnu.rpicam.exceptions.FailedToRunRaspistillException;

import java.io.IOException;
import java.util.Scanner;

// import org.opencv.core.Core;
// import org.opencv.core.Cytype;
// import org.opencv.core.Mat;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        RPiCamera rPiCamera = null;

        try {

            rPiCamera = new RPiCamera("/home/pi/Pictures");
            rPiCamera.setTimeout(3000); // 3second

            if (rPiCamera != null) {
                System.out.println("Image name: ");
                rPiCamera.takeStill(s.nextLine());
            }
            // else {
            // System.out.println("---- null -----");
            // } // null no -> useless
        } catch (FailedToRunRaspistillException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        } catch (InterruptedException e) {

            e.printStackTrace();

        }

    }

    public static void PiSet(RPiCamera piCamera) {
        // piCamera.setAWB(AWB.AUTO) // Change Automatic White Balance setting to
        // automatic
        // .setDRC(DRC.OFF) // Turn off Dynamic Range Compression
        // .setContrast(100) // Set maximum contrast
        // .setSharpness(100) // Set maximum sharpness
        // .setQuality(100) // Set maximum quality
        // .setTimeout(1000)
        // .turnOnPreview() // Turn on image preview
        // .setEncoding(Encoding.PNG); // Change encoding of images to PNG
        // Take 10 650x650 still images, waiting 1 second between each capture.
        // Save images as "/home/pi/Desktop/<frame_count>Timelapse Image.png"
        // picture setting
    }

}