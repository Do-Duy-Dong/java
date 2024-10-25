import java.util.*;
public class TH2_demCap {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int[] a=new int[t];
        for(int i=0;i<t;i++){
            a[i]=sc.nextInt();
        }
        
        int dem=0;
        for(int i=0;i<t;i++){
            for(int j=i+2;j<t;j++){
                if(a[j-1]<=a[i]&&a[j-1]<=a[j]){
                    dem++;
                }
                else break;
                
        }}
        System.out.println(dem+t-1);
    
}
}