import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
            ArrayList<String> list = (ArrayList<String>) ois.readObject();
            ois.close();

            Set<Integer> numbers = new TreeSet<>();

            for (String line : list) {
                String[] tokens = line.split("\\D+"); 
                for (String token : tokens) {
                    if (!token.isEmpty()) {
                        try {
                            int number = Integer.parseInt(token);
                            numbers.add(number);
                        } catch (NumberFormatException e) {
                        }
                    }
                }
            }

            for (int number : numbers) {
                System.out.println(number);
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
