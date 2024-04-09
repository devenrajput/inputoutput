package inputoutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.DeflaterOutputStream;

public class Compress {

    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {

        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        DeflaterOutputStream deflaterOutputStream = null;

        try {
            fileInputStream = new FileInputStream("D:\\GitDemo\\inputoutput\\PipedIOStream.java");

            fileOutputStream = new FileOutputStream(
                    "C:\\Users\\Shiley\\Desktop\\System\\PipedIOStreamCopied.java");

            deflaterOutputStream = new DeflaterOutputStream(fileOutputStream);

        } catch (Exception e) {
            e.printStackTrace();
        }

        int i = 0;
        while (true) {
            i = fileInputStream.read();
            if (i == -1) {
                break;
            }
            deflaterOutputStream.write((byte) i);
            deflaterOutputStream.flush();
        }
    }
}
