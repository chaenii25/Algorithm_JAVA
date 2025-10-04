import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str1 = br.readLine().split(" ");
        int n = Integer.parseInt(str1[0]);
        int m = Integer.parseInt(str1[1]);

        int[] arr  = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = (i+1);
        }
        
        for (int i = 0; i < m; i++) {
            int temp = 0;

            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            temp = arr[x-1];
            arr[x-1] = arr[y-1];
            arr[y-1] = temp;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(arr[i] + " ");
        }

        System.out.println(sb.toString());
    }
}