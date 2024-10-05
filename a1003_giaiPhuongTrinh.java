import java.util.*;
public class a1003_giaiPhuongTrinh {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble(),b=sc.nextDouble();
        double x=-b/a;
        if(a==0 && b==0) System.out.println("VSN");
        else if(a==0&&b!=0) System.out.println("VN");
        else System.out.println(String.format("%.2f",x));
    }
}
