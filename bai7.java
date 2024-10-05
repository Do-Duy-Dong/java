
import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int dem=n-1;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-2;i++){
            for(int j=i+2;j<n;j++){
                if(arr[j-1]<arr[i]&&arr[j-1]<arr[j]){
                    dem++;
                }               
            }
        }
 
        System.out.println(dem);
        }

    }


