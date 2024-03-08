import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        ArrayList<String> str = new ArrayList<>();
        while(scan.hasNext()){
            str.add(scan.nextLine());
        }
        for (int i = 0; i < str.size(); i++) {
            System.out.println((i+1)+" "+str.get(i));
        } 
    }
}