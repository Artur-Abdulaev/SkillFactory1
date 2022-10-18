package skillFactoryTasks.secondPracticeWeek.task6;

public class Main {
    public static void main(String[] args) {

        Vector3D v1 = new Vector3D(4, -3, 1,-2, 4, 5 );
        Vector3D v2 = new Vector3D(2,5,9,2, 3, 5);

        Vector2D v3 = new Vector2D(0, 0, 0,0);
        Vector2D v4 = new Vector2D(0,0,0,0);

//        System.out.println(v1.getVectorCords());
//        System.out.println(v2.getVectorCords());
//        System.out.println(v1.getscalarProduct(v2));


        System.out.println(v3.getVectorCords());
        System.out.println(v4.getVectorCords());
        System.out.println(v3.getAngle(v4));



    }
}
