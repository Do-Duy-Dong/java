import java.util.*;
public class a2020_lietKeToHop {
    public static int n,k,dem=0;
    public static int[] res=new int[10];
    public static int[] b={0,0,0,0,0,0};
           
    public static void lietKe(int i){       
            for(int j=res[i-1]+1;j<=n-k+i;j++){           
                res[i]=j;
                if(i==k){
                    dem++;
                    for(int h=1;h<=k;h++) System.out.print(res[h]);
                    System.out.print(" ");
    
                }
                else lietKe(i+1);
                
            }
        }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       n=sc.nextInt();k=sc.nextInt();
       lietKe(1);
       System.out.println();
    System.out.printf("Tong cong co %d to hop",dem);
    }
}
