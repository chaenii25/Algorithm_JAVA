import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());

        String first = br.readLine();
        char[] pattern = first.toCharArray();

        for (int i = 1; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < pattern.length; j++) {
                if (pattern[j] != s.charAt(j)) pattern[j] = '?';
            }
        }

        System.out.println(new String(pattern));
    }
}
