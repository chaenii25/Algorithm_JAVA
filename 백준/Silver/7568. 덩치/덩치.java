import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());

        int[][] arr = new int[n][2];

        String[] str;
        for(int i = 0;i < n ; i++ ) {
            str = bufferedReader.readLine().split(" ");
            arr[i][0] = Integer.parseInt(str[0]);
            arr[i][1] = Integer.parseInt(str[1]);
        }

        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < n ; i++) {
            int rank = 1;

            for(int j = 0; j < n ; j ++) {
                if( i== j ) {
                    continue;
                }
                if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
                    rank++;
                }
            }

            stringBuilder.append(rank).append(" ");
        }
        System.out.println(stringBuilder);
    }
}