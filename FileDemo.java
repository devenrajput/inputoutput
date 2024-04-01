package inputoutput;

import java.io.FileOutputStream;

public class FileDemo {

    public static void main(String[] args) {
        try {
            @SuppressWarnings("resource")
            FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Shiley\\Desktop\\myfile.txt", true);
            String s = "My name is Devendra Kumar";
            byte b[] = s.getBytes();// convert string into byte
            for (int i = 0; i < b.length; i++) {
                System.out.print(b[i] + " "); // print character unicode value
                fileOutputStream.write(b[i]);// write character one by one in file
            }
            // fileOutputStream.write(b);//this method get to byte type array
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
