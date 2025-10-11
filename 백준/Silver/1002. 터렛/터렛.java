import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());  // 테스트 케이스 개수

        StringBuilder sb = new StringBuilder();

        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());

            // 두 점 사이 거리의 제곱 (루트를 쓰지 않기 위해 제곱값으로 비교)
            int dx = x2 - x1;
            int dy = y2 - y1;
            int distanceSquared = dx * dx + dy * dy;

            int rSum = (r1 + r2) * (r1 + r2);      // 반지름 합의 제곱
            int rDiff = (r1 - r2) * (r1 - r2);     // 반지름 차의 제곱

            if (distanceSquared == 0 && r1 == r2) {
                // 두 원이 완전히 일치
                sb.append(-1).append("\n");
            } else if (distanceSquared > rSum || distanceSquared < rDiff) {
                // 만나지 않음 (멀리 떨어졌거나, 한 원이 다른 원 안에 있음)
                sb.append(0).append("\n");
            } else if (distanceSquared == rSum || distanceSquared == rDiff) {
                // 한 점에서 만남 (외접 또는 내접)
                sb.append(1).append("\n");
            } else {
                // 두 점에서 만남
                sb.append(2).append("\n");
            }
        }

        System.out.print(sb);
    }
}
