import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// if / else if
        Scanner input = new Scanner(System.in);
        System.out.println("Input Total Marks : ");
        int fm = input.nextInt();

        if ((fm >= 75) & (fm<=100)) {
            System.out.println("A");
        }
        if (fm >= 65) {
            System.out.println("B");
        }
        if (fm >= 45) {
            System.out.println("C");
        }
        if (fm >= 25) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }


    }
}
