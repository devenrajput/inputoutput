package inputoutput;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class PrintStreamDemo {
    public static void main(String[] args) {

        OutputStream outputStream = null;
        PrintStream printStream = null;
        try {

            outputStream = new FileOutputStream("C:\\Users\\Shiley\\Desktop\\docmyfile.txt");
            printStream = new PrintStream(outputStream);
            // printStream.println("hello..");//write the data on file
            System.setOut(printStream);
            System.setErr(printStream);
            /*
             * This method help us to write the data frome System.out.println();
             * statement on directly file.
             */
            System.out.print("My name is ");
            System.out.println("Sashank Rajput");
            System.err.print("Dev is a good boy.");// err variable create for print the error massage

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                outputStream.close();
                printStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }
}
