public class Time {
    private double hour,min,sec;

    Time(double hour,double min,double sec){
        this.hour=hour;
        this.min=min;
        this.sec=sec;
    }
    public double getTime(){
        double tong=this.hour*3600+this.min*60+this.sec;
        return tong;
    }
    public void in(){
        System.out.print((int)this.hour+" ");
        System.out.print((int)this.min+" ");
        System.out.println((int)this.sec);
    }

}
