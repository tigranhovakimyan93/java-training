package homework4.pointLine;

class Main extends PointLineAPI {

    private static Point point1 = new Point(2, 2);
    private static Point point2 = new Point(2, 5);
    private static Point point3 = new Point(5, 2);
    private static Point point4 = new Point(5, 5);
    private static Line line1 = new Line(point1, point2);

    public static void main(String[] args) {
        double distance = Main.calculateDistance(point1, point2);
        System.out.println("The distance between this two ponits is " + distance + "cm");
        Point midPoint = Main.midPoint(point1, point2);
        System.out.println("Midpoint coordinates are: x - " + midPoint.getX() + ", y - " + midPoint.getY());
        Point testPoint = new Point(7, 3);
        if (Main.isOnLine(line1, testPoint)) {
            System.out.println("The point is on line");
        } else {
            System.out.println("The point is not on line");
        }
        if (Main.canDrawSquare(point1, point2, point3, point4)) {
            System.out.println("It is possible to draw a square by these points.");
        } else {
            System.out.println("It is not possible to draw a square by these points.");
        }
        Main.printPoint(point4);
        Point[] polygon1 = {point1, point2, point3, point4};
        int n = polygon1.length;
        Point p = new Point(4, 4);
        if (isInside(polygon1, n, p)) {
            System.out.println("The point is inside area.");
        } else {
            System.out.println("The point is outside area");
        }
    }
}