package clock;

public class Clock {
    public static int Past(int h, int m, int s) {

        return 3600000 * h + 60000 * m + 1000 * s;
    }
}
