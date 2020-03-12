/**
 * Personne
 */
public class Personne {

    private String nom;
    private String prenom;
    private String adresse;

    public Personne(String n, String p, String a) {
        this.nom = n;
        this.prenom = p;
        this.adresse = a;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @return the adresse
     */
    public String getAdresse() {
        return adresse;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.nom + ", " + this.prenom + ", " + this.adresse;
    }
}