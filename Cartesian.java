// package TEMP;

// import java.lang.Math;

// class Cartesian {
//     public static void main (String[] args) {
//         Circle c1 = new Circle(4, -1, 3);
//         Circle c2 = new Circle(3, -2, 5);

//         System.out.println(c1.area() + " is the area of c1");
//         c1.smaller(c2).print();
//         System.out.println(c2.isInside(c1));
//     }
// } 

// class Circle {
//     double x, y, r;
//     double d = 2 * r; 

//     double circumference = Math.PI * this.d;

//     public Circle ()
//     {
//         this.x = 0; this.y = 0; this.r = 0;
//     }

//     public Circle (double x, double y, double r)
//     {
//         this.x = x; this.y = y; this.r = r;
//     }

//     public void print ()
//     {
//         System.out.println("The circle is at (" + this.x +", " + this.y + ") with radius " + this.r);
//     }

//     public double distanceFrom (Circle c) 
//     {
//         return round (Math.sqrt(Math.pow(c.x-this.x,2) + Math.pow(c.y-this.y,2)));
//     }

//     public double minDistanceFrom (Circle c) 
//     {
//         return round (Math.abs(Math.sqrt(Math.pow(c.x-this.x,2) + Math.pow(c.y-this.y,2)) - c.r - this.r));
//     }

//     public double distanceFrom () 
//     {
//         return round (Math.sqrt(Math.pow(this.x,2) + Math.pow(this.y,2)));
//     }

//     public double round (double x)
//     {
//        return ((double) Math.round(x*1000))/1000;
//     }

//     public double area()
//     {
//         return round (Math.PI * Math.pow(this.r, 2));
//     }

//     public Circle smaller (Circle a)
//     {
//         if (a.r <= this.r) return a;
//         else return this;
//     }

//     public boolean isInside (Circle a)
//     {
//         if (a.r >= this.r) return false;

//         if (Math.abs(a.x - a.r) >= Math.abs(this.x - this.r)) return false;
//         else if (Math.abs(a.x + a.r) >= Math.abs(this.x + this.r)) return false;
//         else if (Math.abs(a.y - a.r) >= Math.abs(this.y - this.r)) return false;
//         else if (Math.abs(a.y + a.r) >= Math.abs(this.y + this.r)) return false;

//         return true;
//     }
// }
