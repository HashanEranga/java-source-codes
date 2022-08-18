import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        // Write your code here.
        String[] splitString = s.split("[^a-zA-Z]");

//        System.out.println(splitString.length);
//        for (String word: splitString) {
//            System.out.println(word);
//        }

        int numTokens = 0;

        for (String value : splitString)
            if (value.length() > 0)
                numTokens++;

         System.out.println(numTokens);

        for (String value : splitString)
            if (value.length() > 0)
                System.out.println(value);
        scan.close();
    }
}

