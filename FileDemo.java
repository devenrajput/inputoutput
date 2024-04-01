package inputoutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.JOptionPane;

public class FileDemo {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Shiley\\Desktop\\myfile.txt", false);
            // String s = "My name is Devendra Kumar";
            String s = JOptionPane.showInputDialog(null, "Enter your text..");// user input
            byte b[] = s.getBytes();// convert string into byte
            for (int i = 0; i < b.length; i++) {
                System.out.print(b[i] + " "); // print character unicode value
                fileOutputStream.write(b[i]);// write character one by one in file
            }
            // fileOutputStream.write(b);//this method get to byte type array

            System.out.println();
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Shiley\\Desktop\\myfile.txt");

            while (true) {
                int i = fileInputStream.read();// this method return integer value
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
