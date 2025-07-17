import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String[] parts = br.readLine().split(" ");
            int N = Integer.parseInt(parts[0]);
            String M = parts[1];
            for(int j = 0; j < M.length(); j++){
                for(int k = 0; k < N; k++){
                    sb.append(M.charAt(j));
                }
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}