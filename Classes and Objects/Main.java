public class Main {

    private int n; //number of sides of polygon
    private double side; //side length of polygon
    private double x; //x-coordinate of center of polygon
    private double y; //y-coordinate of center of polygon

    /*A no-arg constructor that creates a regular polygon with default values*/
    public Main(){
        n=3;
        side=1;
        x=0;
        y=0;
    }

    /*A constructor that creates a regular polygon with the specified number of sides and length of side, centered at ( 0 , 0 ).*/
    public Main(int n, double side){
        this.n=n;
        this.side= side;
        x=0;
        y=0;
    }

    /*A constructor that creates a regular polygon with the specified number of sides, length of side, and x- and y-coordinates.*/
    public Main(int n, double side, double x, double y){
        this.n=n;
        this.side=side;
        this.x=x;
        this.y=y;
    }

    /*The accessor and mutator methods for all data fields.*/
    public int getN(){
        return n;
    }

    public void setN(int n){
        this.n=n;
    }

    public double getSide(){
        return side;
    }

    public void setSide(double side){
        this.side=side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    /*The method getPerimeter() that returns the perimeter of the polygon*/
    public double getPerimeter(){
        return n*side;
    }

    /*The method getArea() that returns the area of the polygon. The formula for computing the area of a regular polygon*/
    public double getArea(){
        return (n*Math.pow(side, 2))/(4*Math.tan(Math.PI/n));
    }
    public static void main(String[] args) {
        Main polygon1= new Main();
        Main polygon2= new Main(6,4);
        Main polygon3= new Main(10, 4, 5.6, 7.8);
        System.out.printf("Perimeter of polygon 1: %.3f", polygon1.getPerimeter());
        System.out.printf("\nArea of polygon 1: %.3f", polygon1.getArea());
        System.out.printf("\nPerimeter of polygon 2: %.3f", polygon2.getPerimeter());
        System.out.printf("\nArea of polygon 2: %.3f", polygon2.getArea());
        System.out.printf("\nPerimeter of polygon 3: %.3f", polygon3.getPerimeter());
        System.out.printf("\nArea of polygon 3: %.3f", polygon3.getArea());
    }
}