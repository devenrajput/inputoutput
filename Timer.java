package inputoutput;

public class Timer {
    static long endTime, startTime;

    public static void endTime() {
        endTime = System.nanoTime();
        System.out.println("Total time = " + (endTime - startTime));
    }

    public static void startTime() {
        startTime = System.nanoTime();
    }

}
