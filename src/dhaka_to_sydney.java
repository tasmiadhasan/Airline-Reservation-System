import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class dhaka_to_sydney {
    public void dacca_to_sydney(){
        try{
            File file=new File("dhaka_to_sydney.txt");
            Scanner scanner=new Scanner(file);
            while(scanner.hasNext()){
                String flight_num=scanner.next();
                String start=scanner.next();
                String stop=scanner.next();
                String stime=scanner.next();
                String stoptime=scanner.next();
                flights flight=new flights(flight_num,start,stop,stime,stoptime);
                System.out.println(flight);

            }scanner.close();
            invoice inv=new invoice();
            inv.bill();
        }catch(FileNotFoundException e){
            System.out.println(e);
        }



    }

}
