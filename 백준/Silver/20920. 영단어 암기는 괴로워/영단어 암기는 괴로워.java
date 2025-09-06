import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Integer> freq = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String w = br.readLine();
            if (w.length() < M) continue;           // 길이 필터
            freq.put(w, freq.getOrDefault(w, 0) + 1);
        }

        List<String> words = new ArrayList<>(freq.keySet());

        Collections.sort(words, (a, b) -> {
            int fa = freq.get(a), fb = freq.get(b);
            if (fa != fb) return Integer.compare(fb, fa);      // 1) 빈도 내림차순
            if (a.length() != b.length()) return b.length() - a.length(); // 2) 길이 내림차순
            return a.compareTo(b);                              // 3) 사전순 오름차순
        });

        StringBuilder sb = new StringBuilder();
        for (String w : words) sb.append(w).append('\n');
        System.out.print(sb.toString());
    }
}
