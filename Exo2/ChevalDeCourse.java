/**
 * ChevalDeCourse
 */
public class ChevalDeCourse extends Cheval {

    private double gains;
    private Entraineur coach;
    private Jockey cavalier;

    public ChevalDeCourse(String n, String s, String r, double g, Entraineur c) {
        super(n, s, r);
        this.gains = g;
        this.coach = c;
    }

    public boolean affiche() {
        System.out.println(super.toString());
        System.out.println(this.gains + " (" + this.coach.toString() + ")");
        return true;
    }

    public boolean attribueJockey(Jockey j) {
        this.cavalier = j;
        return true;
    }

    /**
     * @return double return the gains
     */
    public double getGains() {
        return gains;
    }

    /**
     * @return Entraineur return the coach
     */
    public Entraineur getCoach() {
        return coach;
    }

    /**
     * @return Jockey return the cavalier
     */
    public Jockey getCavalier() {
        return cavalier;
    }

}