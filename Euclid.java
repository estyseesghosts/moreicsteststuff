class Euclid {
    public static void main (String[] args) {
        System.out.println(gcd(21, 7));
        System.out.println(gcd(0, 3));
    }

    public static int gcd (int m, int n) {
        if (m <= 0 || n <= 0) return 0;
        if (m == n) return m;

        else if (m > n) {
            int gcd = 0;
            for (int i = 1; i < m; i++) {
                if (m % i == 0) {
                    if (n % i == 0) {
                        gcd = i;
                    }
                }
            }
            return gcd;
        }

        else if (n > m) {
            return gcd(n, m);
        }
    return 1;
    }
}