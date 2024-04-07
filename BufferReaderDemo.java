package inputoutput;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderDemo {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
       BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
       System.out.println("What is your job titel ?");
       String s = bufferedReader.readLine();
       System.out.println(s);
    }
}
