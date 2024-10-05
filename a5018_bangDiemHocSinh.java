package baitap;
import java.math.BigInteger;
import java.text.ParseException;
import java.util.*;
class SinhVien implements Comparable<SinhVien>{
    private String ten,id;
    private static int i=1;
    private Float gpa=0f;
    private float[] a;   
    SinhVien(String ten,float[] a) {
        this.id=String.format("HS%02d",i++);
        this.ten=ten;
        this.a=a;
        getGpa();
        
}
    private void getGpa(){
        for(int i=0;i<a.length;i++){
            gpa+=a[i]*((i==0||i==1)?2f:1f);
        }
        gpa/=12f;
        gpa=Math.round(gpa*10f)/10f;
    }
    private String getType(){
        if(gpa>=9f) return "XUAT SAC";
        else if(gpa>=8f&&gpa<=8.9f) return "GIOI";
        else if(gpa>=7f&&gpa<=7.9f) return "KHA";
        else if(gpa>=5f&&gpa<=6.9f) return "TB";
        else return "YEU";
    }
    @Override
    public String toString(){
        return id+" "+ten+" "+String.format("%.1f",gpa)+" "+getType(); 
    }
    @Override
    public int compareTo(SinhVien o) {
        if(gpa.compareTo(o.gpa)==0){
            return id.compareTo(o.id);
        }
        return o.gpa.compareTo(gpa);
    }
    
}

public class a5018_bangDiemHocSinh{

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        float[] a=new float[10];
        ArrayList<SinhVien> arr=new ArrayList<>();
        while(n-->0){
            String s=sc.nextLine();
            for(int i=0;i<10;i++){
                a[i]=sc.nextFloat();
            }
            sc.nextLine();
            SinhVien sv=new SinhVien(s, a);
            arr.add(sv);
        }
        Collections.sort(arr);
        for(SinhVien x:arr){
            System.out.println(x);
        }
    }}