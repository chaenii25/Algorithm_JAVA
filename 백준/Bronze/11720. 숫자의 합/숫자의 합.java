import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n  = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int total = 0;

        String str = br.readLine();

        for (int i = 0; i < n; i++) {
            arr[i] = str.charAt(i) - '0';
            total += arr[i];
        }

        System.out.println(total);
    }
}