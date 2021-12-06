package csp;

import java.util.ArrayList;
import java.util.Random;

/**
 * La classe Arc représente la liaison entre 2 sommets
 */
public class Arc
{
    private Variable sommet1;                       // Sommet 1 de l'arc
    private Variable sommet2;                       // Sommet 2 de l'arc
    private ArrayList<Contrainte> listeContraintes; // Liste de contraintes de l'arc entre le sommet 1 et le sommet 2

    /* ----- CONSTRUCTORS ----- */

    public Arc()
    {
        listeContraintes = new ArrayList<>();
    }

    /**
     * Constructeur de la classe Arc
     * Le nombre de contraintes sera réduit en fonction de la densite
     * @param sommet1 Sommet 1 contenant une Variable 1
     * @param sommet2 Sommet 2 contenant une Variable 2
     * @param densite Pourcentage de contraintes entre 2 sommets
     */
    public Arc(Variable sommet1, Variable sommet2, double densite)
    {
        int i, j;
        this.sommet1 = sommet1;
        this.sommet2 = sommet2;
        listeContraintes = new ArrayList<>();
        for(i = 1; i <= sommet1.getDomaine(); i++)
        {
            for(j = 1; j <= sommet2.getDomaine(); j++)
            {
                listeContraintes.add(new Contrainte(i, j) );
            }
        }

        // Suppression des contraintes aléatoirement
        Random random = new Random();
        for(i = 0; i < Math.pow(sommet1.getDomaine(), 2) - (Math.pow(sommet1.getDomaine(), 2) * densite); i++)
        {
            listeContraintes.remove(random.nextInt(listeContraintes.size() ) );
        }
    }

    public Arc(Variable sommet1, Variable sommet2, ArrayList<Contrainte> listeContraintes)
    {
        this.sommet1 = sommet1;
        this.sommet2 = sommet2;
        this.listeContraintes = listeContraintes;
    }

    /* ----- GETTERS & SETTERS ----- */

    public Variable getSommet1() {
        return sommet1;
    }

    public void setSommet1(Variable sommet1) {
        this.sommet1 = sommet1;
    }

    public Variable getSommet2() {
        return sommet2;
    }

    public void setSommet2(Variable sommet2) {
        this.sommet2 = sommet2;
    }

    public ArrayList<Contrainte> getListeContraintes() {
        return listeContraintes;
    }

    public void setListeContraintes(ArrayList<Contrainte> listeContraintes) {
        this.listeContraintes = listeContraintes;
    }

    /* ----- TOSTRING ----- */

    @Override
    public String toString()
    {
        return "Arc" +
                "\n{\n" +
                "\tsommet1 = " + sommet1 +
                ", \n\tsommet2 = " + sommet2 +
                ", \n\tlisteContraintes = " + listeContraintes +
                "\n}";
    }
}
