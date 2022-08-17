import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */


    public static String findDay(int month, int day, int year) {
        LocalDate dt = LocalDate.of(year, month, day);
        return dt.getDayOfWeek().toString();
    }

}

enum WeekDays {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[] inputs = new int[3];

        for (int i = 0; i < 3; i++) {
            inputs[i] = sc.nextInt();
        }

        int month = inputs[0];
        int date = inputs[1];
        int year = inputs[2];

        System.out.println(Result.findDay(month,date,year));
    }
}
