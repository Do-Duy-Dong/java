import java.util.*;
public class Point {
    private String id,name,chuVu;
    private int salary; 
    
    Point(){                        
    }
    Point(String id,String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
     
    public void tinhLuong(){
        String res=this.id.substring(0, 2);
        int index= Integer.parseInt(this.id.substring(2, 4));
        int phu=0;
        if(res.equals("HT")) {
            phu=2000000;
            this.salary=this.salary*index+2000000;

        } else if(res.equals("HP")){
            phu=900000;
            this.salary=this.salary*index+900000;
        } else{
            phu=500000;
            this.salary=this.salary*index+500000;
        }
        System.out.println(this.id+" "+this.name+" "+index+" "+phu+" "+this.salary);
       
    } 
    
    
}
