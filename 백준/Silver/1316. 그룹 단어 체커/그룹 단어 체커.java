import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int count = 0;
        for (int i = 0; i < num; i++) {
            String word  = br.readLine();
            Set<Character> seen = new HashSet<>();
            boolean isGroup = true;

            char prev = 0;

            for(int j = 0; j < word.length(); j++) {
                char ch = word.charAt(j);

                if(ch != prev) {
                    if(seen.contains(ch)) {
                        isGroup = false;
                        break;
                    }

                    seen.add(ch);
                }
                prev = ch;
            }

            if(isGroup) {
                count++;
            }
        }

        System.out.println(count);
    }
}