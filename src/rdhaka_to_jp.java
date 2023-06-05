import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class rdhaka_to_jp {
    public void rdhaka_to_jap(){
        try{
            File file=new File("rdhaka_to_japan.txt");
            Scanner scanner=new Scanner(file);
            while(scanner.hasNext()){
                String flight_num=scanner.next();
                String start=scanner.next();
                String via1=scanner.next();
                String stop=scanner.next();
                String stime=scanner.next();
                String stoptime=scanner.next();
                roundflights flight=new roundflights(flight_num,start,via1,stop,stime,stoptime);
                System.out.println(flight);
            }scanner.close();
            Round_Bill_Invoice invc=new Round_Bill_Invoice();
            invc.bill();
        }catch(FileNotFoundException e){
            System.out.println(e);
        }



    }

}
