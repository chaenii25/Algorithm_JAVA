import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        int num = Integer.parseInt(str[0]);
        int target = Integer.parseInt(str[1]);
        int[] arr = new int[num];

        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < num; i++) {
            arr[i] =  Integer.parseInt(st.nextToken());

            if(arr[i] < target) {
                sb.append(arr[i] + " ");
            }
        }

        System.out.println(sb);
    }
}