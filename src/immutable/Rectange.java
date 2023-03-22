package immutable;

public final class Rectange {

    private final Point point1;
    private final Point point2;

    public Rectange(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public Rectange(Rectange r) {
        this.point1 = new Point(r.getPoint1());
        this.point2 = new Point(r.getPoint2());
    }

    public int calculateSquare() {
        return (point2.getX() - point1.getX()) * (point2.getY() - point1.getY());
    }

    public Point getPoint1() {
        return point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public static void main(String[] args) {
        Point point1 = new Point(1, 1);
        Point point2 = new Point(3, 4);

        Rectange rectange = new Rectange(point1, point2);

        System.out.println("rectange.calculateSquare() = " + rectange.calculateSquare());

        System.out.println("rectange.calculateSquare() = " + rectange.calculateSquare());


    }
}
