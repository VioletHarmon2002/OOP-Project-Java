package Orientaatiotehtävät1.First.Third;

public class TestCustomer { public static void main(String[] args) {

    Customer customer1 = new Customer();
    Customer customer2 = new Customer();


    customer1.setEndTime(customer1.getStartTime() + 5000);
    customer2.setEndTime(customer2.getStartTime() + 7000);


    System.out.println("Time spent by Customer " + customer1.getId() + ": " + customer1.getTimeSpent() + " milliseconds");
    System.out.println("Time spent by Customer " + customer2.getId() + ": " + customer2.getTimeSpent() + " milliseconds");
}
}
