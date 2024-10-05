
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
class NhanVien {
    private String name,gender,address,tax,id;
    private Date born,date;
    

    public NhanVien(String id,String name,String gender,String born,String address,String tax,String date) throws ParseException{
        this.id=id;
        this.name=name;
        this.date= new SimpleDateFormat("dd/MM/yyyy").parse(date);
        this.gender=gender;
        this.address=address;
        this.tax=tax;
        this.born=new SimpleDateFormat("dd/MM/yyyy").parse(born);
    }
    @Override
    public String toString(){
        return id+" "+name+" "+gender+" "+new SimpleDateFormat("dd/MM/yyyy").format(born)+" "+address+" "+tax+" "+new SimpleDateFormat("dd/MM/yyyy").format(date);
    }
}
public class a4007 {
    
    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        NhanVien a=new NhanVien("00001",sc.nextLine(), sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
        System.out.println(a);
    }
}
