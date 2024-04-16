package Orientaatiotehtävät3.fifth;

public class ClockTest {
    public static void main(String[] args) {

        Clock clock = Clock.getInstance();

        clock.setTime(10 * 60 * 60 * 1000);
        long currentTime = clock.getTime();
        System.out.println("Current time: " + currentTime);
    }
}
