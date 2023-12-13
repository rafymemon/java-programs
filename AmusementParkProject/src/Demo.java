import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Ticket {
    double price;

    public Ticket(double price) {
        this.price = price;
    }
}

class TicketBooth {
    AmusementPark park; //  TicketBooth has association with AmusementPark

    public TicketBooth(AmusementPark park) {
        this.park = park;
    }

    // purchase a ticket for a visitor
    public Ticket purchaseTicket(Visitor visitor, int minimumHeight) {
        // Prompt the user to enter the ticket price for the specific ride
        System.out.print("Enter ticket price for " + park.name + " ride (in RS): ");
        Scanner scanner = new Scanner(System.in);
        double ticketPrice = scanner.nextDouble();
        scanner.nextLine();
        System.out.println(visitor.name + " purchases a ticket for " + ticketPrice);
        return new Ticket(ticketPrice);
    }
}

class Ride extends AmusementPark {
    String rideName;
    int minimumHeight;
    int durationInMinutes;

    public Ride(String amusementParkName, String rideName, int minimumHeight, int durationInMinutes) {
        super(amusementParkName); // Inheritance
        this.rideName = rideName;
        this.minimumHeight = minimumHeight;
        this.durationInMinutes = durationInMinutes;
    }
}

class VisitRideThread extends Thread {
    Visitor visitor;
    Ride ride; //  VisitRideThread has association with Ride

}
 class AmusementPark {
    String name;
    List<Ride> rides; // AmusementPark has a list of Ride objects

    public AmusementPark(String name) {
        this.name = name;
        this.rides = new ArrayList<>();
    }

    // Method to add a ride to the amusement park
    public void addRide(Ride ride) {
        rides.add(ride);
    }

    // Method get list of rides in amusement park
    public List<Ride> getRides() {
        return rides;
    }

    // display available rides in  amusement park
    public void displayRides() {
        System.out.println("Rides available at " + name + " amusement park:");
        for (Ride ride : rides) {
            System.out.println("- " + ride.rideName + " (Minimum Height: " + ride.minimumHeight + "  Duration: " +
                    ride.durationInMinutes + " minutes)");
        }
    }
}

class Visitor {
    String name;
    int age;
    String gender;

    public Visitor(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    //  allow the visitor to purchase snacks
    public void purchaseSnacks(ConcessionStand concessionStand, String snack) {
        concessionStand.purchaseSnacks(this, snack);
    }
}

class ConcessionStand {
    AmusementPark park; // ConcessionStand has an association with AmusementPark

    public ConcessionStand(AmusementPark park) {
        this.park = park;
    }

    // Method to allow a visitor to purchase snacks from the concession stand
    public void purchaseSnacks(Visitor visitor, String snack) {
        System.out.println(visitor.name + " buys " + snack + " at the concession stand in " + park.name); // Outputs purchase information
    }
}

public class Demo {
    public static void main(String[] args) {
        System.out.println("****WelCome To Park****");
        System.out.println();
        Scanner scanner = new Scanner(System.in);

        //  create an AmusementPark object
        System.out.print("Enter amusement park name: ");
        String parkName = scanner.nextLine();
        AmusementPark park = new AmusementPark(parkName);

        //   number of rides in the park
        System.out.print("Enter number of rides in the park: ");
        int numberOfRides = scanner.nextInt();
        scanner.nextLine();

        //  ride details
        for (int i = 0; i < numberOfRides; i++) {
            //  enter ride details
            System.out.print("Enter ride " + (i + 1) + " name: "); //
            String rideName = scanner.nextLine();
            System.out.print("Enter minimum height for " + rideName + " ride : ");
            int minimumHeight = scanner.nextInt();
            System.out.print("Enter duration for " + rideName + " ride (in minutes): ");
            int durationInMinutes = scanner.nextInt();
            scanner.nextLine();

            // Create a Ride object  and add to the amusement park
            Ride ride = new Ride(parkName, rideName, minimumHeight, durationInMinutes);
            park.addRide(ride);
        }

        // enter the number of visitors
        System.out.print("Enter number of visitors: ");
        int numberOfVisitors = scanner.nextInt();
        scanner.nextLine();

        //  array Visitor objects for each visitor
        Visitor[] visitors = new Visitor[numberOfVisitors];

        //  visitor details
        for (int i = 0; i < numberOfVisitors; i++) {
            //  enter visitor details
            System.out.print("Enter visitor " + (i + 1) + " name: ");
            String name = scanner.nextLine();
            System.out.print("Enter visitor " + (i + 1) + " age: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter visitor " + (i + 1) + " gender: ");
            String gender = scanner.nextLine();

            // Create a Visitor object and add it to the visitors array
            visitors[i] = new Visitor(name, age, gender);
        }

        // Create TicketBooth and ConcessionStand objects for the amusement park
        TicketBooth ticketBooth = new TicketBooth(park);
        ConcessionStand concessionStand = new ConcessionStand(park);

        //  process each visitor's ride and snack choices
        for (int i = 0; i < numberOfVisitors; i++) {
            //  available rides to the visitor
            park.displayRides();
            //  enter the ride number for the current visitor
            System.out.print("Enter ride number for " + visitors[i].name + ": ");
            int rideNumber = scanner.nextInt();
            scanner.nextLine();

            //  selected ride on the user input
            Ride selectedRide = park.getRides().get(rideNumber - 1);
            // Purchase a ticket for the selected ride for the current visitor
            ticketBooth.purchaseTicket(visitors[i], selectedRide.minimumHeight);

            //  enter the snack choice for the current visitor
            System.out.print("Enter snack for " + visitors[i].name + ": ");
            String snack = scanner.nextLine();

            // Purchase the selected snack for the current visitor
            visitors[i].purchaseSnacks(concessionStand, snack);
        }

        System.out.println("All visitors have completed their rides and purchased snacks.");


        scanner.close();
    }
}