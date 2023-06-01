public class flights {
    private String flight_num;
    private String start;
    private String stop;
    private String stime;
    private String stoptime;
    flights(String flight_num,String start,String stop,String stime,String stoptime){
        this.flight_num=flight_num;
        this.start=start;
        this.stop=stop;
        this.stime=stime;
        this.stoptime=stoptime;
    }

    public String getFlight_num() {
        return flight_num;
    }

    public void setFlight_num(String flight_num) {
        this.flight_num = flight_num;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getStop() {
        return stop;
    }

    public void setStop(String stop) {
        this.stop = stop;
    }

    public String getStime() {
        return stime;
    }

    public void setStime(String stime) {
        this.stime = stime;
    }

    public String getStoptime() {
        return stoptime;
    }

    public void setStoptime(String stoptime) {
        this.stoptime = stoptime;
    }
    public String toString(){
        return "No:"+flight_num+"   Flying From:"+start+"   Flying to:"+stop+"\n"+"Date & Time:"+stime+"Arrival:"+stoptime;
    }
}
