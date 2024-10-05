import java.util.*;
public class a3004 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
         while(t-- >0){
        String s=sc.nextLine();
        String[] d=s.trim().toLowerCase().split("\\s+");
        String res="";
        
        for(String x:d){
            res+=Character.toUpperCase(x.charAt(0));
            for(int i=1;i<x.length();i++){
                res+=x.charAt(i);
            }
            res+=" ";
            
        }
        System.out.println(res.trim());
         }
    }
}
