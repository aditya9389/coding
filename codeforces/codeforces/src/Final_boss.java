import java.util.*;

public class Final_boss{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            long h = sc.nextLong();
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; ++i)
            {
                a[i] = sc.nextInt();
                h -= a[i];
            }
            for (int i = 0; i < n; ++i)
                b[i] = sc.nextInt();
            if (h <= 0)
            {
                System.out.println(1);
                continue;
            }
            long l = 0, r = h * 200000, ans = 0;
            while (l <= r)
            {
                long mid = l + (r - l) / 2;
                long s = 0;
                for (int i = 0; i < n; ++i)
                    s += (mid / b[i]) * a[i];
                if (h - s <= 0) {
                    ans = mid;
                    r = mid - 1;
                } else
                    l = mid + 1;
            }
            System.out.println(ans + 1);
        }
    }
}
