import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        System.out.println(A+B-C);
        String plusString = Integer.toString(A) + Integer.toString(B);
        int plusInt = Integer.parseInt(plusString);

        System.out.println(plusInt - C);
    }
}