import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Long total = Long.parseLong(br.readLine());
        int num = Integer.parseInt(br.readLine());

        int sum = 0;
        for (int i =0; i < num; i++) {
            String[] str = br.readLine().split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);

            sum += (a * b);
        }

        if (total == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}