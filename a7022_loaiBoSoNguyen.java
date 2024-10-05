import java.util.*;
import java.io.*;

public class a7022_loaiBoSoNguyen {
    public static boolean check(String s){
        for(int i=0;i<s.length();i++){
            if(!Character.isDigit(s.charAt(i))) return false;
        }
        return true;
    }
    //
    public static void main(String[] args) throws FileNotFoundException {
    Scanner sc=new Scanner(new File("DATA.in"));
    ArrayList<String> arr=new ArrayList<>();
    while(sc.hasNext()){
        String s=sc.next();
        if(s.length()<=9 && !check(s)) {
            arr.add(s);
        } else if(s.length()>9) arr.add(s);
     }
    
    Collections.sort(arr);
    for(String x:arr){
        System.out.print(x+" ");
    }
}}