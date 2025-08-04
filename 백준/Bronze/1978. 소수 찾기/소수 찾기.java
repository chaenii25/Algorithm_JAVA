import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String[] tokens = br.readLine().split(" ");
        
        int count = 0;
        for (int i =0; i< num; i++) {
            int value = Integer.parseInt(tokens[i]);
            if(isPrime(value)) count++;
        }
        
        System.out.println(count);
    }
    
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}