import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        char[] arrA = a.toLowerCase().toCharArray();
        char[] arrB = b.toLowerCase().toCharArray();

        int lenA = a.length();
        int lenB = b.length();

        if(lenA!=lenB) return false;

//        Arrays.sort(arrA);
//        Arrays.sort(arrB);

        char[] sortedArrA = ArrSort(arrA);
        char[] sortedArrB = ArrSort(arrB);


        for (int i = 0; i < arrA.length; i++) {
            if(sortedArrA[i] != sortedArrB[i]) return false;
        }

        return true;

    }

    private static char[] ArrSort(char[] arr) {

        char temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[i]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

}
