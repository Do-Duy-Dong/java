import java.util.*;
public class bai5 {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    int n=Integer.parseInt(sc.nextLine());
    while(n-->0){
        String s=sc.nextLine();
        String[] d=s.split("\\s++");
        for(int i=d.length-1;i>=0;i--){
            System.out.print(d[i]+" ");
        }
        System.out.println();
    }
}}
