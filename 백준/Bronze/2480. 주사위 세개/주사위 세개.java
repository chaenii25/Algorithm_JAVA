import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken()); 
        int b = Integer.parseInt(st.nextToken()); 
        int c = Integer.parseInt(st.nextToken()); 

        int reward;

        if (a == b && b == c) {
            reward = 10000 + a * 1000;
        } else if (a == b || a == c) {
            reward = 1000 + a * 100;
        } else if (b == c) {
            reward = 1000 + b * 100;
        } else {
            int max = Math.max(a, Math.max(b, c));
            reward = max * 100;
        }

        System.out.println(reward);
    }
}
