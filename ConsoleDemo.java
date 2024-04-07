package inputoutput;

import java.io.Console;

public class ConsoleDemo {
    public static void main(String[] args) {
       Console cons= System.console();
       String string=cons.readLine("Enter your name: ");
      char ch[]= cons.readPassword("%s","Enter Password: ");
      String str = new String(ch);
      System.out.println(string);
      System.out.println(str);
    }
}
