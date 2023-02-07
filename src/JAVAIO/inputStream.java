package JAVAIO;

import java.io.FileInputStream;;
import java.io.IOException;
import java.io.InputStream;

public class inputStream {
    public static void main(String[] args) {
        System.out.println("input stream starting ...");
        byte [] array = new byte[100];
        try {
            InputStream input = new FileInputStream("input.txt");
            System.out.println("Available bytes in the file = " + input.available());

            input.read(array);
            System.out.println("Reading data from the file ...");

            //convert the byte array into string
            String data = new String(array);
            System.out.println("data: " + data);

            //close the input stream
            input.close();

        } catch (IOException e) {
           e.getStackTrace();
        }
    }


}
