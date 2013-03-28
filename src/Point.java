public class Point {
    private Double x;
    private Double y;

    public Point (Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    public Double getX () {
        return this.x;
    }
    public Double getY() {
        return this.y;
    }

    public Double getDistanceTo (Point p) {
        Double a = Math.abs(this.getX() - p.getX());
        Double b = Math.abs(this.getY() - p.getY());

        return Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
    }
}


