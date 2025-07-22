import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];

        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();

        int[] nArr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            set.add(arr[i] % 42);
        }

        System.out.println(set.size());
    }
}