/**
 * SportCo
 */
public class SportCo extends Sport{

    private int nbJoueurs;

    public SportCo(int c, String l, int nbJ) {
        super(c, l);
        this.nbJoueurs = nbJ;
    }

    /**
     * @return the nbJoueurs
     */
    public int getNbJoueurs() {
        return nbJoueurs;
    }

    @Override
    public String toString() {
        return super.toString() + " (" + this.nbJoueurs + ")";
    }
}