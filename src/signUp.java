import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class signUp {
    public void signup(){
        Scanner scanner= new Scanner(System.in);
        try{
            File file = new File("login.txt");
            FileWriter fw = new FileWriter(file, true);
            System.out.print("                                           Enter your User-Name: ");
            String user_name = scanner.nextLine();
            fw.write(user_name);
            fw.write("\t");
            System.out.print("                                           Enter your Password: ");
            String password = scanner.nextLine();
            fw.write(password);
            fw.write("\n");
            System.out.println("");
            System.out.println("                                           Please remember your user_name and password."+"\n");
            fw.close();
        }catch (IOException e){
            System.out.println(e);
        }


    }
}
