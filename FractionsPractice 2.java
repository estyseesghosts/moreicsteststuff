class FractionsPractice {
    public static void main(String[] args) {
        Fraction f = new Fraction(3, 7);
        Fraction g = new Fraction(8, 10);

        f.printFraction();
        //f.reduce(); 
        f.plusEquals(g);
        f.printFraction();

        f.num = 3; f.den = 7;
        f.timesEquals(g);
        f.printFraction();

    }
}

class Fraction {
    int num, den;

    public Fraction (Fraction f) {
        this(f.num, f.den);
    }

    public Fraction (int num, int den) {
        this.num = num;
        this.den = den;
    }

    public Fraction () {
        this.num = 0;
        this.den = 1;
    }

    public void printFraction () {
        System.out.println(this.toString());
    }

    public void plusEquals (Fraction other) {
        num = (num * other.den) + (other.num * den);
        den *= other.den;
        reduce();
    }

    public void timesEquals (Fraction other) {
        num *= other.num;
        den *= other.den;
        reduce();
    }

    public void reduce () {
        for (int i = num; i >= 1; i--) {
            if (num % i == 0) {
                if (den % i == 0) {
                    num = num/i;
                    den = den/i;
                }
                else continue;
            }
        }
    }

    public String toString () {
        return num + "/" + den; 
    }

}