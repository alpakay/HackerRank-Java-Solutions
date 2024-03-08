import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

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
        String[] days = {"MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY"};
        int indeks = 5;     //    01//01/2000 is Saturday
        for(int i = 2000; i < year; i++){
            indeks++;
            if(i % 100 == 0 && i % 400 == 0){
                indeks++;
            }
            else if(i % 4 == 0){
                indeks++;
            }
            System.out.println(indeks);
        }
        for(int i = 1; i < month; i++){
            
            if(i <= 7){
                if(i % 2 == 1){
                    indeks += 31;
                }
                if(i == 2){
                    if((year % 100 == 0 && year % 400 == 0) ^ year % 4 == 0) indeks += 29;
                    else indeks += 28;
                }
                else if(i % 2 == 0){
                    indeks += 30;
                }
            }
            if(i > 7){
                if(i % 2 == 0){
                    indeks += 31;
                }
                if(i % 2 == 1){
                    indeks += 30;
                }
            }
            System.out.println("ay"+indeks);
        }
        indeks += day - 1;
        indeks = indeks % 7;
         return days[indeks];
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
