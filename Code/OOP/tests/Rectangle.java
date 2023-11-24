public class Rectangle {
    private Coordinate coord;
    private double with, height;
    public Rectangle(double x,double y,double w,double h) {
        with=w;
        height=h;
        coord=new Coordinate(x,y);
    }
    public Rectangle(Coordinate fh,double w,double h) {
        with=w;
        height=h;
        coord=fh;
    }
    public boolean contains(Coordinate c) {
        double x=coord.getX();
        double y=coord.getY();

        boolean horizontalOK=coord.getX()<=x && x<=coord.getX()+with;
        boolean verticaleOK=coord.getX()<=y && y<=coord.getX()+height;

        return horizontalOK && verticaleOK;
    }
    // public boolean contains(Rectangle r) {
    //     double x=coord.getX();
    //     double y=coord.getY();

    //     boolean horizontalOK=coord.getX()<=x && x<=coord.getX()+with;
    //     boolean verticaleOK=coord.getX()<=y && y<=coord.getX()+height;
    //     return true;
    // }
}