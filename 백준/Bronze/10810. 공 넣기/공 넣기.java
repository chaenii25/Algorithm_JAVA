import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        int[] arr = new int[n];

        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());

            for (int l = (j-1) ; l <= (k-1) ; l++) {
                arr[l] = h;
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}