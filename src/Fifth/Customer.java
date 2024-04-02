package Fifth;

public class Customer {
    private static int nextId = 1;
    private int id;
    private long arrivalTime;

    public Customer() {
        this.id = nextId++;
        this.arrivalTime = System.currentTimeMillis();
    }

    public int getId() {
        return id;
    }

    public long getArrivalTime() {
        return arrivalTime;
    }
}
