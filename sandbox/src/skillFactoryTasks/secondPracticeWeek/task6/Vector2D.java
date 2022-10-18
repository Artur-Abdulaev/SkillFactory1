package skillFactoryTasks.secondPracticeWeek.task6;

public class Vector2D extends Vector {
    public Vector2D(int x1, int y1, int x2, int y2) {
        super(x1, y1, 0, x2, y2, 0);
    }
    @Override
    double getLength() {
        return Math.sqrt(Math.pow((this.x2 - this.x1), 2) + Math.pow((this.y2 - this.y1), 2));
    }
    @Override
    String getVectorCords() {
        return String.valueOf(this.x2 - this.x1) + " " + String.valueOf(this.y2 - this.y1);
    }
    double getScalarProduct(Vector2D vector) {
        return (this.x2 - this.x1) * (vector.x2 - vector.x1) + (this.y2 - this.y1) * (vector.y2 - vector.y1);
    }

    double getAngle(Vector2D vector) {
        if (this.getLength() == 0 || vector.getLength() == 0) {
            return -2.0;
        }

        return this.getScalarProduct(vector) / (this.getLength() * vector.getLength());
    }
}
