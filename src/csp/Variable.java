package csp;

/**
 * La classe Variable représente un sommet du graphe
 */
public class Variable
{
    private int id;         // id de la variable
    private int domaine;    // Domaine du sommet

    /* ----- CONSTRUCTORS ----- */

    public Variable(int id, int domaine)
    {
        this.id = id;
        this.domaine = domaine;
    }

    /* ----- GETTERS & SETTERS ----- */

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDomaine() {
        return domaine;
    }

    public void setDomaine(int domaine) {
        this.domaine = domaine;
    }

    /* ----- TOSTRING ----- */

    @Override
    public String toString()
    {
        return "Variable{" +
                "id = " + id +
                ", domaine = " + domaine +
                '}';
    }
}
