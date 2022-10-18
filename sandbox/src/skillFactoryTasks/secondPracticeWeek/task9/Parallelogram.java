package skillFactoryTasks.secondPracticeWeek.task9;

public class Parallelogram extends Quadrangle implements Figure {

    double alpha;
    double beta;

    public Parallelogram(int a, int b, double alpha, double beta, String color) {
        super(Math.min(a, b), Math.max(a, b), color);
        this.alpha = Math.toRadians(alpha);
        this.beta = Math.toRadians(beta);
    }

    @Override
    public double area() {
        return getHeight() * this.b;
    }

    @Override
    public double perimeter() {
        return 2 * (this.a + this.b);
    }

    @Override
    double getLargeDiagonal() {
        return Math.sqrt(Math.pow(this.a, 2) + Math.pow(this.b, 2) - 2 * this.a * this.b * Math.cos(beta));
    }


    @Override
    double getHeight() {
        return this.a * Math.sin(alpha);
    }

    @Override
    String getColor() {
        return this.color;
    }
}
