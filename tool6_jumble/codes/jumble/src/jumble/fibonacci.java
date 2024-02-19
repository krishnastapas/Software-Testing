package jumble;

public class fibonacci {
    public static int calfibonacci(int n) {
        if (n <= 1)
            return n;
        else
            return calfibonacci(n - 1) + calfibonacci(n - 2);
    }
}
