package inputoutput;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BuffereadIO {

    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Shiley\\Desktop\\myfile.txt", false);

            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            String s = "My name is Amit Kumar";
            byte b[] = s.getBytes();

            Timer.startTime();
            bufferedOutputStream.write(b);
            bufferedOutputStream.flush(); // Make sure all buffered data is written to the file
            Timer.endTime();

            BufferedInputStream bufferedInputStream = new BufferedInputStream(
                    new FileInputStream("C:\\Users\\Shiley\\Desktop\\myfile.txt"));
            while (true) {
                int i = bufferedInputStream.read();
                if (i == -1) {
                    break;
                }
                System.out.print((char) i);
            }
            // Closing streams
            bufferedOutputStream.close();
            bufferedInputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
