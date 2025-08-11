import java.io.*;

public class Main {
    static final int[][] LINES = {
            {0,1,2},{3,4,5},{6,7,8}, // rows
            {0,3,6},{1,4,7},{2,5,8}, // cols
            {0,4,8},{2,4,6}          
    };

    static boolean win(char[] b, char ch) {
        for (int[] L : LINES) {
            if (b[L[0]] == ch && b[L[1]] == ch && b[L[2]] == ch) return true;
        }
        return false;
    }

    static boolean valid(String s) {
        if (s.length() != 9) return false;
        char[] b = s.toCharArray();
        int x = 0, o = 0, dots = 0;
        for (char c : b) {
            if (c == 'X') x++;
            else if (c == 'O') o++;
            else if (c == '.') dots++;
            else return false; 
        }

        if (!(x == o || x == o + 1)) return false;

        boolean xWin = win(b, 'X');
        boolean oWin = win(b, 'O');

        if (xWin && oWin) return false;

        if (xWin) return x == o + 1;   
        if (oWin) return x == o;      

        return dots == 0 && x == o + 1;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
        String line;
        while ((line = br.readLine()) != null) {
            line = line.trim();
            if (line.equals("end")) break;
            out.append(valid(line) ? "valid" : "invalid").append('\n');
        }
        System.out.print(out.toString());
    }
}
