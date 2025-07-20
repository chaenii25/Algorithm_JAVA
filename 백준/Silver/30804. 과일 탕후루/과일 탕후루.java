import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] fruits = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            fruits[i] = Integer.parseInt(st.nextToken());
        }

        Map<Integer, Integer> count = new HashMap<>();
        int left = 0, answer = 0;

        for (int right = 0; right < N; right++) {
            int f = fruits[right];
            count.put(f, count.getOrDefault(f, 0) + 1);

            while (count.size() > 2) {
                int lf = fruits[left];
                count.put(lf, count.get(lf) - 1);
                if (count.get(lf) == 0) {
                    count.remove(lf);
                }
                left++;
            }

            answer = Math.max(answer, right - left + 1);
        }

        System.out.println(answer);
    }
}
