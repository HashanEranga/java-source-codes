import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        boolean isPalindrome = false;
        for (int i = 0; i < A.length(); i++) {
            isPalindrome = A.substring(i, 1+i).equals(A.substring(A.length() - 1 - i, A.length() - i));
            if(i==A.length()/2) break;
        }
        System.out.println((isPalindrome)? "Yes" : "No");
    }
}




