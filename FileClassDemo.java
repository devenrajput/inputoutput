package inputoutput;

import java.io.File;

public class FileClassDemo {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Shiley\\Desktop\\dev");
        // boolean b = file.isDirectory(); //if directory is exist or not
        // System.out.println(b);
        System.out.println(file.getAbsolutePath());
        System.out.println(file.exists());
        File file1File = new File("C:\\Users\\Shiley\\Desktop\\System");
        if (!file1File.exists()) {
            file1File.mkdir();
        }
        else{
            System.out.println("File exists..");
        }
        System.out.println(file1File.exists());
        File arr[] = file.listFiles();

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getName());
        }

    }
}
