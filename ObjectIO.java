package inputoutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectIO {

    @SuppressWarnings("resource")
    public static void main(String[] args) throws IOException {
        ObjectOutputStream objectOutputStream = null;
        ObjectInputStream objectInputStream = null;

        try {
            objectOutputStream = new ObjectOutputStream(
                    new FileOutputStream("C:\\Users\\Shiley\\Desktop\\myfile.txt"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        Emp emp = new Emp("Devendra Kumar", 19, 1122);

        objectOutputStream.writeObject(emp);
        objectOutputStream.flush();
        objectOutputStream.close();

        try {
            objectInputStream = new ObjectInputStream(new FileInputStream("C:\\Users\\Shiley\\Desktop\\myfile.txt"));
           Emp ep=(Emp) objectInputStream.readObject();
           System.out.println(ep.name+"\n"+ep.age+"\n"+ep.id);
        } catch (Exception e) {
            e.printStackTrace();
        }

       
       

    }

}
