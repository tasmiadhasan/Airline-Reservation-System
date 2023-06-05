import java.util.Scanner;
public class One_Bill_invoice {
    public void bill() {
        Scanner scan = new Scanner(System.in);
        System.out.println("                                           To Reserve a Ticket you need to put the Information. ."+ "\n");
        System.out.print("                                           Enter your name: ");
        String name = scan.next();
        System.out.print("                                           Enter your Passport number: ");
        String passport = scan.next();
        System.out.print("                                           Enter your Phone number: ");
        String phone = scan.next();
        System.out.print("                                           Enter your Address: ");
        String address = scan.next();
        System.out.print("                                           Enter Quantity of tickets: ");
        int ticket = scan.nextInt();
        scan.nextLine();
        System.out.print("                                           Enter class (Business/Economy): ");
        String clas = scan.next();
        int price;
        int total_price;
        if (clas.equals("Business")) {
            price = 50000;
            total_price = price * ticket;
            One_Passenger passenger = new One_Passenger(name, passport, address, phone, clas, ticket, total_price);
            passenger.printInvoice();
        } else if (clas.equals("Economy")) {
            price = 30000;
            total_price = price * ticket;
            One_Passenger passenger = new One_Passenger(name, passport, address, phone, clas, ticket, total_price);
            passenger.printInvoice();
        } else {
            System.out.println("                                           Wrong input");
        }
    }
}
