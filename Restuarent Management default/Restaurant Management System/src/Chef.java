import java.util.List;

public class Chef {
    private List<String> menuItems;

    public Chef(List<String> menuItems) {
        this.menuItems = menuItems;
    }

    Chef() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void prepareOrder(Order order) {
        System.out.println("Preparing order:");
        for (String item : order.getItems()) {
            if (menuItems.contains(item)) {
                System.out.println("Preparing: " + item);
                // Logic to prepare the item
            } else {
                System.out.println("Item not available: " + item);
                // Logic to handle unavailable item
            }
        }
        System.out.println("Order prepared.");
    }

    public void receiveOrder(Order order) {
        System.out.println("Order received: " + order);
    }

    public void modifyMenu(List<String> newMenuItems) {
        this.menuItems = newMenuItems;
        System.out.println("Menu modified successfully.");
    }
}







