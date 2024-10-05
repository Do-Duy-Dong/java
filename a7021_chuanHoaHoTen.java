import java.util.*;
import java.io.*;
public class a7021_chuanHoaHoTen {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("DATA.in"));
        while(sc.hasNextLine()){
            String s1=sc.nextLine();
            if(!s1.equals("END")){
            String res="";
            String[] s=s1.toLowerCase().trim().split("\\s+");
            for(String x:s){
                res+= x.substring(0,1).toUpperCase()+x.substring(1)+" ";
            }
            System.out.println(res.trim());
        }
        else break;
        }
    }
}