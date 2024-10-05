
import java.io.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.*;

public class PhepToanCoBan {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("DAYSO.in"));
       String s1=sc.nextLine();
       int n=Integer.parseInt(s1);
       ArrayList<BigInteger> a=new ArrayList<>();
       BigInteger res=new BigInteger("0");
       for(int i=0;i<n;i++){
        String s=sc.nextLine();
        BigInteger tmp=new BigInteger(s);
        a.add(tmp);
        res=res.add(tmp);
       }
       System.out.println(Collections.min(a));
       System.out.println(Collections.max(a));
       System.out.println(res);
        
}}
