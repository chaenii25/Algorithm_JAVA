import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine(); // 입력 단어

        int totalTime = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if ('A' <= c && c <= 'C') totalTime += 3;        // 2번
            else if ('D' <= c && c <= 'F') totalTime += 4;   // 3번
            else if ('G' <= c && c <= 'I') totalTime += 5;   // 4번
            else if ('J' <= c && c <= 'L') totalTime += 6;   // 5번
            else if ('M' <= c && c <= 'O') totalTime += 7;   // 6번
            else if ('P' <= c && c <= 'S') totalTime += 8;   // 7번
            else if ('T' <= c && c <= 'V') totalTime += 9;   // 8번
            else if ('W' <= c && c <= 'Z') totalTime += 10;  // 9번
        }

        System.out.println(totalTime);
    }
}
