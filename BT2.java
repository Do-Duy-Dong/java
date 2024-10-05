import java.util.Scanner;
import java.util.*;

public class BT2 {
    public static boolean check(String a){
        for(int i=0;i<a.length()/2;i++){
            if(a.charAt(i)!=a.charAt(a.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    public static boolean check1(String s){
        int sum=0;
        for(int i=0;i<s.length();i++){
            sum+=s.charAt(i)-'0';
        }
        if(sum%10==0) return true;
        else return false;
    }
    // public static boolean check3(String s){
    //     if()
    // }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder(s);
        System.out.println(sb.reverse());
        // int t=Integer.parseInt(sc.nextLine());
        // ArrayList<String> cout=new ArrayList<>();
        // while(t-->0){            
        //     String s=sc.nextLine();            
        //     String[] d=s.trim().split("\\s+");
        //     String s1="";
          
        //     s1+=d[d.length-1].toLowerCase();
        //     for(int i=0;i<d.length-1;i++){
        //         s1+=d[i].charAt(0);
        //     }
            
        //     cout.add(s1);
        //     int dem=Collections.frequency(cout,s1);
        //     if(dem>1){
        //         s1+=dem;
            
        // }
        // s1+="@ptit.edu.vn";
        // System.out.println(s1);
            
            
            
            
            
    }
}
