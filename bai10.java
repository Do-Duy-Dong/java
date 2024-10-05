import java.util.*;
public class bai10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine();
        int countX=0,countT=0,countD=0;
        for(char ball : s.toCharArray()){
            if(ball=='X'){
                countX++;
            }
            else if(ball=='T'){
                countT++;
        }else if(ball=='D'){
                countD++;
            }}
        char[] arr=new char[n];
        for(int i=0;i<countX;i++){
            arr[i]='X';
        }
        for(int i=countX;i<countX +countT;i++){
            arr[i]='T';
        }
        for(int i=countX +countT;i<n;i++){
            arr[i]='D';
        }
        int res=0;
        char[] bong=s.toCharArray();
        for(int i=0;i<n;i++){
            if(bong[i]!=arr[i]){
                for(int j=i+1;j<n;j++){
                    if(bong[j]==arr[i]&&bong[j]!=arr[j]){
                        char temp=bong[i];
                        bong[i]=bong[j];
                        bong[j]=temp;
                        res++;
                        break;
                    }
                }
            }
        }
        System.out.println(res);
    
}}
