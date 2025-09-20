import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        if ((90 <= num) && (num <=100)) System.out.println("A");
        else if ((80 <= num) && (num <=89)) System.out.println("B");
        else if ((70 <= num) && (num <=79)) System.out.println("C");
        else if ((60 <= num) && (num <=69)) System.out.println("D");
        else System.out.println("F");
    }
}