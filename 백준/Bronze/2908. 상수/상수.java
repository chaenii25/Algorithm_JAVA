import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");

        String a = new StringBuilder(str[0]).reverse().toString();
        String b = new StringBuilder(str[1]).reverse().toString();

        int first = Integer.parseInt(a);
        int second = Integer.parseInt(b);
        
        int answer = (first > second) ? first : second;

        System.out.println(answer);
    }
}