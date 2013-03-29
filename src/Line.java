public class Line {
    private Point a;
    private Point b;

    public Line(Point a, Point b){
        this.a = a;
        this.b = b;
    }


    public Double getLength () {
        return this.a.getDistanceTo(this.b);
    }

    public Boolean hasIntersectWith (Line l) {

        Double x1 =  this.a.getX();
        Double x2 =  this.b.getX();
        Double y1 =  this.a.getY();
        Double y2 =  this.b.getY();

        Double x3 =  l.a.getX();
        Double x4 =  l.b.getX();
        Double y3 =  l.a.getX();
        Double y4 =  l.b.getX();
        //d=delta
        Double dx1 = x2 - x1;
        Double dy1 = y2 - y1;
        Double dx2 = x4 - x3;
        Double dy2 = y4 - y3;

        Double x = dy1*dx2 - dy2*dx1;
        Double y = x3 * y4 - y3 * x4;

        x = ((x1 * y2 - y1 * x2) * dx2 - y * dx1) / x;
        y = (dy2 * x - y) / dx2;

        if(((x1 <= x && x2 >= x) || (x2 <= x && x1 >= x)) && ((x3 <= x && x4 >= x) || (x4 <= x && x3 >= x))){
            return false;
        }

        else return true;
    }
}
