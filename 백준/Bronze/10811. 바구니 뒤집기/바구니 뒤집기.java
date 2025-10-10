import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str =  br.readLine().split(" ");

        int size =  Integer.parseInt(str[0]);
        int num = Integer.parseInt(str[1]);

        int[] arr = new int[size];

        for (int i =1; i<=size; i++) {
            arr[i-1] = i;
        }

        for (int i =0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            int l = x-1;
            int r = y-1;

            while (l < r) {
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
        }

        StringBuffer sb = new StringBuffer();
        for (int i : arr) {
            sb.append(i).append(" ");
        }

        System.out.println(sb.toString());
    }
}