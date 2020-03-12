import java.util.ArrayList;

/**
 * Course
 */
public class Course {

    private String nom;
    private double dotation;
    private ArrayList<ChevalDeCourse> liste;
    private static final int tailleMax = 10;

    public Course(String n, double d) {
        liste = new ArrayList<ChevalDeCourse>(tailleMax);
        nom = n;
        dotation = d;
    }

    public void afficher() {
        System.out.println(this.nom + "(" + this.dotation + ") :");
        for (ChevalDeCourse chevalDeCourse : liste) {
            chevalDeCourse.affiche();
        }
    }

    public boolean chevalPresent(String nom) {
        boolean trouve = false;
        int i = 0;

        while ((!trouve) && (i < liste.size())) {
            if (liste.get(i).getNom().equals(nom)) {
                trouve = true;
            }
            else {
                i++;
            }
        }
        return trouve;
    }

    public boolean enregistre(ChevalDeCourse c) {
        if (chevalPresent(c.getNom())) {
            return false;
        }
        else {
            if (liste.size() < tailleMax {
                liste.add(c);
                return true;
            }
            else {
                return false;
            }
        }
    }

    public void recherche_cheval(String nom) {
        boolean trouve = false;
        int i = 0;

        while ((!trouve) && (i < liste.size())) {
            if (liste.get(i).getNom().equals(nom)) {
                trouve = true;
            }
            else {
                i++;
            }
        }
        
        if (i != liste.size()) {
            liste.get(i).affiche();
        }
        else {
            System.out.println("absent");
        }
    }
}