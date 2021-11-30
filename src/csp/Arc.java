package csp;

import java.util.ArrayList;

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
        return "Arc{" +
                "sommet1=" + sommet1 +
                ", sommet2=" + sommet2 +
                ", listeContraintes=" + listeContraintes +
                '}';
    }
}
