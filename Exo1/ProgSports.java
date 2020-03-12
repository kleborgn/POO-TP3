import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * ProgSports
 */
public class ProgSports {

    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    private static final int MAX = 10;

    public static void main(String[] args) {
        LesSports liste = new LesSports(MAX);

        liste.ajouterSport("Golf", 1);
        liste.ajouterSport("Billard", 2);
        liste.ajouterSport("Echecs", 1);
        liste.ajouterSport("Football", 24);
        liste.ajouterSport("Basket", 10);

        liste.afficherListe();
    }
}