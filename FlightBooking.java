//Llena Earl Laurence A
//Final chall no.5


import java.util.Scanner;

class NoSeatsAvailableException extends Exception {
  
    public NoSeatsAvailableException(String message) {
        super(message); 
    }
}

// represent a flight and manage bookings
class Flight {
    private int availableSeats; // Number of seats currently available

    public Flight(int totalSeats) {
        this.availableSeats = totalSeats; // Set the number of available seats
    }

    // Method to book a seat
    public void bookSeat() throws NoSeatsAvailableException {
        if (availableSeats > 0) {
            // If there are seats available, reduce the count by 1
            availableSeats--;
            System.out.println("Seat successfully booked. Seats remaining: " + availableSeats);
        } else {
            // If no seats are available, throw a custom exception
            throw new NoSeatsAvailableException("Sorry, no seats are available on this flight.");
        }
    }

    // Method to check the number of available seats
    public int getAvailableSeats() {
        return availableSeats; // Return the current count of available seats
    }
}

public class FlightBooking {
    private static final Scanner scanner = new Scanner(System.in); 

    public static void main(String[] args) {
        // Create a flight object with 5 available seats
        Flight flight = new Flight(5);
        System.out.println("Welcome to the Flight Booking System!");

        // loop until the user chooses to exit
        while (true) {
            // Display the menu options 
            System.out.println("\n--- Flight Booking Menu ---");
            System.out.println("1. Book a Seat");
            System.out.println("2. Check Available Seats");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            
            // Get the user's choice
            int choice = scanner.nextInt();

            // Perform an action based on the user's choice
            switch (choice) {
                case 1: // Option to book a seat
                    try {
                        // Attempt to book a seat
                        flight.bookSeat();
                    } catch (NoSeatsAvailableException e) {
                        // Handle the case when no seats are available
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2: // Option to check the number of available seats
                    System.out.println("Available seats: " + flight.getAvailableSeats());
                    break;
                case 3: // Option to exit the system
                    System.out.println("Thank you for using the Flight Booking System. Goodbye!");
                    scanner.close(); // Close the scanner
                    return; // Exit the program
                default: // Handle invalid input
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }}
