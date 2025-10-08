import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] lines = new String[5];
        for (int i = 0; i < 5; i++) {
            lines[i] = br.readLine();
        }

        StringBuilder sb = new StringBuilder(75); // 최대 5*15
        for (int col = 0; col < 15; col++) {
            for (int row = 0; row < 5; row++) {
                String s = lines[row];
                if (col < s.length()) {
                    sb.append(s.charAt(col));
                }
            }
        }

        System.out.println(sb.toString());
    }
}
