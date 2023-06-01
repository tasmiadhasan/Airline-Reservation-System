import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Login {
    Menu menu = new Menu();
    public void login(){
        Scanner sc = new Scanner(System.in);
        System.out.print("                                           USERNAME:");
        String name = sc.nextLine();
        System.out.print("                                           PASSWORD:");
        String pass = sc.nextLine();
        try{
            File file = new File("login.txt");
            Scanner scanner=new Scanner(file);
            while(scanner.hasNext()) {
                String user_name = scanner.next();
                String password = scanner.next();
                if (name.equals(user_name) && pass.equals(password)) {

                    menu.menu();

                }
                else{
                    System.out.println("                                           Login failed");
                }
            } scanner.close();
        }catch (FileNotFoundException e){
            System.out.println(e);
        }
    }
}
