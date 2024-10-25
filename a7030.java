import java.util.*;
import java.io.*;
public class a7030 {
    public static boolean snt(int n){
        if(n<2) return true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream obj1= new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream obj2=new ObjectInputStream(new FileInputStream("DATA2.in"));
        
        ArrayList<Integer> arr1= (ArrayList<Integer>) obj1.readObject();
        ArrayList<Integer> arr2= (ArrayList<Integer>) obj2.readObject();

        TreeSet<Integer> set1= new TreeSet<>();
        TreeSet<Integer> set2= new TreeSet<>();

        for(int x:arr1){
            if(snt(x)) set1.add(x);
        }
        for(int x:arr2){
            if(snt(x)) set2.add(x);
        }
        for(int i:set1){
            if(i*2>=1000000) break;

            if(arr2.contains(1000000-i)){
                System.out.println(i+ " "+(1000000-i));
            }
        }

    }
}
