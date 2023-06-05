import java.util.Scanner;

public class One_Passenger {

    private String name;
    private String passport;
    private String address;
    private String phone;
    private int tickets;
    private String classtype;
    private int total_price;
    One_Passenger(String name,String passport,String address,String phone,String classtype,int tickets,int total_price)
    {
        this.name=name;
        this.passport=passport;
        this.address=address;
        this.phone=phone;
        this.tickets=tickets;
        this.classtype=classtype;
        this.total_price=total_price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getTickets() {
        return tickets;
    }

    public void setTickets(int  tickets) {
        this.tickets = tickets;
    }

    public String getClasstype() {
        return classtype;
    }

    public void setClasstype(String classtype) {
        this.classtype = classtype;
    }
    public int getTotal_price(){
        return total_price;
    }
    public void printInvoice(){
        One_FlightCheck newinv=new One_FlightCheck();
        newinv.One_Fly();
        System.out.println("                                           Name of Passenger: "+name+"       "+"Passport NO: "+passport);
        System.out.println("                                           Phone NO: "+phone+"               "+"Address: "+address);
        System.out.println("                                           Class: "+classtype);
        System.out.println("                                           Tickets: "+tickets+"              "+"Price: "+total_price+"/=");
        System.out.println("                                           -----------------------------------------------------------------");
        System.out.println("                                           -----------------------------------------------------------------");
        System.out.println("\n");
        System.out.println("                                           This is your ticket. Please keep it safe.");
        System.out.println("                                           Thank you for choosing us.");
        System.out.println("                                           For Main-Menu press 1");
        System.out.println("                                           For Exit press 2");
        System.out.println("                                           For Cancel Ticket press 3"+"\n");
        System.out.print("                                           Enter your choice:");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        if(choice==1){
            System.out.println("");
            Menu newmenu=new Menu();
            newmenu.menu();
        } else if (choice==2) {
            System.out.println("                                           Thank You For Using our AirLine.");
            System.out.println("");
            System.exit(0);
        } else if (choice==3) {
            System.out.println("");
            cancelflight cancel=new cancelflight();
            cancel.cancel();
        }
    }
}
