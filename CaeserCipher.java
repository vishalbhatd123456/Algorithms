import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the caesarCipher function below.
    static String caesarCipher(String s, int k) {
        char[] arr = s.toCharArray();
        k = k%26;
        for(int i = 0;i< arr.length;i++){
            int num = 0;
            int ch = (int)arr[i];
            if(ch >= 65 && ch <= 90){
                num = (int) arr[i] + k;
                if(num > 90)num = num - 26;
                arr[i] = (char) num;
            } else if(ch >= 97  && ch <= 122){
                num = (int)arr[i] + k;
                if(num > 122) num = num - 26;
                arr[i] = (char)num;
            }
        }
        return String.valueOf(arr);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = caesarCipher(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
