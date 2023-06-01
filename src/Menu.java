import java.util.Scanner;

public class Menu {
    public void menu(){
        Book_A_Flight book_a_flight = new Book_A_Flight();
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Book Flight");
        System.out.println("2.Cancel a Flight");
        System.out.println("3.Exit");
        System.out.print("Your choice:");
        int choice=scanner.nextInt();
        switch(choice){
            case 1:
                book_a_flight.book();
                break;
            case 2:
                break;
            case 3:
                System.out.println("Thank you for using our AirLine.");
                System.exit(0);
                break;
        }
    }
}
