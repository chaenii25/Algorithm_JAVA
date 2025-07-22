import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N =  Integer.parseInt(br.readLine());

        if(N == 0) {
            System.out.println(0);
            return;
        }

        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            int M = Integer.parseInt(br.readLine());
            arr[i] = M;
        }

        Arrays.sort(arr);

        int cut = (int)Math.round(N * 0.15);

        int sum = 0;
        for(int i = cut; i < N - cut; i++) {
            sum += arr[i];
        }

        int count = N - cut*2; //수정된배열의 길이
        double average = (double)sum / count;

        System.out.println((int)Math.round(average));
    }
}