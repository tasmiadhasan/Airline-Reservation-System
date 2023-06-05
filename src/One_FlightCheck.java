import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class One_FlightCheck {
    public void One_Fly(){
        Scanner sc=new Scanner(System.in);
        System.out.print("                                           Enter Your Desire Flight NO:");
        String flight=sc.next();
        String f=null;
        String t=null;
        String dtime=null;
        String atime=null;

        try{
            File file=new File("One_Flights.txt");
            Scanner scanner=new Scanner(file);
            while(scanner.hasNext()){
                String flightno= scanner.next();
                String from=scanner.next();
                String to=scanner.next();
                String ftime=scanner.next();
                String freach=scanner.next();
                if(flight.equals(flightno)){
                    f=from;
                    t=to;
                    dtime=ftime;
                    atime=freach;
                }

            }scanner.close();
        }catch (FileNotFoundException e){
            System.out.println(e);
        }
        oneinvoice oneflyinv=new oneinvoice(flight,f,t,dtime,atime);
        oneflyinv.takeflynum(flight);
        oneflyinv.print();

    }
}

