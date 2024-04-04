package inputoutput;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class DataIO {

    @SuppressWarnings("resource")
    public static void main(String[] args) {

        try {

            Scanner scanner = new Scanner(System.in);

            FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Shiley\\Desktop\\myfile.txt", false);

            DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);

            System.out.print("Enter a Integer value for perform the write operation on file: ");
            int x = scanner.nextInt();

            Timer.startTime();
            dataOutputStream.writeInt(x);
            Timer.endTime();
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Shiley\\Desktop\\myfile.txt");
            DataInputStream dataInputStream = new DataInputStream(fileInputStream);
            System.out.println(dataInputStream.readInt());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}