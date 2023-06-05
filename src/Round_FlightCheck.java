import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Round_FlightCheck{
    public void Round_Fly(){
        Scanner sc=new Scanner(System.in);
        System.out.print("                                           Enter Your Desire Flight NO:");
        String flight=sc.next();
        String f=null;
        String v=null;
        String t=null;
        String dtime=null;
        String atime=null;

        try{
            File file=new File("Round_FLights.txt");
            Scanner scanner=new Scanner(file);
            while(scanner.hasNext()){
                String flightno= scanner.next();
                String from=scanner.next();
                String via=scanner.next();
                String to=scanner.next();
                String ftime=scanner.next();
                String freach=scanner.next();
                if(flight.equals(flightno)){
                    f=from;
                    v=via;
                    t=to;
                    dtime=ftime;
                    atime=freach;
                }

            }scanner.close();
        }catch (FileNotFoundException e){
            System.out.println(e);
        }
        Round_Invoice roundInvoice=new Round_Invoice(flight,f,v,t,dtime,atime);
        roundInvoice.takeflynum(flight);
        roundInvoice.print();

    }
}

