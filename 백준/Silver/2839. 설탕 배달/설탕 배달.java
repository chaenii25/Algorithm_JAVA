import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(divide(n));
    }

    public static int divide(int n) {
        int count = 0;

        while (n >= 0) {
            if (n % 5 == 0) {
                count += n / 5;
                return count;
            }
            n -= 3;
            count++;
        }

        return -1;
    }
}