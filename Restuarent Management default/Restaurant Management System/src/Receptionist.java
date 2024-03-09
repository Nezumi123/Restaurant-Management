import java.util.ArrayList;
import java.util.List;

public class Receptionist {
    private List<Reservation> reservationHistory; // To keep track of reservation activities

    public Receptionist() {
        this.reservationHistory = new ArrayList<>();
    }

    public void makeReservation(Customer customer, Table table) {
        // Logic to make a reservation
        Reservation reservation = new Reservation(customer, table);
        reservationHistory.add(reservation); // Add the reservation to history
    }
    
    public void cancelReservation(Reservation reservation) {
        // Logic to cancel a reservation
        reservationHistory.remove(reservation); // Remove the reservation from history
    }

    // Additional method to display reservation history (if needed)
    public void displayReservationHistory() {
        System.out.println("Reservation History:");
        for (Reservation reservation : reservationHistory) {
            System.out.println(reservation); // Assuming Reservation class has proper toString() method
        }
    }
}
