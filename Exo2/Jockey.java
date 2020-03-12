/**
 * Jockey
 */
public class Jockey extends Personne {

    private double poids;
    private double salaire;

    public Jockey(String n, String p, String a, double pds, double s) {
        super(n, p, a);
        this.poids = pds;
        this.salaire = s;
    }

    /**
     * @return the poids
     */
    public double getPoids() {
        return poids;
    }

    /**
     * @return the salaire
     */
    public double getSalaire() {
        return salaire;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "[" + this.poids + ", " + this.salaire + "]";
    }
}