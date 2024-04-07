package inputoutput;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterAndReader {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\Shiley\\Desktop\\dev\\a.txt", false);
            String s = "Hii..";
            fileWriter.write(s);
            fileWriter.flush();
            fileWriter.close();
            FileReader fileReader = new FileReader("C:\\Users\\Shiley\\Desktop\\dev\\a.txt");
            while (true) {
                int i = fileReader.read();
                if (i == -1) {
                    break;
                }
                System.out.print((char) i);
            }
            
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
