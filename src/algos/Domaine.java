package algos;

import java.util.ArrayList;

public class Domaine
{
    private int taille;                         // Taille du domaine
    private ArrayList<Integer> listeValeurs;    // Ensemble des valeurs du domaine

    /* ----- CONSTRUCTORS ----- */

    public Domaine(int taille)
    {
        this.taille = taille;
        this.listeValeurs = new ArrayList<>();
        for(int i = 1; i <= this.taille; i++)
        {
            this.listeValeurs.add(i);
        }
    }

    /* ----- GETTERS & SETTERS ----- */

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public ArrayList<Integer> getListeValeurs() {
        return listeValeurs;
    }

    public void setListeValeurs(ArrayList<Integer> listeValeurs) {
        this.listeValeurs = listeValeurs;
    }

    /* ----- TOSTRING ----- */

    @Override
    public String toString()
    {
        return "Domaine{" +
                "taille=" + taille +
                ", listeValeurs=" + listeValeurs +
                '}';
    }
}
