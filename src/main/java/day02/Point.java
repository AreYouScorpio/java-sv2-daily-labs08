package day02;

public class Point {
    private int x;
    private int y;


    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //ezt adtuk hozzá a második verzióhoz:

    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }



    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
