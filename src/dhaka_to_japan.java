import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class dhaka_to_japan {
    public void dacca_to_jp(){
        try{
            File file=new File("Dacca_to_Japan.txt");
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
            One_Bill_invoice inv=new One_Bill_invoice();
            inv.bill();
        }catch(FileNotFoundException e){
            System.out.println(e);
        }



    }

}
