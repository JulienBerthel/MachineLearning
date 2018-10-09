import java.util.ArrayList;
import java.util.List;

public class Kmean {
    private List<Point> donnees;
    private List<Point> clusters;

    public Kmean(List<Point> donnees, List<Point> clusters) {
        this.donnees = donnees;
        this.clusters = clusters;
    }

    public List<Point> getDonnees() {
        return donnees;
    }

    public void setDonnees(List<Point> donnees) {
        this.donnees = donnees;
    }

    public List<Point> getClusters() {
        return clusters;
    }

    public void setClusters(List<Point> clusters) {
        this.clusters = clusters;
    }

    //retourne la liste des indices des clusters correspondant à chaque données(clas)
    public List<Double> affecteAll(List<Point> donnees, List<Point> clusters){
        List<Double> clas = new ArrayList<Double>();
        for(int i=0; i<donnees.size(); i++){
            clas.add(donnees.get(i).affecte(clusters));
        }
        return clas;
    }

    public List<Point> updateCenter(List<Point> donnees, List<Point> clas, int k){
        List<Point> clusters = new ArrayList<Point>();
            for(int i=0; i<donnees.size(); i++){

            }
        return clusters;
    }

    public Point barry(List<Point> donnees){
        Point moyenne=null;
        double x=0;
        double y=0;
        for(int i=0;i<donnees.size();i++){
            x+=donnees.get(i).getX();
            y+=donnees.get(i).getY();
        }
        moyenne=new Point(x/donnees.size(),y/donnees.size());
        return moyenne;
    }
}
