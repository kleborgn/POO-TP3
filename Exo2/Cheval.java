/**
 * Cheval
 */
public class Cheval {

    private int sire;
    private static int nbSire = 0;
    private String nom;
    private String sexe;
    private String race;

    public Cheval(String n, String s, String r) {
        this.sire = nbSire;
        nbSire++;
        this.nom = n;
        this.sexe = s;
        this.race = r;
    }

    

    /**
     * @return int return the sire
     */
    public int getSire() {
        return sire;
    }

    /**
     * @return String return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @return String return the sexe
     */
    public String getSexe() {
        return sexe;
    }

    /**
     * @return String return the race
     */
    public String getRace() {
        return race;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.sire + " : " + this.nom + ", " + this.sexe + " (" + this.race + ")";
    }

}