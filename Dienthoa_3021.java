import java.util.*;
public class ad {
    public static char trans(char s){
        switch(s){
            case 'a':
            case 'b':
            case 'c':
                return '2';
            case 'd':
            case 'e':
            case 'f':
                return '3';
            case 'g':
            case 'h':
            case 'i':
                return '4';
            case 'j':
            case 'k':
            case 'l':
                return '5';
            case 'm':
            case 'n':
            case 'o':
                return '6';
            case 'p':
            case 'q':
            case 'r':
            case 's':
                return '7';
            case 't':
            case 'u':
            case 'v':
                return '8';
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                return '9';
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        while(n-->0){
            String s=sc.nextLine(),res1="";
             StringBuilder res=new StringBuilder();
            for(int i=0;i<s.length();i++){
                res.append(trans(Character.toLowerCase(s.charAt(i))));
            }
            
            if(res.toString().equals(res.reverse().toString())){
                System.out.println("YES");
            }else System.out.println("NO");
           
        }
    }
}
