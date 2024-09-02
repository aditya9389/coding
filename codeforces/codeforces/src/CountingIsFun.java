import java.util.Scanner;

public class CountingIsFun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            long count = 0;

            for (int a = 1; a <= x; a++) {
                for (int b = 1; b <= x - a; b++) {
                    for (int c = 1; c <= x - a - b; c++) {
                        if (a * b + a * c + b * c <= n) {
                            count++;
                        }
                    }
                }
            }
            System.out.println(count);
        }
        scanner.close();

    }
}
//giving tle :(