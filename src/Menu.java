import java.util.Scanner;


public class Menu {
    public void menu(){
        Book_A_Flight book_a_flight = new Book_A_Flight();
        Scanner scanner = new Scanner(System.in);
        System.out.println("                                           Welcome to AirLine Reservation System"+"\n");
        System.out.println("                                           1.Book-Flight");
        System.out.println("                                           2.Cancel a Flight");
        System.out.println("                                           3.Exit"+'\n');
        System.out.print("                                            Your choice:");
        int choice=scanner.nextInt();
        switch(choice){
            case 1:
                System.out.println("");
                book_a_flight.book();
                break;
            case 2:
                System.out.println("");
                cancelflight cancel = new cancelflight();
                cancel.cancel();
                break;
            case 3:
                System.out.println("");
                System.out.println("                                           Thank you for Choosing our AirLine.");
                System.exit(0);
                break;
            default:
                System.out.println("                                           Invalid Input");
        }
    }
}
