import java.util.*;
import java.io.*;

public class DiachiEmailFile {
    public static void main(String[] args)throws FileNotFoundException {
        
    Scanner sc=new Scanner(new File("DANHSACH.in"));
    int n=Integer.parseInt(sc.nextLine());
    ArrayList<String> dd=new ArrayList<>();
    while(n-->0){
        String token=sc.nextLine();
        String[] ar=token.trim().toLowerCase().split("\\s+");
        String s=ar[ar.length -1];
        for(int i=0;i<ar.length-1;i++){
            s+=ar[i].charAt(0);
        }
        dd.add(s);
        int count=Collections.frequency(dd, s);
        s+=(count ==1 ? "" :count) +"@ptit.edu.vn";
        System.out.println(s);
    }    
}}