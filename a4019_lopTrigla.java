package baitap;
import java.util.*;
class Triangle{
    private Point a,b,c;
    Triangle(Point a,Point b,Point c){
       this.a=a;
       this.b=b;
       this.c=c;
    }

    private double length(Point a,Point b){
        return Math.sqrt(Math.pow(a.getX()-b.getX(),2)+Math.pow(a.getY()-b.getY(),2));
    }
    public boolean valid(){
        double canha=length(a,b);
        double canhb=length(a,c);
        double canhc=length(b,c);
        if(canha+canhb>canhc&&canha+canhc>canhb&&canhb+canhc>canha){
            return true;
        }
        return false;
    }
    public String getPerimeter(){
        double canha=length(a,b);
        double canhb=length(a,c);
        double canhc=length(b,c);
        return String.format("%.3f",canha+canhb+canhc);
    }
class Point {
    private double x,y;
    Point(double x,double y){
        this.x=x;
        this.y=y;
    }
    public static Point nextPoint(Scanner sc){
        return new Point(sc.nextDouble(),sc.nextDouble());
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
}

public class a4019_lopTrigla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if(!a.valid()){
                System.out.println("INVALID");
            } else{
                System.out.println(a.getPerimeter());
            }
        }
    }
        
             
}