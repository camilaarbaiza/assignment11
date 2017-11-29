public class Triangle extends GeometricObject{

    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle(){

    }

    public Triangle(double side1, double side2, double side3){

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(double side1, double side2, double side3, String color, boolean filled){

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        setColor(color);
        setFilled(filled);
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    /**  getArea method calculates the area of a triangle
     *
     * @return   area    area of the triangle
     */
    public double getArea(){

        //s = (side1 + side2 + side3)/2
        // area = ((s(s - side1)(s-side2)(s - side3))^1/2

        double s;
        double area;

        s = (side1 + side2 + side3)/2;

        area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

        return area;
    }

    /**   getPerimeter calculates the perimeter of a triangle
     *
     * @return  side1+side2+side3    perimeter of the triangle
     */
    public double getPerimeter(){

        return side1+side2+side3;
    }

    // Print out the triangle information
    public void printTriangle(){

        System.out.print("Perimeter = " + getPerimeter()+ " Area = " + getArea()+ " color = " + getColor()+ " filled = " +isFilled());
    }

    @Override
    public String toString() {
        return "Triangle: side1=" + side1 + ", side2=" + side2 + ", side3=" + side3;
    }

}//end Triangle class


