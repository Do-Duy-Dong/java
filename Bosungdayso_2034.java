import java.util.Scanner;
import java.util.*;
public class Bosungdayso_2034 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(sc.nextInt());
        }
        boolean check=true;
        for(int i=1;i<Collections.max(a);i++){
            if(a.contains(i)==false){
                System.out.println(i);
                check=false;
            }
        }
        if(check) System.out.println("Excellent!");
}
}
