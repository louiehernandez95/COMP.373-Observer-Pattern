/**
 * Created by louie on 4/15/2017.
 */
class IndivCustomer implements Observer {
    private final String name;
    private final Order order;
    private int currentPrice;

    public IndivCustomer(String name, Order order) {
        this.name = name;
        this.order = order;
        this.currentPrice = order.getPrice();
    }

    @Override
    public void update() {
        currentPrice = order.getPrice();
        System.out.println("Individual customer " + name + ", received a notification. " +
                "The current price is set to $" + currentPrice + ".");
    }
}
