package homework4.pointLine;

class Line {

    private Point point1;
    private Point point2;
    private int length;

    Point point1() {
        return point1;
    }

    Point point2() {
        return point2;
    }

    Line() {
    }

    Line(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }
}
