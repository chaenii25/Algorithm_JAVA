import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < num; i++) {
            String title = br.readLine();

            if(map.containsKey(title)){
                map.put(title,map.get(title)+1);
            } else {
                map.put(title,1);
            }
        }

        String best = "";
        int max = 0;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String title = entry.getKey();
            int count = entry.getValue();

            if (count > max) {
                max = count;
                best = title;
            } else if (count == max) {
                if (title.compareTo(best) < 0) {
                    best = title;
                }
            }
        }
        
        System.out.println(best);
    }
}