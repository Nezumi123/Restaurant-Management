import java.util.HashMap;
import java.util.Map;

public class MenuItem {
    private int id;
    private String name;
    private double price;

    private static Map<String, Double> menuItems = new HashMap<>(); // Static map to hold menu items and their prices

    // Static method to add menu items to the menu (accessible only to the chef)
    public static void addMenuItem(String itemName, double itemPrice) {
        menuItems.put(itemName, itemPrice);
    }

    // Static method to remove menu items from the menu (accessible only to the chef)
    public static void removeMenuItem(String itemName) {
        menuItems.remove(itemName);
    }

    // Static method to display the menu (accessible only to the chef)
    public static void displayMenu() {
        System.out.println("Menu:");
        for (Map.Entry<String, Double> entry : menuItems.entrySet()) {
            System.out.println(entry.getKey() + " - $" + entry.getValue());
        }
    }

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getters and setters (if needed)
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
