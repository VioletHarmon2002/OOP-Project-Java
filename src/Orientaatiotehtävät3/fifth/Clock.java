package Orientaatiotehtävät3.fifth;

public class Clock {
    private static Clock instance;
    private long currentTime;

    private Clock() {

        currentTime = 0;
    }

    public static Clock getInstance() {
        if (instance == null) {
            instance = new Clock();
        }
        return instance;
    }

    public void setTime(long newTime) {
        currentTime = newTime;
    }

    public long getTime() {
        return currentTime;
    }
}
