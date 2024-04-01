package inputoutput;

import java.io.FileInputStream;
import java.io.SequenceInputStream;

public class SequenceIO {

    public static void main(String[] args) {

        try {
            FileInputStream fileInputStream1 = new FileInputStream("C:\\Users\\Shiley\\Desktop\\f1.txt");
            FileInputStream fileInputStream2 = new FileInputStream("C:\\Users\\Shiley\\Desktop\\f2.txt");
            SequenceInputStream sequenceInputStream = new SequenceInputStream(fileInputStream1, fileInputStream2);

            while (true) {
                int i = sequenceInputStream.read();
                if (i == -1) {
                    break;
                }
                System.out.print((char) i);
            }

            fileInputStream1.close();
            fileInputStream2.close();
            sequenceInputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
