import java.util.*;
import java.io.*;
public class soLongFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("DATA.in"));
        long tong=0;
        while(sc.hasNext()){
        String s=sc.next();
        if(s.length()>9&&s.length()<=18){
        try{
            
            long a=Long.parseLong(s);
            
                tong+=a;
            
           
        }
        catch(NumberFormatException e){

        }
    }
        
    }
    System.out.println(tong);
}
}
