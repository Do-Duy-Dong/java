package baitap;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
class Point implements Comparable<Point>{
    private String id,ten,hthuc;
    Point(String id,String ten,String hthuc){
        this.id=id;
        this.ten=ten;
        this.hthuc=hthuc;
    }
    private String getId(){
        return id;
    }
    @Override
    public String toString(){
        return id+" "+ten+" "+hthuc;
    }
    @Override
    public int compareTo(Point b){
        return id.compareTo(b.getId());
    }
   
}
public class a7058_danhSachMonThi {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc=new Scanner(new File("MONHOC.in"));
        int n =Integer.parseInt(sc.nextLine());
        
        ArrayList<Point> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(new Point(sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(a);
        for( Point x:a){
            System.out.println(x);
        }
             
}}