import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
class DSSV {
    private String name;
    private Date date;
    private double gpa1,gpa2,gpa3;

    public DSSV(String name,String date,double gpa1,double gpa2,double gpa3) throws ParseException{
        this.name=name;
        this.date= new SimpleDateFormat("dd/MM/yyyy").parse(date);
        this.gpa1=gpa1;
        this.gpa2=gpa2;
        this.gpa3=gpa3;
    }
    private double getGpa(){
        return gpa1+gpa2+gpa3;
    }
    public String toString(){
        return name+" "+new SimpleDateFormat("dd/MM/yyyy").format(date)+" "+String.format("%.1f",getGpa());
    }
}

public class a4005 {
    
    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        DSSV a=new DSSV(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.println(a.toString());
    }
}
