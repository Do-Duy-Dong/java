package baitap;
import java.math.BigInteger;
import java.text.ParseException;
import java.util.*;
class WordSet implements Comparable<WordSet>{
    private String ten,nhom;
    private float mua,ban;
    private int id;
    private static int i=1;

    
    WordSet(String ten,String nhom,float mua,float ban) {
        this.id=i++;
        this.ten=ten;
        this.nhom=nhom;
        this.mua=mua;
        this.ban=ban;

    }
    private Float profit(){
        return ban-mua;
    }
    @Override
    public String toString(){
        return id+" "+ten+" "+nhom+" "+String.format("%.2f",profit());
    }
    @Override
    public int compareTo(WordSet o) {
        return o.profit().compareTo(profit());
    }
    
}

public class a5010_danhSachMatHang{

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        ArrayList<WordSet> arr=new ArrayList<>();
        int n=Integer.parseInt(sc.nextLine());
        while(n-->0){
            WordSet a=new WordSet(sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()));
            arr.add(a);
        }
        Collections.sort(arr);
        for(WordSet x:arr){
            System.out.println(x);
        }
    }}