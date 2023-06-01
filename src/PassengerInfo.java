public class PassengerInfo {
    private String name;
    private String passport;
    private String address;
    private String phone;
    private int tickets;
    private String flight_num;
    private String classtype;
    private int total_price;
    PassengerInfo(String name,String passport,String address,String phone,String classtype,int tickets,String flight_num,int total_price)
    {
        this.name=name;
        this.passport=passport;
        this.address=address;
        this.phone=phone;
        this.tickets=tickets;
        this.flight_num=flight_num;
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

    public String getFlight_num() {
        return flight_num;
    }

    public void setFlight_num(String flight_num) {
        this.flight_num = flight_num;
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
                System.out.println("                                           Here is your invoice:");
                System.out.println("                                           -------------AirLine: Bangladesh AirLine---------------");
                System.out.println("                                           Flight number:"+flight_num);
                System.out.println("                                           Name of Passenger: "+name+"                   " +"Passport NO: "+passport);
                System.out.println("                                           Phone NO: "+phone+"                                 "+"Address: "+address);
                System.out.println("                                           Class: "+classtype);
                System.out.println("                                           Tickets: "+tickets+"                                     "+"Price: "+total_price);
    }
}
