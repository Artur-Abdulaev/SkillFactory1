package skillFactoryTasks.secondPracticeWeek.task9;

public class Square extends Quadrangle implements Figure {

    public Square(int a, String color) {
        super(a, a, color);
    }

    @Override
    public double area() {
        return Math.pow(this.a, 2);
    }

    @Override
    public double perimeter() {
        return this.a * 4;
    }

    @Override
    double getLargeDiagonal() {
        return this.a * Math.sqrt(2);
    }

    @Override
    double getHeight() {
        return this.a;
    }

    @Override
    String getColor() {
        return this.color;
    }
}
