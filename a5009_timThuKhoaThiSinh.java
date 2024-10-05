package baitap;
import java.text.ParseException;
import java.util.*;

class WordSet implements Comparable<WordSet>{
    private String name,date;
    // private float sum;
    private float[] gpa;
    private static int i=1;
    private int id;
    
    WordSet(String name,String date,float[] gpa) {
        this.id=i++;
        this.name=name;
        this.date=date;
        this.gpa=gpa;
    }
    public Float getGpa(){
        float sum=0;
       for(float x:gpa){
            sum+=x;
       }
       return sum;
    }
    @Override
    public String toString(){
        return id+" "+name+" "+date+" "+getGpa();
    }
    @Override
    public int compareTo(WordSet o) {
        return o.getGpa().compareTo(getGpa());
    } 
}

public class a5009_timThuKhoaThiSinh{
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<WordSet> arr=new ArrayList<>();
        while(n-->0){
            float[] a=new float[3];
            String name=sc.nextLine(),date=sc.nextLine();
            for(int i=0;i<3;i++){
                a[i]=Float.parseFloat(sc.nextLine());
            }
            WordSet w=new WordSet(name, date, a); 
            arr.add(w);         
        }
        Collections.sort(arr);
        WordSet tmp=arr.get(0);
        System.out.println(tmp);
        for(int i=1;i<arr.size();i++){
            if(tmp.getGpa().compareTo(arr.get(i).getGpa())==0){ 
            System.out.println(arr.get(i));}           
        }
       

        
    }}