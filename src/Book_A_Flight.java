import java.util.Scanner;

public class Book_A_Flight {
    One_Way one=new One_Way();
    roundtrip round=new roundtrip();
    public void book(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("                                           1.One Way");
        System.out.println("                                           2.Round-Trip");
        System.out.println("                                           3.Main-Menu");
        System.out.println("                                           4.Exit");
        System.out.print("                                             Enter your choice:");
        int choice=scanner.nextInt();
        switch (choice){
            case 1:
                one.one();
                break;
            case 2:
                round.Roundtrip();
                break;
            case 3:
                Menu men=new Menu();
                men.menu();
                break;
            case 4:
                System.out.println("                                            Thank You for Using Our AirLine");
                System.exit(0);
                break;
        }
    }
}
