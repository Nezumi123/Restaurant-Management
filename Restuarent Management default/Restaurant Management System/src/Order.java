import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<MenuItem> items;
    private Customer customer;
    private Table table;
    private Waiter waiter;

    public Order(Customer customer, Table table, Waiter waiter) {
        this.customer = customer;
        this.table = table;
        this.waiter = waiter;
        this.items = new ArrayList<>();
    }

    public void addItem(MenuItem menuItem) {
        items.add(menuItem);
    }

    public void displayOrderToChef() {
        System.out.println("Order for Table " + table.getTableNumber() + ":");
        System.out.println("Customer: " + customer.getName());
        System.out.println("Waiter: " + waiter.getName());
        System.out.println("Items:");
        for (MenuItem item : items) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
        System.out.println("----------");
    }
}
