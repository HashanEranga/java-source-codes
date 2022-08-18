import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int lenA = A.length();
        int lenB = B.length();
        System.out.println(lenA+lenB);

        if(A.compareTo(B)>0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        String comb = A+B;

        System.out.println(comb.substring(0,1).toUpperCase() + " " + comb.substring(1));

    }
}



