import java.util.*;
public class bai2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        while(n-->0){
        String s=sc.nextLine();
        char[] arr=new char[s.length()];
        int res=0;
        arr=s.toCharArray();
        Arrays.sort(arr);
        for(char x:arr){
            if( x>='0'&&x<='9') res+=x-'0';
        }
        for(char x:arr){
            if( x>='A'&&x<='Z') System.out.print(x);
        }
        System.out.print(String.valueOf(res));
        System.out.println();
    }
}}