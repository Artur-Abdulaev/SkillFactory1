package skillFactoryTasks.secondPracticeWeek.task9;

public class Rectangle extends Quadrangle implements Figure {

    public Rectangle(int a, int b, String color) {
        super(a, b, color);
    }

    @Override
    public double area() {
        return this.a * this.b;
    }

    @Override
    public double perimeter() {
        return (this.a + this.b) * 2;
    }

    @Override
    double getLargeDiagonal() {
        return Math.sqrt(Math.pow(this.a, 2) + Math.pow(this.a, 2));
    }

    @Override
    double getHeight() {
        return Math.min(a, b);
    }

    @Override
    String getColor() {
        return this.color;
    }
}
