import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(divide(n));
    }

    static int divide(int n) {
        int fiveCount = n / 5;

        while(fiveCount >= 0) {
            int remain = n -  (fiveCount * 5);

            if(remain % 3 == 0) {
                int threeCount = remain /3;
                return threeCount + fiveCount;
            }
            fiveCount--;
        }
        return -1;
    }
}
