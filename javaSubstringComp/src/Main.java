import java.util.Scanner;

public class Main {

    public static String getSmallestAndLargest(String s, int k) {
        String currString = s.substring(0,k);
        String smallest = currString;
        String largest = currString;
        
        // Complete the function
       for (int i = k; i < s.length(); i++) {
            currString = currString.substring(1, k) + s.charAt(i);
            if (largest.compareTo(currString) < 0)
                 largest = currString;
            if (smallest.compareTo(currString) > 0)
                 smallest = currString;
        }
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}