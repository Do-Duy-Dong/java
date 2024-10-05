package baitap;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class WordSet {
    private String name,grade,id;
    private Date date;
    private double gpa;
    private static int i=1;
    
    WordSet(String name,String grade,String date,double gpa) throws ParseException{
        this.id=String.format("B20DCCN%03d",i++);
        this.name=name;
        this.grade=grade;
        this.date= new SimpleDateFormat("dd/MM/yyyy").parse(date);
        this.gpa=gpa;
    }
    private String chuanHoa(){
        String[] d=name.toLowerCase().trim().split("\\s++");
        String res="";
        for(String x:d){
            res+=x.substring(0,1).toUpperCase()+x.substring(1);
            res+=" ";
        }
        return res.trim();
    }
    @Override
    public String toString(){
        return id+" "+chuanHoa()+" "+grade+" "+new SimpleDateFormat("dd/MM/yyyy").format(date)+" "+String.format("%.2f",gpa);
    }
    }
    



public class a5004_DSDTSV2{
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        while(n-->0){
            WordSet a=new WordSet(sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()));
            System.out.println(a);
        }
    }}