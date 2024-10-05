import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class bai1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
            String line;
            String w="";
            while((line=reader.readLine())!=null && !line.isEmpty()){
                String[] arr=line.split("\\s++");
                for(String x:arr){
                    if(x.length()>w.length()){
                        w=x;
                    }
                }
            }
            System.out.println(w+" - "+w.length());
        }
        catch(IOException e){
            e.printStackTrace();
        }
        
    }
}
