import java.util.*;
import java.util.Map.Entry;
public class bai8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
            for(int i=0;i<n;i++){
                int x=sc.nextInt();
                if(map.containsKey(x)){
                    map.put(x,map.get(x)+1);
                }
                else map.put(x,1);
            }
            List<Map.Entry<Integer,Integer>> list=new LinkedList<>(map.entrySet());
            Collections.sort(list,new Comparator<Map.Entry<Integer,Integer>>() {               
                @Override
                public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
                    // TODO Auto-generated method stub
                    return o2.getValue()-o1.getValue();                }
            });
            Map<Integer,Integer> sorted=new LinkedHashMap<>();
            for(Map.Entry<Integer,Integer> entry : list){
                sorted.put(entry.getKey(),entry.getValue());
            }
            for(Map.Entry<Integer,Integer> mp:sorted.entrySet()){
                for(int i=0;i<mp.getValue();i++){
                System.out.print(mp.getKey()+" ");
            }}
            System.out.println();
        }
    }
}
