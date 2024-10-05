import java.util.*;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        while(n-->0){
        String s=sc.nextLine();
        int dem=-1;
        long tich=1,tong=0;

        for(char x:s.toCharArray()){
            dem++;
            if(dem%2==0&&x!='0'){
                tich*=(x-'0');
            }
            else if(dem%2==1){
                tong+=(x-'0');
            }
        }
        System.out.println(tich+" "+tong);
 
}}
}