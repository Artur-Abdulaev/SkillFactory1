package Tank;

class Tank {

    int x, y;
    int dir;
    int fuel;
    final String model = "T34";
    int numberTank;






    public Tank() {
        this(0, 0, 100);
        numberTank = 1;
    }

    public Tank(int x, int y) {
        this(x, y, 100);
        numberTank = 2;
    }

    public Tank(int x, int y, int fuel) {
        this.x = x;
        this.y = y;
        this.fuel = fuel;
        numberTank = 3;
    }

    public void goForward(int i) {
        if (fuel < Math.abs(i)) {
            i = fuel * (i / Math.abs(i));
        }
        fuel -= Math.abs(i);
        if (dir == 0) x += i;
        else if (dir == 1) y += i;
        else if (dir == 2) x -= i;
        else y -= i;

    }

    public void printPosition() {
        System.out.println("The Tank " + model + "-"+ numberTank + " is at " + x + ", " + y + " now.");
    }

    public void turnLeft() {
        dir--;
        if (dir == -1) dir = 3;
    }

    public void turnRight() {
        dir++;
        if (dir == 4) dir = 0;
    }

    public void goBackward(int i) {
        goForward(-i);
    }
}