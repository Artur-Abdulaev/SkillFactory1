package skillFactoryTasks.secondPracticeWeek.task9;

public class Rhombuses extends Quadrangle implements Figure {

    double alpha;
    double beta;

    public Rhombuses(int a, double alpha, double beta, String color) {
        super(a, a, color);
        this.alpha = Math.toRadians(alpha);
        this.beta = Math.toRadians(beta);
    }

    @Override
    public double area() {
        return (getLargeDiagonal() * getSmallDiagonal()) / 2;
    }

    @Override
    public double perimeter() {
        return this.a * 4;
    }

    @Override
    double getLargeDiagonal() {
        return this.a * 2 * Math.cos(this.alpha/2);

    }

    double getSmallDiagonal() {
        return this.a * 2 * Math.sin(this.alpha/2);
    }

    @Override
    double getHeight() {
        return area() / this.a;
    }

    @Override
    String getColor() {
        return this.color;
    }
}