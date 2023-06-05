package Prob1;

public class Main {
    public static void printTotal(Shape[] shapes)
    { // Implement your code
        double sum = 0;
        for (Shape shape : shapes)
            sum += shape.calculateArea();
        System.out.println(sum);

    }
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Circle("Orange", 2.3);
        shapes[1] = new Rectangle("Blue", 2.5, 3.5);
        shapes[2] = new Rectangle("Red", 3, 4);
        shapes[3] = new Square("Black", 2);
        shapes[4] = new Square("Green", 3);
        printTotal(shapes);
    }
}
