public class Geometry {

    public static void main(String []args){
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();

        System.out.println(
                areaIsGreaterThan(circle, rectangle));
    }

    public static boolean areaIsGreaterThan(
            Measurable shapeA, Measurable shapeB) {
        return shapeA.calculateArea() >= shapeB.calculateArea();
    }
}
