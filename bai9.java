    import java.util.*;

    public class bai9 {
    
       
        public static int cal(String s, String target) {
            String combined = s + s; 
            return combined.indexOf(target); 
        }
    
        public static int findMin(String[] strings, int N) {
            String firstString = strings[0]; 
            int minSteps = Integer.MAX_VALUE; 
    
           
            for (int i = 0; i < firstString.length(); i++) {
                int currentSteps = 0;
                String target = firstString.substring(i) + firstString.substring(0, i); // Xoay chuỗi đầu tiên
    
               
                for (int j = 0; j < N; j++) {
                    int steps = cal(strings[j], target);
                    if (steps == -1) { 
                        return -1; 
                    }
                    currentSteps += steps; 
                }
    
                minSteps = Math.min(minSteps, currentSteps); 
            }
    
            return minSteps;
        }
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            sc.nextLine();
    
            String[] strings = new String[N];
            for (int i = 0; i < N; i++) {
                strings[i] = sc.nextLine();
            }
    
            int result = findMin(strings, N);
    
            if (result == -1) {
                System.out.println("-1");
            } else {
                System.out.println(result);
            }
        }
    } 

