package mutable;

public final class RectangleImmutable {

    private final MutablePoint point1;
    private final MutablePoint point2;

    public RectangleImmutable(MutablePoint point1, MutablePoint point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public RectangleImmutable(RectangleImmutable rm) {
        this.point1 = rm.getPoint1();
        this.point2 = rm.getPoint2();
    }

    public MutablePoint getPoint1() {
        return new MutablePoint(point1.getX(), point1.getY());
    }

    public MutablePoint getPoint2() {
        return new MutablePoint(point2.getX(), point2.getY());
    }

    public int calculateSquare() {
        return (point2.getX() - point1.getX()) * (point2.getY() - point1.getY());
    }

    public static void main(String[] args) {
        MutablePoint mp1 = new MutablePoint(1, 1);
        MutablePoint mp2 = new MutablePoint(3, 5);

        RectangleImmutable rm = new RectangleImmutable(mp1, mp2);

        System.out.println("rm.calculateSquare() = " + rm.calculateSquare());

        // same
        MutablePoint pointCopy = rm.getPoint2();
        pointCopy.setX(5);

        // same
        rm.getPoint2().setX(5);



        RectangleImmutable rm2 = new RectangleImmutable(rm);

        System.out.println("rm.calculateSquare() = " + rm.calculateSquare());
    }
}
