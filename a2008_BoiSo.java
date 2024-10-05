
import java.util.*;
public class a2008_BoiSo {
    public static long gcd(long x,long y){
        if( y==0) return x;
        else return gcd(y,x%y);
    }
    public static long lcd(long x,long y){
        return x*y/gcd(x,y);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nt=sc.nextInt();
        while(nt-- >0){
            int n=sc.nextInt();
            long tich=1;
            for(int i=2;i<=n;i++ ){
                    tich=lcd(tich,i);
            }
            System.out.println(tich);
        }
      
    }
}