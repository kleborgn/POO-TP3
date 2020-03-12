/**
 * Prog
 */
public class Prog {

    public static void main(String[] args) {
        Course c1 = new Course("GP CWD", 20000.0);
        ChevalDeCourse cheval1 = new ChevalDeCourse("Ulma de Liaf", "Jument", "Connemara", 200.0, new Entraineur("LE BORGNE", "Kilian", "Compiegne", "301243C"));
        c1.enregistre(cheval1);
        c1.afficher();
        c1.recherche_cheval("Ulma de Liaf");
        c1.recherche_cheval("ulma");
        c1.recherche_cheval("ulma de liaf");
        c1.recherche_cheval("Demoiselle de Valsery");
    }
}