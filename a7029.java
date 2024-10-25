import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.util.*;
public class a7029{
    public static boolean snt(int n){
        if(n<2) return true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream obj1= new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> arr1= (ArrayList<Integer>) obj1.readObject();
        int[] a=new int[arr1.size()];
        Collections.sort(arr1);
        for(int i=0;i<arr1.size();i++){
            if(snt(arr1.get(i))){
                a[arr1.get(i)]++;
            }
        }
        int dem=0;
        for(int i=arr1.size()-1;i>=0;i--){
            if(a[arr1.get(i)]>0) {
                System.out.println(arr1.get(i)+" "+a[arr1.get(i)]);
                a[arr1.get(i)]=0;
                dem++;
            }
        if(dem==10) break;
        }


    }
}