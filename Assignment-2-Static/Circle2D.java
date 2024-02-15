public class Circle2D {
    private double x;
    private double y;
    private double radius;

    public Circle2D() {
        this(0, 0, 1);
    }

    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public boolean contains(double x, double y) {
        double distance = Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
        return distance < radius;
    }

    public boolean contains(Circle2D otherCircle) {
        double distanceCenters = Math.sqrt(Math.pow(this.x - otherCircle.x, 2) + Math.pow(this.y - otherCircle.y, 2));
        return distanceCenters + otherCircle.radius < radius;
    }

    public boolean overlaps(Circle2D otherCircle) {
        double distanceCenters = Math.sqrt(Math.pow(this.x - otherCircle.x, 2) + Math.pow(this.y - otherCircle.y, 2));
        return distanceCenters < radius + otherCircle.radius;
    }

    public static void main(String[] args) {
        Circle2D circle1 = new Circle2D(0, 0, 5);
        Circle2D circle2 = new Circle2D(3, 4, 2);

        System.out.println("Area of circle1: " + circle1.getArea());
        System.out.println("Perimeter of circle2: " + circle2.getPerimeter());
        System.out.println("Is point (1, 2) inside circle1? " + circle1.contains(1, 2));
        System.out.println("Do circle1 and circle2 overlap? " + circle1.overlaps(circle2));
    }
}
