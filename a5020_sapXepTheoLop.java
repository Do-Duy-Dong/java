package baitap;
import java.math.BigInteger;
import java.text.ParseException;
import java.util.*;
class SinhVien implements Comparable<SinhVien>{
    private String ten,id,gmail,lop;

    SinhVien(String id,String ten,String lop,String gmail) {
        this.id=id;
        this.ten=ten;
        this.lop=lop;
        this.gmail=gmail;
        
}
    @Override
    public String toString(){
        return id+" "+ten+" "+lop+" "+gmail; 
    }
    @Override
    public int compareTo(SinhVien o) {
       
        String s1=lop.substring(3);
        if(lop.compareTo(o.lop)==0){
            return id.compareTo(o.id);
        }
        return lop.compareTo(o.lop);

    }
    
}
public class a5020_sapXepTheoLop{

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> arr=new ArrayList<>();
        while(n-->0){
            SinhVien sv=new SinhVien(sc.nextLine(), sc.nextLine(),sc.nextLine(),sc.nextLine());
            arr.add(sv);
        }
        Collections.sort(arr);
        for(SinhVien x:arr){
            System.out.println(x);
        }
    }}