import java.util.*;
public class caugiai {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        int[] a=new int[t]  ;
        int[] dp=new int[n+2];
        for(int i=0;i<t;i++){
            a[i]=sc.nextInt();
        }
        dp[0]=1;
        for(int i=0;i<t;i++){
            for(int j=n;j>=a[i];j--){
                if(dp[j-a[i]]==1){
                    dp[j]=1;
                }
            }
        }
        for(int i=n-1;i>=0;i--){
            if(dp[i]==1){
                System.out.println(i);
                break;
            }
        }
    
        
  }
    
}