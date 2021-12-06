package csp;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 */
public class CSP
{
    private ArrayList<Variable> listeVariables; // Liste des variables du CSP
    private ArrayList<Arc> listeArcs;           // Liste des arcs entre les variables du CSP

    /**
     * Générateur du CSP
     * @param nbVariables Nombre de variables dans le graphe
     * @param tailleDomaine Taille du domaine des variables
     * @param densite Pourcentage d'arcs qu'on enlève
     * @param durete Pourcentage de contraintes qu'on garde
     */
    public CSP(int nbVariables, int tailleDomaine, double densite, double durete)
    {
        int i, j;
        listeVariables = new ArrayList<>();
        listeArcs = new ArrayList<>();

        // Création des variables
        for(i = 1; i <= nbVariables; i++)
        {
            Variable variable = new Variable(i, tailleDomaine);
            listeVariables.add(variable);
        }

        // Création de tous les arcs entre les variables
        for(i = 0; i < nbVariables; i++)
        {
            for(j = i + 1; j < nbVariables; j++)
            {
                listeArcs.add(new Arc(listeVariables.get(i), listeVariables.get(j), durete ) );
            }
        }

        // Suppression des arcs aléatoirement
        Random random = new Random();
        for(i = 0; i < densite * ( ( (listeVariables.size() * listeVariables.size() - 1) / 2) -1 ); i++)
        {
            listeArcs.remove(random.nextInt(listeArcs.size() ) );
        }
    }

    /* ---- GETTERS & SETTERS -----*/

    public ArrayList<Variable> getListeVariables() {
        return listeVariables;
    }

    public void setListeVariables(ArrayList<Variable> listeVariables) {
        this.listeVariables = listeVariables;
    }

    public ArrayList<Arc> getListeArcs() {
        return listeArcs;
    }

    public void setListeArcs(ArrayList<Arc> listeArcs) {
        this.listeArcs = listeArcs;
    }

    /* ----- TOSTRING ----- */

    @Override
    public String toString()
    {
        return "CSP" +
                "\n{\n" +
                "\tlisteVariables = " + listeVariables +
                ", \n\tlisteArcs = \n" + listeArcs +
                '}';
    }
}
