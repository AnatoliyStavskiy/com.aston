package lesson5;

public class Rectangle implements Calculation {

    private double width;
    private double height;
    private String filling;
    private String borderColor;

    @Override
    public double perimeter() {
        return (width + height) * 2;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public void print() {
        System.out.println("[ " + perimeter() + ", " + area() + ", " + filling + ", " + borderColor + " ]");
    }

    public Rectangle(double width, double height, String filling, String borderColor) {
        this.width = width;
        this.height = height;
        this.filling = filling;
        this.borderColor = borderColor;
    }
}
