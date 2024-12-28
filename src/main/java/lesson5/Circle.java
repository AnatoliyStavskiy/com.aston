package lesson5;

public class Circle implements Calculation {

    private double radius;
    private String filling;
    private String borderColor;

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void print() {
        System.out.println("[ " + perimeter() + ", " + area() + ", " + filling + ", " + borderColor + " ]");
    }

    public Circle(double radius, String filling, String borderColor) {
        this.radius = radius;
        this.filling = filling;
        this.borderColor = borderColor;
    }
}
