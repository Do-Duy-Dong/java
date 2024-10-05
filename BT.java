import java.util.*;
class Time {
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

public class BT{
    public static boolean check(String s){
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Time> a=new ArrayList<>();
        for(int i=0;i<n;i++){       
            double hour=sc.nextDouble(),min=sc.nextDouble(),sec=sc.nextDouble();
            Time t=new Time(hour, min, sec);   
            a.add(t);
    }
    Collections.sort(a,new Comparator<Time>(){

        @Override
        public int compare(Time o1, Time o2) {
            if(o1.getTime()<o2.getTime()) return -1;
            else return 1;
            
        }

    });
    for(Time t:a){
        t.in();
    }

            
}
}