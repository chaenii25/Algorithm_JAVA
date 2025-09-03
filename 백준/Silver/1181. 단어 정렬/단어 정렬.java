import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(bf.readLine());

        Set<String> set = new HashSet<>();
        for (int i = 0; i < num; i++) {
            set.add(bf.readLine());
        }

        List<String> list = new ArrayList<>(set);

        Collections.sort(list, (a, b) -> {
            if (a.length() != b.length()) {
                return a.length() - b.length();
            } else {
                return a.compareTo(b);
            }
        });

        for (String s : list) {
            System.out.println(s);
        }
    }
}