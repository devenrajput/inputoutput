package inputoutput;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class ByteArrayIO {
    public static void main(String[] args) {

        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Shiley\\Desktop\\myfile.txt", false);

            String s = "My name is Diwakar Rajput";
            Timer.startTime();
            byte b[] = s.getBytes();
            byteArrayOutputStream.write(b);
            byteArrayOutputStream.writeTo(fileOutputStream);
            Timer.endTime();

            byte ba[] = byteArrayOutputStream.toByteArray();
            /*
             * The ByteArrayInputStream constructor get buffer array
             */

            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(ba);

            while (true) {
                int i = byteArrayInputStream.read();// this method return integer value
                if (i == -1) {
                    break;
                }
                System.out.print((char) i);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
