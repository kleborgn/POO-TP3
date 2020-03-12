/**
 * Entraineur
 */
public class Entraineur extends Personne {

    private String nLicence;

    public Entraineur(String n, String p, String a, String nL) {
        super(n, p, a);
        this.nLicence = nL;
    }

    /**
     * @return the nLicence
     */
    public String getnLicence() {
        return nLicence;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "(" + this.nLicence + ")";
    }
}