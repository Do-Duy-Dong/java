import java.util.*;
public class a2023_SoXaCach {
    public static int n,k,dem=0;
    public static int[] res;
    public static int[] b={0,0,0,0,0,0,0,0,0,0,0,0};;
    public static boolean check(int[] a){
        for(int i=1;i<n;i++){
            if(Math.abs(a[i]-a[i+1])==1){
                return false;
            }
        }
        return true;
    }
    public static void lietKe(int i){
        for(int j=1;j<=n;j++){
            if(b[j]==0){
                res[i]=j;
                b[j]=1;
                if(i==n&& check(res)){

                    for(int h=1;h<=n;h++){
                        System.out.print(res[h]);
                        
                    }
                    System.out.println();
                }
                else lietKe(i+1);
                b[j]=0;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
        n=sc.nextInt();
        res=new int[12];
        
        lietKe(1);
        
    }}
}