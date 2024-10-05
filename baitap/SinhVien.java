package baitap;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class SinhVien {
    private String ten,sdt,id;
    private int nhom;
    public deTai a;

    SinhVien(String id,String ten,String sdt,int nhom) {
        this.id=id;
        this.ten=ten;   
        this.sdt=sdt;
        this.nhom=nhom;
        
}   
public int getNhom(){
    return nhom;
}
    public String getDetaiBt(){
        return a;
    }
    @Override
    public String toString(){
        return id+" " +ten+" "+sdt;
    }
    }
    


