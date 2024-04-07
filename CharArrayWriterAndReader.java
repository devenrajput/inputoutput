package inputoutput;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CharArrayWriterAndReader {
    public static void main(String[] args) throws IOException {
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        FileWriter fileWriter1 = new FileWriter("C:\\Users\\Shiley\\Desktop\\dev\\a1.txt", false);
        FileWriter fileWriter2 = new FileWriter("C:\\Users\\Shiley\\Desktop\\dev\\a2.txt", false);
        FileWriter fileWriter3 = new FileWriter("C:\\Users\\Shiley\\Desktop\\dev\\a3.txt", false);
        FileWriter fileWriter4 = new FileWriter("C:\\Users\\Shiley\\Desktop\\dev\\a4.txt", false);

        String s = "My name is Devendra Kumar";
        charArrayWriter.write(s);
       charArrayWriter.writeTo(fileWriter1);
       charArrayWriter.writeTo(fileWriter2);
       charArrayWriter.writeTo(fileWriter3);
       charArrayWriter.writeTo(fileWriter4);
       fileWriter1.close();
       fileWriter2.close();
       fileWriter3.close();
       fileWriter4.close();
       charArrayWriter.close();

       CharArrayReader charArrayReader = new CharArrayReader(charArrayWriter.toCharArray());

       int i;

       while ((i=charArrayReader.read()) != -1) {
         System.out.print((char)i);
       }


       charArrayReader.close();
    }
}
