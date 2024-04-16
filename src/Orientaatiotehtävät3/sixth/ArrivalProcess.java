package Orientaatiotehtävät3.sixth;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

enum EventType {
    ARRIVAL, DEPARTURE
}

class Event {
    private EventType type;
    private int arrivalTime;

    public Event(EventType type, int arrivalTime) {
        this.type = type;
        this.arrivalTime = arrivalTime;
    }

    public EventType getType() {
        return type;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    @Override
    public String toString() {
        return "Event{" +
                "type=" + type +
                ", arrivalTime=" + arrivalTime +
                '}';
    }
}

class ArrivalProcess {
    private EventType eventType;
    private Random random;

    public ArrivalProcess(EventType eventType, Random random) {
        this.eventType = eventType;
        this.random = random;
    }

    public void generateArrivalEvents(List<Event> eventList, int numberOfEvents) {
        for (int i = 0; i < numberOfEvents; i++) {

            int arrivalInterval = generateRandomInterval();

            Event event = new Event(eventType, arrivalInterval);

            eventList.add(event);
        }
    }

    private int generateRandomInterval() {

        return random.nextInt(10) + 1;
    }
}

class ArrivalProcessTest {
    public static void main(String[] args) {

        List<Event> eventList = new ArrayList<>();

        ArrivalProcess arrivalProcess = new ArrivalProcess(EventType.ARRIVAL, new Random());

        arrivalProcess.generateArrivalEvents(eventList, 10);

        System.out.println("Event List:");
        for (Event event : eventList) {
            System.out.println(event);
        }
    }
}
