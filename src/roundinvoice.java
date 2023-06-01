import java.util.Scanner;
public class roundinvoice {
    public void bill() {
        Scanner scan = new Scanner(System.in);
        System.out.println("                                         To complete the procedure, please fill out the following details."+ "\n");
        System.out.print("                                           Enter your desired flight number: ");
        String flight_no = scan.next();
        System.out.print("                                           Enter your name: ");
        String name = scan.next();
        System.out.print("                                           Enter your Passport number: ");
        String passport = scan.next();
        System.out.print("                                           Enter your Phone number: ");
        String phone = scan.next();
        System.out.print("                                           Enter your Address: ");
        String address = scan.next();
        System.out.print("                                           Enter how many tickets you want to buy: ");
        int ticket = scan.nextInt();
        scan.nextLine();
        System.out.print("                                           Enter class (First Class/Second Class): ");
        String clas = scan.next();
        int price;
        int total_price;
        if (clas.equals("First")) {
            price = 100000;
            total_price = price * ticket;
            PassengerInfo passenger = new PassengerInfo(name, passport, address, phone, clas, ticket, flight_no, total_price);
            passenger.printInvoice();
        } else if (clas.equals("Second")) {
            price = 70000;
            total_price = price * ticket;
            PassengerInfo passenger = new PassengerInfo(name, passport, address, phone, clas, ticket, flight_no, total_price);
            passenger.printInvoice();
        } else {
            System.out.println("                                           Wrong input");
        }
    }
}
