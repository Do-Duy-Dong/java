import java.util.*;
import java.io.*;

public class HelloWorld {
    public static boolean snt(int n){
    for(int i=2;i<=Math.sqrt(n);i++){
        if(n%i==0) return false;
    }
    return true;
}
    public static void main(String[] args) throws FileNotFoundException,IOException {
        DataInputStream sc=new DataInputStream(new FileInputStream("SONGUYEN.in"));
        int[] b=new int[100000];
        ArrayList<Integer> arr=new ArrayList<>();
        while(sc.readInt()){
            int a=sc.readInt();
            if(snt(a)==true && b[a]<1) {
            arr.add(a);
            b[a]++;
            }
            else b[a]++;
    }
    Collections.sort(arr);
    for(int x:arr){
        if(b[x]>=1){
            System.out.println(x+" "+b[x]);
        }
    }
    
}}
