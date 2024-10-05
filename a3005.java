import java.util.*;
public class a3005 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
         while(t-- >0){
        String s=sc.nextLine();
        String[] d=s.trim().toLowerCase().split("\\s+");
        String res="";
        
        for(int i=1;i<d.length;i++){
            res=res+d[i].substring(0,1).toUpperCase()+d[i].substring(1);
            res+=" ";
        }
        res=res.trim()+", "+d[0].toUpperCase();
        System.out.println(res.trim());
         }
    }
}

