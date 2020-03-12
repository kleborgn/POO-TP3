/**
 * Sport
 */
public class Sport {

    private int code;
    private String libelle;

    public Sport(int c, String l) {
        this.code = c;
        this.libelle = l;
    }

    /**
     * @return int return the code
     */
    public int getCode() {
        return code;
    }

    /**
     * @return String return the libelle
     */
    public String getLibelle() {
        return libelle;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.code + " : " + this.libelle;
    }

    public void afficherSport() {
        System.out.println(this.toString());
    }

}