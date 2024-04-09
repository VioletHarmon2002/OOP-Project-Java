package Orientaatiotehtävät2.third;

import java.util.PriorityQueue;

enum EventType {
    ARRIVAL, EXIT
}


class Event implements Comparable<Event> {
    private int eventTime;
    private EventType eventType;


    public Event(int eventTime, EventType eventType) {
        this.eventTime = eventTime;
        this.eventType = eventType;
    }

    public int getEventTime() {
        return eventTime;
    }

    public EventType getEventType() {
        return eventType;
    }


    public int compareTo(Event other) {
        return Integer.compare(this.eventTime, other.eventTime);
    }
}


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

class EventSimulation {
    public static void main(String[] args) {

        EventList eventList = new EventList();
        eventList.addEvent(new Event(10, EventType.ARRIVAL)); // Example: Arrival event
        eventList.addEvent(new Event(5, EventType.ARRIVAL));  // Example: Arrival event
        eventList.addEvent(new Event(8, EventType.EXIT));     // Example: Exit event

        Event firstEvent = eventList.getNextEvent();
        System.out.println("Removed event: Time - " + firstEvent.getEventTime() + ", Type - " + firstEvent.getEventType());

        System.out.println("Remaining events:");
        while (!eventList.isEmpty()) {
            Event event = eventList.getNextEvent();
            System.out.println("Time - " + event.getEventTime() + ", Type - " + event.getEventType());
        }
    }
}
