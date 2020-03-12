import java.io.IOException;
import java.util.ArrayList;

/**
 * LesSports
 */
public class LesSports {

    private ArrayList<Sport> liste;
    private int nbSports = 0;

    public LesSports(int tailleMax) {
        liste = new ArrayList<Sport>(tailleMax);
    }

    public int getNbSports() {
        return this.nbSports;
    }

    public boolean saisirSport() {
        int code = nbSports;
        nbSports++;
        String libelle = new String();
        int nbJ = 0;
        System.out.println("Saisir libellé :");
        try {
            libelle = ProgSports.in.readLine();
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
        System.out.println("Saisir nombre de joueurs :");
        try {
            nbJ = Integer.parseInt(ProgSports.in.readLine());
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
        if (nbJ > 1) {
            SportCo tmp = new SportCo(code, libelle, nbJ);
            liste.add(code, tmp);
            System.out.println("Ajouté avec le code " + code);
            return true;
        }
        else if (nbJ == 1) {
            Sport tmp = new Sport(code, libelle);
            liste.add(code, tmp);
            System.out.println("Ajouté avec le code " + code);
            return true;
        } else {
            System.out.println("Nombre de joueurs incorrect");
            return false;
        }
    }

    public boolean ajouterSport(String l, int nbJ) {
        int code = nbSports;
        nbSports++;
        if (nbJ > 1) {
            SportCo tmp = new SportCo(code, l, nbJ);
            liste.add(code, tmp);
            return true;
        }
        else if (nbJ == 1) {
            Sport tmp = new Sport(code, l);
            liste.add(code, tmp);
            return true;
        } else {
            return false;
        }
    }

    public boolean afficherListe() {
        for (Sport sport : liste) {
            sport.afficherSport();
        }
        return true;
    }
}