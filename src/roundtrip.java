import java.util.Scanner;

public class roundtrip {

    public void Roundtrip(){
        rdhaka_to_jp rdhakaToJp=new rdhaka_to_jp();
        rdhaka_to_london rdhakaToLondon=new rdhaka_to_london();
        rdhaka_to_sydney rdhakaToSydney=new rdhaka_to_sydney();
        rdhaka_to_munich rdhakaToMunich=new rdhaka_to_munich();
        System.out.println("                                           Our Available Trips are...."+"\n");
        System.out.println("                                           1.Dhaka-Dubai-Tokyo");
        System.out.println("                                           2.Dhaka-Dubai-Sydney");
        System.out.println("                                           3.Dhaka-Dubai-Munich");
        System.out.println("                                           4.Dhaka-Dubai-London");
        System.out.println("                                           5.Previous Menu");
        System.out.println("                                           6.Main Menu");
        System.out.println("                                           7.Exit"+"\n");
        Scanner scanner=new Scanner(System.in);
        System.out.print("                                           Enter your choice:");
        int choice=scanner.nextInt();
        switch (choice){
            case 1:
                System.out.println("");
                rdhakaToJp.rdhaka_to_jap();
                break;
            case 2:
                System.out.println("");
                rdhakaToSydney.rdhaka_to_syd();
                break;
            case 3:
                System.out.println("");
                rdhakaToMunich.rdhaka_to_mun();
                break;
            case 4:
                System.out.println("");
                rdhakaToLondon.rdhaka_to_lon();
                break;
            case 5:
                System.out.println("");
                Book_A_Flight bo=new Book_A_Flight();
                bo.book();
                break;
            case 6:
                System.out.println("");
                Menu m=new Menu();
                m.menu();
                break;
            case 7:
                System.out.println("");
                System.out.println("                                           Thank you for using our AirLine.");
                System.exit(0);
                break;
        }
    }
}
