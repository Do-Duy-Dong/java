import java.util.*;
import java.io.*;
public class a7005_soKhacNhauTrongFile2 {
    public static void main(String[] args) throws FileNotFoundException,IOException {
        DataInputStream sc=new DataInputStream(new FileInputStream("DATA.IN"));
        ArrayList<Integer> arr=new ArrayList<>();
        int[] b=new int[1000000];
        for(int i=0;i<100000;i++){
            b[sc.readInt()]++;
        }
        for(int i=0;i<100000;i++){
            if(b[i]>0){
                System.out.println(i+" "+b[i]);
            }
        }
    }
}
