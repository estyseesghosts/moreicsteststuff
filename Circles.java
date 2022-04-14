package TEMP;

import java.lang.Math;

class Circles {
    public static void main (String[] args) {
        Circle c1 = new Circle(4, -1, 3);
        Circle c2 = new Circle(3, -2, 5);

        c1.printArea();
        c1.smaller(c2).print();
        c2.isInside(c1);
    }
} 

class Circle {
    double xCoordinate, yCoordinate, radius;

    /**
     * Empty initializer
     */
    public Circle ()
    { this.xCoordinate = 0; this.yCoordinate = 0; this.radius = 1; }

    /**
     * Complete initializer
     * @param x x coordinate of the center
     * @param y y coordinate of the center
     * @param r the radius 
     */
    public Circle (double x, double y, double r)
    { this.xCoordinate = x; this.yCoordinate = y; this.radius = r; }

    /**
     * Returns the coordinates of the center of the circle
     * @return the coordinates of the center of the circle
     */
    public String coords ()
    { return "(" + xCoordinate + ", " + yCoordinate + ")"; }

    /**
     * Prints the information of the circle
     */
    public void print ()
    { System.out.println("The circle is at " + this.coords() + " with radius " + this.radius); }

    /**
     * Calculates the distance from the origin
     * @return the distance from the center of the circle to (0, 0)
     */
    public double distanceFrom () 
    { return round (Math.sqrt(Math.pow(this.xCoordinate,2) + Math.pow(this.yCoordinate,2))); }

    /**
     * Returns the distance between the centers of two circles
     * @param other the other circle to be compared
     * @return a double, the distance between the two 
     */
    public double distanceFrom (Circle other) 
    { return round (Math.sqrt(Math.pow(other.xCoordinate-this.xCoordinate,2) + Math.pow(other.yCoordinate-this.yCoordinate,2))); }

    /**
     * Minimum distance from the origin
     * @return The distance from the origin, less the radius
     */
    public double minDistanceFrom ()
    { return round (this.distanceFrom() - this.radius); }

    /**
     * Minimum distance from the center of another circle
     * @param other the other circle
     * @return The distance between the centers of the two circles, less the two radii, so it's actually the minimum distance
     */
    public double minDistanceFrom (Circle other) // same as distanceFrom (Circle a) but lesses the radii
    { return round (this.distanceFrom(other) - other.radius - this.radius); }

    /**
     * Rounds x to 3 decimal places
     * @param x to be rounded
     * @return x rounded to 3 decimal places
     */
    public double round (double x) 
    { return ((double) Math.round(x*1000))/1000; }

    /**
     * Calculates the area and returns it as a double, rounded to 3 places
     * @return double area 
     */
    public double area() // A = pi * r^2
    { return round (Math.PI * Math.pow(this.radius, 2)); }

    /**
     * Prints the area, calculated by Circle.area()
     */
    public void printArea ()
    { System.out.println("The area of this circle is " + area()); }

    /**
     * Checks which circle is smaller, this or other
     * @param other
     * @return whichever circle is larger
     */
    public Circle smaller (Circle other)
    {
        if (other.radius <= this.radius) return other;
        else return this;
    }

    /**
     * Tells you if this circle is wholly inside the other circle
     * @param other the circle to check if this one is inside of 
     * @return true if it is, false otherwise
     */
    public boolean inside (Circle other)
    {
        if ((this.distanceFrom(other) + this.radius) <= other.radius) return true;
        /*
            basically it gets the distance between the two centers and adds the radius of the smaller circle
            if that is greater than the radius of the large circle then it can't be inside it 
        */
        else return false;
    }

    /**
     * Prints out if this circle is inside circle other
     * Uses Circle.inside(Circle other) to check 
     * @param other
     */
    public void isInside(Circle other)
    {
        String connector;
        if (this.inside(other)) connector = " is ";
        else connector = " is not ";

        System.out.println ("This circle" + connector + "inside of the other.");
    }
}
