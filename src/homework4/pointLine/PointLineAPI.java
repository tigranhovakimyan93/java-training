package homework4.pointLine;

class PointLineAPI {

    static double calculateDistance(Point point1, Point point2) {
        return Math.sqrt((point2.getX() - point1.getX()) * (point2.getX() - point1.getX()) + (point2.getY() - point1.getY()) *
                (point2.getY() - point1.getY()));
    }

    private static double calculateDistance(Line line) {
        return Math.sqrt((line.point2().getX() - line.point1().getX()) * (line.point2().getX() - line.point1().getX())
                + (line.point2().getY() - line.point1().getY()) * (line.point2().getY() - line.point1().getY()));
    }

    static Point midPoint(Point point1, Point point2) {
        return new Point((point1.getX() + point2.getX()) / 2, (point1.getY() + point2.getY()) / 2);
    }

    static boolean isOnLine(Line line, Point testPoint) {
        return calculateDistance(line.point1(), testPoint) + calculateDistance(testPoint, line.point2()) == calculateDistance(line);
    }

    private static double distanceSquare(Point p, Point q) {
        return (p.getX() - q.getX()) * (p.getX() - q.getX()) + (p.getY() - q.getY()) * (p.getY() - q.getY());
    }

    static boolean canDrawSquare(Point point1, Point point2, Point point3, Point point4) {
        double d2 = distanceSquare(point1, point2);
        double d3 = distanceSquare(point1, point3);
        double d4 = distanceSquare(point1, point4);

        if (d2 == 0 || d3 == 0 || d4 == 0)
            return false;

        if (d2 == d3 && 2 * d2 == d4
                && 2 * distanceSquare(point2, point4) == distanceSquare(point2, point3)) {
            return true;
        }

        if (d3 == d4 && 2 * d3 == d2
                && 2 * distanceSquare(point3, point2) == distanceSquare(point3, point4)) {
            return true;
        }
        if (d2 == d4 && 2 * d2 == d3
                && 2 * distanceSquare(point2, point3) == distanceSquare(point2, point4)) {
            return true;
        }
        return false;
    }

    static void printPoint(Point point) {
        for (int y = 9; y > 0; y--) {
            if (y == point.getY()) {
                String s = String.format("%1$" + (point.getX() * 2 + point.getX() - 2) + "s", "");
                System.out.println(y + "|" + s + "•");
            } else if (y == 1) {
                System.out.print(y + "|");
            } else {
                System.out.println(y + "|");
            }
        }
        for (int x = 9; x > 0; x--) {
            if (x == 1) {
                System.out.println("__");
            } else {
                System.out.print("__ ");
            }
        }
        for (int x = 0; x <= 9; x++) {
            if (x == 9) {
                System.out.println(x + "  ");
            } else {
                System.out.print(x + "  ");
            }
        }
    }

    //need to understand codes below

    private static boolean onSegment(Point p, Point q, Point r) {
        return q.getX() <= Math.max(p.getX(), r.getX()) &&
                q.getX() >= Math.min(p.getX(), r.getX()) &&
                q.getY() <= Math.max(p.getY(), r.getY()) &&
                q.getY() >= Math.min(p.getY(), r.getY());
    }

    private static int orientation(Point p, Point q, Point r) {
        double val = (q.getY() - p.getY()) * (r.getX() - q.getX())
                - (q.getX() - p.getX()) * (r.getY() - q.getY());

        if (val == 0.0) {
            return 0;
        }
        return (val > 0) ? 1 : 2;
    }

    private static boolean doIntersect(Point p1, Point q1, Point p2, Point q2) {
        int o1 = orientation(p1, q1, p2);
        int o2 = orientation(p1, q1, q2);
        int o3 = orientation(p2, q2, p1);
        int o4 = orientation(p2, q2, q1);

        if (o1 != o2 && o3 != o4) {
            return true;
        }

        if (o1 == 0 && onSegment(p1, p2, q1)) {
            return true;
        }

        if (o2 == 0 && onSegment(p1, q2, q1)) {
            return true;
        }

        if (o3 == 0 && onSegment(p2, p1, q2)) {
            return true;
        }

        if (o4 == 0 && onSegment(p2, q1, q2)) {
            return true;
        }
        return false;
    }

    static boolean isInside(Point[] polygon, int n, Point p) {
        int INF = 10000;
        if (n < 3) {
            return false;
        }

        Point extreme = new Point(INF, p.getY());

        int count = 0, i = 0;
        do {
            int next = (i + 1) % n;

            if (doIntersect(polygon[i], polygon[next], p, extreme)) {
                if (orientation(polygon[i], p, polygon[next]) == 0) {
                    return onSegment(polygon[i], p,
                            polygon[next]);
                }
                count++;
            }
            i = next;
        } while (i != 0);
        return (count % 2 == 1); // Same as (count%2 == 1)
    }
}
