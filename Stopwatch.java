package RestaurantProject;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Stopwatch {
    private static int interval;
    private static Timer timer;
    private static int easy=50;
    private static int medium=30;
    private static int hard=25;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input difficulty => : ");
        String secs = sc.nextLine();
        if(secs.equalsIgnoreCase("easy"))
        {
            interval=easy;
        }
        else if(secs.equalsIgnoreCase("medium"))
        {
            interval=medium;
        }
        else if(secs.equalsIgnoreCase("hard"))
        {
            interval=hard;
        }
        else
        {
            interval=medium;
        }
        int delay = 1000;
        int period = 1000;
        timer = new Timer();
        System.out.println(secs);
        timer.scheduleAtFixedRate(new TimerTask() {

                public void run() {
                    System.out.println(setInterval());

                }
            }, delay, period);
    }

    private static final int setInterval() {
        if (interval == 1)
            timer.cancel();
        return --interval;
    }
}