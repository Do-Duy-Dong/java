import java.math.BigInteger;
import java.util.*;
public class HieuSoNguyenLon_3013 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
              BigInteger a=sc.nextBigInteger(),b=sc.nextBigInteger();
              System.out.println(a);
            
            BigInteger c=a.subtract(b).abs();

            int maxLength=Math.max(a.toString().length(),b.toString().length());
            String d=c.toString();
            while(d.length()<maxLength){
                d="0"+d;
            }
            System.out.println(d);
        }
    }
}
