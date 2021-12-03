package day02;

import java.util.ArrayList;
import java.util.List;

public class CoordinateSystem {

    private final List<Point> points;

    public CoordinateSystem(List<Point> points) {
        this.points = points;
    }

    public List<Point> getPoints() {
        // return new ArrayList<>(points); - igy x = 2 lesz lefutáskor
        // igy meg x=1 ha ezt írom:
        List<Point> result = new ArrayList<>();
        for (Point p : points) {
            result.add(new Point(p));
        }
        return result;
    }

    public static void main(String[] args) {


        Point p = new Point(1, 2);

        CoordinateSystem coordinateSystem = new CoordinateSystem(new ArrayList<>(List.of(p)));

        coordinateSystem.getPoints().get(0).setX(2);
        System.out.println(p.getX());

    }

}
