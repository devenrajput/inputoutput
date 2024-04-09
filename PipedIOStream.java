package inputoutput;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedIOStream {

    public static void main(String[] args) throws Exception {
        PipedOutputStream pipedOutputStream = new PipedOutputStream();
        PipedInputStream pipedInputStream = new PipedInputStream();
        pipedOutputStream.connect(pipedInputStream);

        PipOutStream pipOutStream = new PipOutStream(pipedOutputStream);
        PipInputStream pipInputStream = new PipInputStream(pipedInputStream);

        Thread thread1 = new Thread(pipOutStream);
        Thread thread2 = new Thread(pipInputStream);

        thread1.start();
        thread2.start();
    }

}

class PipOutStream implements Runnable {

    PipedOutputStream pipedOutputStream = null;

    PipOutStream(PipedOutputStream pipedOutputStream) {
        this.pipedOutputStream = pipedOutputStream;
    }

    @Override
    public void run() {
        for (int i = 65; i < 91; i++) {
            try {
                pipedOutputStream.write(i);
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}

class PipInputStream implements Runnable {

    PipedInputStream pipedInputStream = null;

    PipInputStream(PipedInputStream pipedInputStream) {
        this.pipedInputStream = pipedInputStream;
    }

    @Override
    public void run() {
        int z = 0;
        for (int i = 65; i < 91; i++) {
            try {
                z = pipedInputStream.read();
                System.out.print((char)z+" ");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}