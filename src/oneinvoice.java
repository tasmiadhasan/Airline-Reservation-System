import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class oneinvoice {
    private String flight;
    private String from;
    private String to;
    private String departure;
    private String arrival;

    oneinvoice(String flight,String from,String to,String departure,String arrival){
        this.flight=flight;
        this.from=from;
        this.to=to;
        this.departure=departure;
        this.arrival=arrival;
    }

    public String getFlight() {
        return flight;
    }

    public void setFlight(String flight) {
        this.flight = flight;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }
    public String takeflynum(String takeflynum){
        return flight;
    }
    public void print(){
        System.out.println("                                           Here is your invoice:"+"\n");
        System.out.println("                                           -----------------AirLine: Bangladesh AirLine---------------------");
        System.out.println("                                           -----------------------------------------------------------------");
        System.out.println("                                           Flight No:"+flight+"\n");
        System.out.println("                                           From:"+from+"          "+"               To:"+to);
        System.out.println("                                           Departure:"+departure+"      "+"         Arrival:"+arrival);
    }

}
