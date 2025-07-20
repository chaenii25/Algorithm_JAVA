import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken()); 
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken()); 
            int y2 = Integer.parseInt(st.nextToken());

            int n = Integer.parseInt(br.readLine()); 
            int result = 0;

            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                int cx = Integer.parseInt(st.nextToken());
                int cy = Integer.parseInt(st.nextToken());
                int r = Integer.parseInt(st.nextToken());

                boolean startInside = isInside(x1, y1, cx, cy, r);
                boolean endInside = isInside(x2, y2, cx, cy, r);

                if (startInside ^ endInside) result++;
            }

            System.out.println(result);
        }
    }

    private static boolean isInside(int x, int y, int cx, int cy, int r) {
        int dx = x - cx;
        int dy = y - cy;
        return dx * dx + dy * dy < r * r;
    }
}
