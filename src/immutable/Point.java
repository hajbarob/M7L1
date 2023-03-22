package immutable;

public final class Point {

    public static final Point ZERO_POINT = new Point(0,0);

    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p) {
        this.x = p.getX();
        this.y = p.getY();
    }

    public Point add(Point point) {
        return new Point(this.x + point.getX(), this.y + point.getY());
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "immutable.Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static void main(String[] args) {
        Point point = new Point(1, 1);
        Point point2 = new Point(2, 2);

        System.out.println("point = " + point);
        System.out.println("point2 = " + point2);

        System.out.println("point.add(point2) = " + point.add(point2));
        System.out.println("point = " + point);

        System.out.println("ZERO_POINT = " + ZERO_POINT);
    }
}
