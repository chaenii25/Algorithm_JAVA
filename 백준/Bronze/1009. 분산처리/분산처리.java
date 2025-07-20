import java.io.*;
import java.util.*;

public class Main {
    static Map<Integer, int[]> patternMap = new HashMap<>();

    public static void main(String[] args) throws IOException {
        initPatternMap();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); 
        StringBuilder sb = new StringBuilder();

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()) % 10; 
            int b = Integer.parseInt(st.nextToken());

            if (b == 0) {
                sb.append(10).append('\n'); 
                continue;
            }

            if (a == 0) {
                sb.append(10).append('\n');
                continue;
            }

            int[] pattern = patternMap.get(a);
            int index = (b - 1) % pattern.length;
            sb.append(pattern[index]).append('\n');
        }

        System.out.print(sb);
    }

    private static void initPatternMap() {
        patternMap.put(0, new int[]{10});
        patternMap.put(1, new int[]{1});
        patternMap.put(2, new int[]{2, 4, 8, 6});
        patternMap.put(3, new int[]{3, 9, 7, 1});
        patternMap.put(4, new int[]{4, 6});
        patternMap.put(5, new int[]{5});
        patternMap.put(6, new int[]{6});
        patternMap.put(7, new int[]{7, 9, 3, 1});
        patternMap.put(8, new int[]{8, 4, 2, 6});
        patternMap.put(9, new int[]{9, 1});
    }
}
