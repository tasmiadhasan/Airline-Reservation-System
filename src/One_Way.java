import java.awt.print.Book;
import java.util.Scanner;

public class One_Way {
    public void one(){
        dhaka_to_japan dacca_to_jap=new dhaka_to_japan();
        dhaka_to_munich dacca_to_mun=new dhaka_to_munich();
        dhaka_to_london dacca_to_lon=new dhaka_to_london();
        dhaka_to_sydney dacca_to_syd=new dhaka_to_sydney();
        dhaka_to_dubai dacca_to_du=new dhaka_to_dubai();
        Scanner scanner=new Scanner(System.in);
        System.out.println("1.Dhaka To Tokyo");
        System.out.println("2.Dhaka To London");
        System.out.println("3.Dhaka To Munich");
        System.out.println("4.Dhaka To Sydney");
        System.out.println("5.Dhaka To Dubai");
        System.out.println("6.Previous menu");
        System.out.println("7.Main Menu");
        System.out.println("8.Exit");
        System.out.println("Choose The Destination To see the flights:");
        int choice=scanner.nextInt();
        switch (choice){
            case 1:
                dacca_to_jap.dacca_to_jp();
                break;
            case 2:
                dacca_to_lon.dacca_to_london();
                break;
            case 3:
                dacca_to_mun.dacca_to_munich();
                break;
            case 4:
                dacca_to_syd.dacca_to_sydney();
                break;
            case 5:
                dacca_to_du.dacca_to_dubai();
                break;
            case 6:
                Book_A_Flight boo=new Book_A_Flight();
                boo.book();
                break;
            case 7:
                Menu me=new Menu();
                me.menu();
                break;
            case 8:
                System.out.println("Thank you for using our AirLine.");
                System.exit(0);
                break;

        }
    }
}
