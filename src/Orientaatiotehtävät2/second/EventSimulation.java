package Orientaatiotehtävät2.second;

import java.util.PriorityQueue;

class Event implements Comparable<Event> {
    private int eventTime;

    public Event(int eventTime) {
        this.eventTime = eventTime;
    }

    public Event() {

    }

    public int getEventTime() {
        return eventTime;
    }

    @Override
    public int compareTo(Event other) {
        return Integer.compare(this.eventTime, other.eventTime);
    }
}

// EventList class
class EventList {
    private PriorityQueue<Event> eventQueue;

    public EventList() {
        eventQueue = new PriorityQueue<>();
    }

    public void addEvent(Event event) {
        eventQueue.add(event);
    }

    public Event getNextEvent() {
        return eventQueue.poll();
    }

    public boolean isEmpty() {
        return eventQueue.isEmpty();
    }
}

public class EventSimulation {
    public static void main(String[] args) {

        EventList eventList = new EventList();
        eventList.addEvent(new Event(10));
        eventList.addEvent(new Event(5));
        eventList.addEvent(new Event(8));

        Event firstEvent = eventList.getNextEvent();
        System.out.println("Removed event: Time - " + firstEvent.getEventTime());


        System.out.println("Remaining events:");
        while (!eventList.isEmpty()) {
            Event event = eventList.getNextEvent();
            System.out.println("Time - " + event.getEventTime());
        }
    }
}
