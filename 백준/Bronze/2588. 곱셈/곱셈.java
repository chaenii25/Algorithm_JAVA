import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num1 = Integer.parseInt(br.readLine());
        String num2 = br.readLine();
        
        int a = num2.charAt(2) - '0';
        int b = num2.charAt(1) - '0';
        int c = num2.charAt(0) - '0';
        
        System.out.println(num1*a);
        System.out.println(num1*b);
        System.out.println(num1*c);
        System.out.println(num1*Integer.parseInt(num2));
    }
}