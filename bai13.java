package baitap;
import java.math.BigInteger;
import java.text.ParseException;
import java.util.*;
class SinhVien implements Comparable<SinhVien>{
    private String id,ten,lop,email,sdt;
    private int tong;   
    SinhVien(String id,String ten,String lop,String email,String sdt) {
        this.id=id;
        this.ten=ten;
        this.lop=lop;
        this.email=email;
        this.sdt="0"+sdt;
}
    @Override
    public String toString(){
        return id+" "+ten+" "+lop+" "+email+" "+sdt; 
    }
    @Override
    public int compareTo(SinhVien o) {
        if(lop.equals(o.lop)){
            return id.compareTo(o.id);
        }
        return lop.compareTo(o.lop);
    }
    
}
public class bai13{

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> arr=new ArrayList<>();
        ;
        while(sc.hasNext()){   
            SinhVien a=new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(),sc.nextLine());
            arr.add(a);
        }
        Collections.sort(arr);
        for(SinhVien x:arr){
            System.out.println(x);
        }
        
    }}