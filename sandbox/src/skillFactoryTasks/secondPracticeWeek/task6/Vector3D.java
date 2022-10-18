package skillFactoryTasks.secondPracticeWeek.task6;

public class Vector3D extends Vector{


    public Vector3D(int x1, int y1, int z1, int x2, int y2, int z2) {
        super(x1, y1, z1, x2, y2, z2);
    }

    double getLength() {
        return Math.sqrt(Math.pow(this.x2 - this.x1, 2) + Math.pow(this.y2 - this.y1, 2) + Math.pow(this.z2 - this.z1, 2));
    }

    String getVectorCords(){
        return String.valueOf(this.x2 - this.x1) + " " + String.valueOf(this.y2 - this.y1) + " " + String.valueOf(this.z2 - this.z1);
    }

    int[] getArrayVectorCords(Vector3D vector) {
        int[] vectors = new int[6];

        vectors[0] = this.x2 - this.x1;
        vectors[1] = this.y2 - this.y1;
        vectors[2] = this.z2 - this.z1;
        vectors[3] = vector.x2 - vector.x1;
        vectors[4] = vector.y2 - vector.y1;
        vectors[5] = vector.z2 - vector.z1;

        return vectors;
    }

    double getscalarProduct(Vector3D vector) {
        int[] vectors = getArrayVectorCords(vector);
        return vectors[0] * vectors[3] + vectors[1] * vectors[4] + vectors[2] * vectors[5];
    }
}
