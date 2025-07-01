import java.util.Scanner;

public class Main {
    static char[][] board;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); 
        int M = sc.nextInt();
        sc.nextLine(); 

        board = new char[N][M];

        for (int i = 0; i < N; i++) {
            board[i] = sc.nextLine().toCharArray();
        }

        int min = Integer.MAX_VALUE;

        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                min = Math.min(min, getRepaintCount(i, j));
            }
        }

        System.out.println(min);
    }

    public static int getRepaintCount(int x, int y) {
        int count1 = 0;
        int count2 = 0; 

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                char current = board[x + i][y + j];

                if ((i + j) % 2 == 0) {
                    if (current != 'W') count1++; 
                    if (current != 'B') count2++; 
                } else {
                    if (current != 'B') count1++;
                    if (current != 'W') count2++;
                }
            }
        }

        return Math.min(count1, count2);
    }
}
