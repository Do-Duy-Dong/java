import java.util.*;
public class ThuGon_2017{

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(sc.nextInt());
        }
        while(true){
            boolean check=true;
        for(int i=0;i<a.size()-1;i++){
            if((a.get(i)+a.get(i+1))%2==0){
                a.remove(i+1);
                a.remove(i);
                i--;
                check=false;
            }
          }
          if(check){
        System.out.println(a.size());
        return;
    }}}
}
