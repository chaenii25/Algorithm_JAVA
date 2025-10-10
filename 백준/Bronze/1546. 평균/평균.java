import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size  = Integer.parseInt(br.readLine());
        int[] scores = new int[size];
        int max = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < size; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
        }

        max = scores[0];
        for (int score : scores) {
            max = max > score ? max : score;
        }

        double total = 0.0;
        for (int score : scores) {
            total += (score / (double) max) * 100.0;
        }

        double avg = total / scores.length;
        System.out.println(avg);
    }
}