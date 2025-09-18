import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        int num = Integer.parseInt(str[0]);
        int max = Integer.parseInt(str[1]);

        Map<Integer, Integer> map = new LinkedHashMap<>();

        String[] num2 = br.readLine().split(" ");

        for (int i = 0; i < num; i++) {
            int number = Integer.parseInt(num2[i]);

            if(map.containsKey(number)){
                map.put(number,map.get(number)+1);
            } else {
                map.put(number,1);
            }
        }

        List<Integer> list = new ArrayList<>(map.keySet());

        Collections.sort(list, (a, b) -> {
            return Integer.compare(map.get(b), map.get(a));
        });

        StringBuilder sb = new StringBuilder();
        for (Integer n : list) {
            int count = map.get(n);
            for (int i= 0; i< count; i++) {
                sb.append(n).append(" ");
            }
        }

        System.out.println(sb.toString().trim());

    }
}