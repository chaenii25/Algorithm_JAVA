import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n  = Integer.parseInt(br.readLine());
        int[] nArray = new int[n];
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            nArray[i] = Integer.parseInt(st1.nextToken());
        }

        int m = Integer.parseInt(br.readLine());
        int[] mArray = new int[m];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            mArray[i] = Integer.parseInt(st2.nextToken());
        }

        Arrays.sort(nArray);

        for (int x : mArray) {
            int idx = Arrays.binarySearch(nArray, x);
            sb.append(idx >= 0 ? 1 : 0).append('\n');
        }

        System.out.println(sb.toString());
    }
}