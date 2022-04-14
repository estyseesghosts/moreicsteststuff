package TEMP;

public class Imaginary {
    public static void main (String[] args)
    {
        Complex a = new Complex(2, 3);
        Complex b = new Complex(5, -4.0);

        a.add(b);

        a.print();
    }
}

class Complex {
    double realNumber; 
    double imaginaryNumber;

    public Complex (double rn, double in) 
    {
        this.realNumber = rn;
        this.imaginaryNumber = in;
    }

    public Complex ()
    {
        this.realNumber = 1;
        this.imaginaryNumber = 1;
    }

    public static Complex add (Complex a, Complex b)
    {
        return new Complex(a.realNumber + b.realNumber, a.imaginaryNumber + b.imaginaryNumber);
    }

    public void add (Complex a)
    {
        this.realNumber += a.realNumber;
        this.imaginaryNumber += a.imaginaryNumber;
    }

    public void print ()
    {
        System.out.println(this.realNumber + " + " + this.imaginaryNumber + "i");
    }
    
    public static void print (Complex a)
    {
         System.out.println(a.realNumber + " + " + a.imaginaryNumber + "i");
    }

    public double modulus ()
    {
        return Math.sqrt(Math.pow(this.realNumber,2) + Math.pow(this.imaginaryNumber, 2));
    }

    public void scale (double x) 
    {
        this.realNumber *= x;
        this.imaginaryNumber *= x;
    }
}
