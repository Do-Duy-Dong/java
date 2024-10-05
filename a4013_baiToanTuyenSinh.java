package baitap;
import java.util.*;
class Point{
    private String id,ten;
    private float toan,ly,hoa;

    Point(String id,String ten,float toan,float ly,float hoa){
        this.id=id;
        this.ten=ten;
        this.toan=toan;
        this.ly=ly;
        this.hoa=hoa;
    }

    private float plus(){
        switch(id.charAt(2)){
            case '1':
                return 0.5f;
            case '2':
                return 1f;
            case '3':
                return 2.5f;
        }
        return 0;
    }

    private String sum(){
        float tong=toan*2+ly+hoa;
        int x=(int) tong;  
        return String.format(tong-x==0?"%.0f":"%.1f", tong); 
    }

    private String status(){
        float tong=Float.parseFloat(sum())+plus();
        if(tong >=24) return" TRUNG TUYEN";
        else return "TRUOT";
    }

    @Override
    public String toString(){
        return id+" "+ten+" "+String.format(plus()==(int)plus()?"%.0f":"%.1f",plus())+" "+sum()+" "+status();
    }
}
public class a4013_baiToanTuyenSinh {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int n =Integer.parseInt(sc.nextLine());
        Point a=new Point(sc.nextLine(),sc.nextLine(),sc.nextFloat(),sc.nextFloat(),sc.nextFloat());
        System.out.println(a);
        
             
}}