package csp;

/**
 * La classe Contrainte représente la contrainte entre 2 variables
 */
public class Contrainte
{
    private int valeur1;    // Valeur 1 du couple de contrainte
    private int valeur2;    // Valeur 2 du couple de contrainte

    /* ----- CONSTRUCTORS ----- */

    public Contrainte(int valeur1, int valeur2)
    {
        this.valeur1 = valeur1;
        this.valeur2 = valeur2;
    }

    /* ----- GETTERS & SETTERS ----- */

    public int getValeur1() {
        return valeur1;
    }

    public void setValeur1(int valeur1) {
        this.valeur1 = valeur1;
    }

    public int getValeur2() {
        return valeur2;
    }

    public void setValeur2(int valeur2) {
        this.valeur2 = valeur2;
    }

    /* ----- TOSTRING ----- */

    @Override
    public String toString()
    {
        return "Contrainte{" +
                "valeur1 = " + valeur1 +
                ", valeur2 = " + valeur2 +
                '}';
    }
}
