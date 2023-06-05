import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
         signUp sign = new signUp();
         Login log = new Login();
        Welcome welcome = new Welcome();
        welcome.welcome();

        System.out.print("                                           Welcome to window......please follow the instructions");
        System.out.println();
        while(true){
            System.out.println("                                           1. Sign Up");
            System.out.println("                                           2. Login");
            System.out.println("                                           3. Exit"+"\n");
            System.out.print("                                           Enter your choice: ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch(choice){
                case 1:
                    System.out.println();
                    sign.signup();
                    break;
                case 2:
                    System.out.println();
                    log.login();
                    break;
                case 3:
                    System.out.println("                                           Thank you for using User AirLine Reservation System!");
                    System.exit(0);
                    break;
            }

        }


    }
}
