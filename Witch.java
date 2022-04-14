public class Witch {
    public static void main (String[] args)
    {
        Child a = new Child(178, 80.5);
        Child b = new Child(177, 80.0);
        Child c = new Child(180, 81);
        Child d = new Child(165, 74);

        System.out.println(a.equals(b)); // true
        System.out.println(a.equals(c)); // true
        System.out.println(b.equals(c)); // false
        System.out.println(c.equals(b)); // false
        System.out.println(d.equals(b)); // false
    }
}

class Child {
    private double mass;
    private int height;

    public Child (int height, double mass)
    {
        this.height = height;
        this.mass = mass;
    }

    public Child ()
    {
        this(0, 0);
    }

    public Child (Child other)
    {
        this(other.height, other.mass);
    }

    public boolean equals (Child other)
    {
        return (other.height-2 <= this.height) && (this.height <= other.height+2) && (other.mass-0.5 <= this.mass) && (this.mass <= other.mass+0.5);
    }
}