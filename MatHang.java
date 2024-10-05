
import java.util.*;
import java.util.*;

public class MatHang implements Comparable<MatHang> {
    private String product,unit,id;
    private int price,purchase;
    
    

    public MatHang(int id,String product,String unit,int purchase,int price) {
        this.id=String.format("MH%03d",id);
        this.product=product;
        this.unit=unit;
        this.price=price;
        this.purchase=purchase;       
    }
    private int getProfit(){
        return price-purchase;
    }
     @Override
    public String toString(){
        return id+" "+product+" "+unit+" "+purchase+" "+price+" "+getProfit();
}
    @Override
    public int compareTo(MatHang o){
            return o.getProfit()-getProfit();
            
    }
}


public class A5081 {
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<MatHang> ad=new ArrayList<>();
        for(int i=1;i<=t;i++){
        MatHang a=new MatHang(i,sc.nextLine(), sc.nextLine(),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()));
        ad.add(a);
    }
        
        Collections.sort(ad);   
        for(MatHang x:ad){
        System.out.println(x);
    }}
}

