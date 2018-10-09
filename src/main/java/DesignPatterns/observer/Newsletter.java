package DesignPatterns.observer;

public class Newsletter {
    public static void main(String[] args) {
        Subject subject = new MediaMarkt();
        Observer customer1 = new Customer("Pierwszy");
        Observer customer2 = new Customer("Drugi");
        Observer customer3 = new Customer("Trzeci");
        customer1.register(subject);
        customer2.register(subject);
        customer3.register(subject);
        subject.notify("wiadomość testowa");
        System.out.println("-----------------------------");
        customer2.unregister(subject);
        subject.notify("Druga wiadomość testowa");

    }
}
