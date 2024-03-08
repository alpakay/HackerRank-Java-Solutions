import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int result = a;
            for (int j = 0; j < n; j++) {
                int pow = 1;
                for (int k = 0; k < j; k++) {
                    pow*=2;
                }
                result+=b*pow;
                System.out.printf("%d ",result);
            }
            System.out.println("");
        }
        in.close();
    }
}