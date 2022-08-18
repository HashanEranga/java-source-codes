import java.util.Scanner;

import static java.lang.Math.max;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input an integer : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int max;
        // code here
        max = max(num1,num2);
//        max = num2;
//        if(num1>num2)
//            max = num2;
        System.out.println("Max Number is : "+max);
    }
}
