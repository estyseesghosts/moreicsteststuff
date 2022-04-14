package TEMP;

class Circle63 {
    public static void main (String[] args)
    {
        
    }
}

class Circle {
    double xCoordinate, yCoordinate, radius;

    public Circle(double xCoordinate, double yCoordinate, double radius)
    {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.radius = radius;
    }

    public Circle ()
    {
        this(0, 0, 0);
    }

    public Circle (Circle other)
    {
        this(other.xCoordinate, other.yCoordinate, other.radius);
    }
}