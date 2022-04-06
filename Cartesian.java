import java.lang.Math;

class Cartesian {
    public static void main (String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();

        c1.x = 1; c1.y = 2; c1.r = 4;
        c2.x = -2; c2.y = 0; c2.r = 2;

        //double distanceX = distanceFromOrigin(c1.x, c1.y);
        //double distanceY = distanceFromOrigin(c2.x, c2.y);

        //double distanceSeperation = Math.abs(distanceX - distanceY);

        //System.out.println(distance);
        System.out.println(c1.area());
    }

    static double distanceFromOrigin(int x, int y) {
        return Math.sqrt(Math.pow(Math.abs(0-x), 2) + Math.pow(Math.abs(0-y), 2));
    }
}

class Circle {
    double x, y, r;

    public double area() {
        return 3.141592654 * Math.pow(r, 2);
    }
}