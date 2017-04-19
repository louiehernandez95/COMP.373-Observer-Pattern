import java.util.ArrayList;

public class Order implements Subject {

    private ArrayList<Observer> OrderObservers = new ArrayList<Observer>();
    private int price;
    String name;

    public Order(String name, int price) {
        this.price=price;
        this.name = name;
    }

    @Override
    public void addObserver(Observer orderObserver) {
        OrderObservers.add(orderObserver);
    }

    @Override
    public void removeObserver(Observer orderObserver) {
        OrderObservers.remove(orderObserver);
    }

    @Override
    public void sendNotification() {
        for(Observer observer : OrderObservers) {
            observer.update();
        }
    }

    public void setPrice(int newPrice) {
        System.out.println("\nCompany " + name + " is setting the price to $" + newPrice + ".\n");
        price= newPrice;
        sendNotification();
    }
    public int getPrice() {
        return price;
    }
}