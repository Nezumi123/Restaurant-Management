/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sanjana S Palan
 */
public class RestaurantManagementSystem {
     public static void main(String[] args) {
        // Example usage of the classes
        MenuItem menuItem1 = new MenuItem("Burger", 9.99);
        MenuItem menuItem2 = new MenuItem("Pizza", 12.99);

        Menu menu = new Menu();
        menu.addItem(menuItem1);
        menu.addItem(menuItem2);

        Customer customer = new Customer(1, "Samiksha", "1234");
        customer.setName("John Doe");
        customer.setPhoneNumber("1234567890");

        Table table = new Table();
        table.setNumber(1);

        Waiter waiter = new Waiter();

        Order order = new Order(customer, table, waiter);
        order.addItem(menuItem1);
        order.addItem(menuItem2);


       

        waiter.serveOrder(order);

        Bill bill = new Bill(order);
        double totalBill = bill.calculateTotal();
        System.out.println("Total Bill: $" + totalBill);
     }
}
