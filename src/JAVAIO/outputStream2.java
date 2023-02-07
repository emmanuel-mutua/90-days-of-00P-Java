package JAVAIO;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class outputStream2 {
    public static void main(String[] args) {
        String data = "<h1> this is the heading one of the html heads</h1>";
        System.out.println("Starting output stream ...");

        try{
            OutputStream out = new FileOutputStream("index.html");
            byte [] dataByte = data.getBytes();
            System.out.println("Writing data ...");
            out.write(dataByte);
            System.out.println("Done writing.");
        }catch (Exception e){
            e.getStackTrace();
        }
    }
}
