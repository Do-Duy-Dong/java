package baitap;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.*;
    public class a5020_bangDiemHocSinh{
        public static void main(String[] args)  {
            Scanner sc = new Scanner(System.in);
            ArrayList<SinhVien> arr=new ArrayList<>();
            int n=Integer.parseInt(sc.nextLine()),m=Integer.parseInt(sc.nextLine());
            while(n-->0){
                SinhVien a=new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
                arr.add(a);
            }
            int count=1;
            while(m-->0){
                deTai dt=new deTai(sc.nextLine());
                for(SinhVien x: arr){
                    if(x.getNhom()==count){
                        x.deTai=dt;
                    }
                }
                count++;
            }
            int q=Integer.parseInt(sc.nextLine());
            while(q-->0){
                int x=sc.nextInt();
                System.out.println("DANH SACH NHOM "+x+":" );
                for(SinhVien ar:arr){
                    if(ar.getNhom()==x){
                        System.out.println(ar);
                    }
                }
                System.out.println("Bai tap dang ky: "+ar.getDetaiBt());
            }
            

        }
}