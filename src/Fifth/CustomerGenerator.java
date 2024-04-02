package Fifth;

public class CustomerGenerator {
    public static void main(String[] args) {
        ServicePoint servicePoint = new ServicePoint();
        int numCustomers = 5;


        for (int i = 0; i < numCustomers; i++) {
            servicePoint.addToQueue(new Customer());
        }

        try {
            servicePoint.serve();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
