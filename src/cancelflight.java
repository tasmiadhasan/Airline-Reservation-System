import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class cancelflight {
    Menu menu=new Menu();
    public void cancel(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("                                           Please Enter You flight number: ");
        String flightno = scanner.nextLine();
        String f = null;
        String t= null;
        try{
            File file=new File("AllFlights.txt");
            Scanner scan=new Scanner(file);
            while(scan.hasNext()) {
                String flight_no = scan.next();
                String from = scan.next();
                String to = scan.next();
                String ftime = scan.next();
                String freach = scan.next();
                if (flightno.equals(flight_no)) {
                    f = from;
                    t = to;
                }
            }scan.close();
        }catch(FileNotFoundException e){
            System.out.println(e);
        }
        System.out.println("                                        ------------------------------------------------");
        System.out.println("                                           Your flight No: "+flightno);
        System.out.println("                                           From: "+f);
        System.out.println("                                           To: "+t);
        System.out.println("                                           Has Been Cancelled Successfully."+"\n");
        System.out.println("                                        ------------------------------------------------"+"\n");

        System.out.println("                                           *For Main-Menu press 1");
        System.out.println("                                           *For Exit press 2"+"\n");
        System.out.print("                                           Enter your choice: ");
        int choice=scanner.nextInt();
        if(choice==1){
            menu.menu();
        }
        else{
            System.out.println("                                           Thank you for using our AirLine.");
            System.exit(0);
        }
    }
}
