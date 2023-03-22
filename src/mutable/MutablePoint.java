package mutable;

public class MutablePoint {

    private int x;
    private int y;

    public MutablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public MutablePoint add(MutablePoint point) {
        return new MutablePoint(this.x + point.getX(), this.y + point.getY());
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "immutable.Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static void main(String[] args) {

    }
}
