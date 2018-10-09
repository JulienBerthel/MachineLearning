import java.util.ArrayList;
import java.util.List;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distance (Point a, Point b)
    {
        return Math.sqrt((b.x-a.x)*(b.x-a.x)-(b.y-a.y)*(b.y-a.y));
    }

    public Point mean(List<Point> points){
        Point m = new Point(0,0);
        for (int i=0; i<points.size(); i++){
            m.x = m.x + points.get(i).x;
            m.y = m.y + points.get(i).y;
        }
        m.x = m.x/points.size();
        m.y = m.y/points.size();
        return m;
    }

    //on retourne l'indice du cluster le plus proche au point
    public double affecte(List<Point> clusters){
        Point a = new Point(this.x,this.y);
        double c = 0;
        double d = distance(a,clusters.get(0));
        for(int i=0; i<clusters.size(); i++){
            if(distance(a, clusters.get(i))< d){
                c = i;
            }
        }
        return c;
    }


}
