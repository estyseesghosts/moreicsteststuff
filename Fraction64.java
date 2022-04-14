import java.lang.Math;

class Fraction63 {
    public static void main (String[] args)
    {
        Fraction f1 = new Fraction(5, 7);
        Fraction f2 = new Fraction(3, 8);

        f1.print();
        f2.print();

        Fraction f3 = Fraction.sum(f1, f2);
        Fraction f4 = Fraction.product(f1, f2);

        f3.print();
        f4.print();
    }
}

class Fraction {
    private int num, den;

    public Fraction ()
    {
        this(0,1);
    }

    public Fraction (Fraction other)
    {
        this(other.num, other.den);
    }

    public Fraction (int num, int den)
    {
        if (den == 0)
        throw new RuntimeException
            ("Attempt to construct Fraction n/0");

        else if (den < 0)
        {
            this.num = num * -1;
            this.den = den * -1;
        }

        else
        {
            this.num = num;
            this.den = den;
        }
    }

    public void print ()
    {
        System.out.println (this.num + "/" + this.den);
    }

    public int getNumerator ()
    {
        return this.num;
    }

    public int getDenomenator ()
    {
        return this.den;
    }

    public Fraction reciprocal ()
    {
        if (this.num == 0)
            throw new RuntimeException
                ("Attempt to invert Fraction with value zero");

        return new Fraction(this.den, this.num);
    }

    public static Fraction reduce (Fraction other) 
    {
        for (int i = other.num; i >= 1; i--) 
        {
            if (other.num % i == 0 && other.den % i == 0) 
            { 
                other.num = other.num/i;
                other.den = other.den/i;
            }
        }
        return other;
    }

    public void reduce () 
    {
        for (int i = this.num; i >= 1; i--) 
        {
            if (this.num % i == 0 && this.den % i == 0) 
            { 
                this.num = this.num/i;
                this.den = this.den/i;
            }
        }
    }

    public static Fraction sum (Fraction f1, Fraction f2)
    {
        return reduce(new Fraction((f1.num*f2.den)+(f2.num*f1.den), f1.den*f2.den));
    }

    public static Fraction product (Fraction f1, Fraction f2)
    {
        return reduce(new Fraction (f1.num*f2.num, f1.den+f2.den));
    }

    public static Fraction difference (Fraction f1, Fraction f2)
    {
        return sum(f1, new Fraction(f2.num*(-1), f2.den));
    }

    public static Fraction quotient (Fraction f1, Fraction f2)
    {
        return product(f1, f2.reciprocal());
    }

    public void plusEquals (Fraction other)
    {
        this.num = this.num*other.den + other.num*this.den;
        this.den = this.den*other.den;
        reduce();
    }

    public void timesEquals (Fraction other)
    {
        this.num = this.num*other.den + other.num*this.den;
        this.den = this.den*other.den;
        reduce();
    }

    public void minusEquals (Fraction other)
    {
        this.plusEquals(new Fraction(other.num*(-1), other.den));
    }

    public void divideEquals (Fraction other)
    {
        this.timesEquals(other.reciprocal());
    }
}