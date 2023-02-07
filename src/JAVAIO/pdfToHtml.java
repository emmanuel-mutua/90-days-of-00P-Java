package JAVAIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class pdfToHtml {
    public static void main(String[] args) {
        //get the input from the file
        byte [] fileBytes = new byte[1000];
        try{
            InputStream input = new FileInputStream("new.docx");
            input.read(fileBytes);
            String data = new String(fileBytes);
            System.out.println("data" + data);
        }catch (Exception e){
            e.getStackTrace();
        }

        //convert to html
        try{
            OutputStream out = new FileOutputStream("note.html");
            out.write(fileBytes);
            System.out.println("Successfully converted");
        }catch (Exception e){
            e.getStackTrace();
        }
    }
}
