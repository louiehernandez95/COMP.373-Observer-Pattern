/**
 * Created on 4/15/2017.
 */
public class Main
{
    public static void main( String[] args ) {
        System.out.println("*** Company EL Barto that sells U.S. kegs for $200 has been created. ***");
        Order order = new  Order("El Barto", 200);
        IndivCustomer inCustomer1 = new IndivCustomer("Louie", order);
        IndivCustomer inCustomer2 = new IndivCustomer("Adil", order);

        System.out.println("*** New customers, Louie and Adil, have just initialized a monthly order to El Barto. ***");
        order.addObserver(inCustomer1);
        order.addObserver(inCustomer2);
        order.setPrice(225);

        System.out.println("\n*** Customer Adil has cancelled his order from El Barto. ***");
        order.removeObserver(inCustomer2);
        order.setPrice(185);

        GroupCustomer gCustomer = new GroupCustomer("Sigma Lamda Gamma", order);
        System.out.println("\n*** Sigma Lamda Gamma has just initialiazd a monthly order to El Barto. ***");
        order.addObserver(gCustomer);
        order.setPrice(175);
    }
}
