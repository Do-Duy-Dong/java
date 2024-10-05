import java.util.*;
import java.io.*;
public class a7004_soKhacNhauTrongFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("DATA.in"));
        ArrayList<Integer> arr=new ArrayList<>();
        int[] b=new int[100000];
        while(sc.hasNext()){
        for(int i=0;i<10;i++){
            int a=Integer.parseInt(sc.next());
            
            b[a]+=1;}
        }
        for(int i=0;i<100000;i++){
            if(b[i]>0){
                System.out.println(i+" "+b[i]);
            }
        }
    }
}
