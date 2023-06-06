import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Round_Invoice{
    private String flight;
    private String from;
    private String via;
    private String to;
    private String departure;
    private String arrival;

    Round_Invoice(String flight,String from,String via,String to,String departure,String arrival){
        this.flight=flight;
        this.from=from;
        this.via=via;
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

    public String getVia() {
        return via;
    }

    public void setVia(String via) {
        this.via = via;
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
        System.out.println("                                           -----------------------------------------------------------------");
        System.out.println("                                           -------------------AirLine: Bangladesh AirLine-------------------");
        System.out.println("                                           Flight No:"+flight);
        System.out.println("                                           ---------------------"+"\n");
        System.out.println("                                           From:"+from+"          "+"               Via:"+via);
        System.out.println("                                           To:"+to);
        System.out.println("                                           Departure:"+departure+"      "+"         Arrival:"+arrival);
    }

}
