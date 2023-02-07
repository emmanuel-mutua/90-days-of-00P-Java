package JAVAIO;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class outputStream {
    public static void main(String[] args) {
        String data = "This is the data of the file, make sure that you read the content carefully, and then meditate";
        try{
            OutputStream out = new FileOutputStream("input.txt");
            //convert the string into bytes
            byte [] dataBytes = data.getBytes();

            //WRITE TO THE FILE
            out.write(dataBytes);
            System.out.println("Writing data ...");
            out.close();
            System.out.println("data Written");
        }catch (Exception e){
            e.getStackTrace();
        }
    }
}
