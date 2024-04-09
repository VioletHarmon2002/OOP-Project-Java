package Orientaatiotehtävät1.First.Fifth;

import java.util.LinkedList;
import java.util.Queue;

public class ServicePoint {
    private Queue<Customer> queue;

    public ServicePoint() {
        this.queue = new LinkedList<>();
    }

    public void addToQueue(Customer customer) {
        queue.offer(customer);
    }

    public void serve() throws InterruptedException {
        while (!queue.isEmpty()) {
            Customer customer = queue.poll();
            long startTime = System.currentTimeMillis();
            int serviceTime = (int) (Math.random() * 5000) + 1000;
            Thread.sleep(serviceTime);
            long endTime = System.currentTimeMillis();

            long responseTime = endTime - customer.getArrivalTime();
            long serviceDuration = endTime - startTime;

            System.out.println("Customer " + customer.getId() + " served. Response Time: " + responseTime +
                    " milliseconds, Service Time: " + serviceDuration + " milliseconds");
        }
    }
}
