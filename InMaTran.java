import java.util.Scanner;
import java.util.*;
public class InMaTran {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
        int n=sc.nextInt();
        int a[][]=new int[n+1][n+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=1;i<=n;i++){
            if(i%2!=0){
            for(int j=1;j<=n;j++){
            System.out.print(a[i][j]+" ");
            }}
            else{
                for(int j=n;j>=1;j--){
                System.out.print(a[i][j]+" ");
            }}
        }
        System.out.println();
    }
}
}