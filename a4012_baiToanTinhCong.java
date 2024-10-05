package baitap;
import java.util.*;
 class Point{
    private String id,name,position;
    private int salary,date;
    Point(String name,int salary,int date,String position){
        this.id="NV01";
        this.name=name;
        this.salary=salary;
        this.date=date;
        this.position=position;
    }
    private int getMoney(){
        return salary*date;
    }
    private int prize(){
        if(date>=22&&date<25){
            return (int) (getMoney()*0.1f);
        }
        else if(date>=25) return (int)(getMoney()*0.2f);
        else return 0;
    }
    private int bonus(){
        switch(position){
            case "GD":
                return 250000;
            case "NV":
                return 150000; 
            case "PGD":
                return 200000;
            case "TP":
                return 180000;
    }
    return 0;
}
    private int sum(){
        return getMoney()+bonus()+prize();
    }
    @Override
    public String toString(){
        return id+" "+name+" "+getMoney()+" "+prize()+" "+bonus()+" "+sum();
    }
    
   
}
public class a4012_baiToanTinhCong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int n =Integer.parseInt(sc.nextLine());
        Point a=new Point(sc.nextLine(),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()), sc.nextLine());
        System.out.println(a);
        
        
             
}}
