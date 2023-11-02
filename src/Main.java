import java.io.*;

public class Main {
    public static void main(String[] args) {
        subham();

        int testCase = 1;

        while (testCase > 0) {
            solve();
            testCase--;
        }
    }

    static void subham() {

    }

    static void solve() {
        String s;
        char c = 'a';
        String d = "hello world";
        String p = "           ";
        int n = 12;
        int x;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 1e7; j++) {
                if (p.charAt(i) == d.charAt(i)) {
                    i++;
                }
                System.out.println(p);
                System.out.println();
                p = p.substring(0, i) + (char)(p.charAt(i) + 1) + p.substring(i + 1);
                for (x = 0; x < 1e5; x++) {
                    int h = 0;
                    h += h;
                }
            }
            System.out.println();
        }
    }
}