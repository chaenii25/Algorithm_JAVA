import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();

        int[] alphabet = new int[26];
        for (int i = 0; i < 26; i++) {
            alphabet[i] = -1;

        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int index = ch - 'a';

            if (alphabet[index] == -1) {
                alphabet[index] = i;
            }
        }

        for (int i : alphabet) {
            sb.append(i + " ");
        }

        System.out.println(sb.toString());
    }
}