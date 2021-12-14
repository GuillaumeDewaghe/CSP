package algos;

import csp.Variable;

/**
 * La classe Solution représente une solution du solveur
 */
public class Solution
{
    private Variable variable;  // Sommet
    private int assignation;    // Valeur du sommet

    /*----- CONSTRUCTORS -----*/

    public Solution(Variable variable)
    {
        this.variable = variable;
        this.assignation = -1;
    }

    public Solution(Variable variable, int assignation)
    {
        this.variable = variable;
        this.assignation = assignation;
    }

    /*----- GETTERS & SETTERS -----*/

    public Variable getVariable() {
        return variable;
    }

    public void setVariable(Variable variable) {
        this.variable = variable;
    }

    public int getAssignation() {
        return assignation;
    }

    public void setAssignation(int assignation) {
        this.assignation = assignation;
    }

    /*----- TOSTRING -----*/

    @Override
    public String toString()
    {
        return "Solution" +
                "\n{\n" +
                "\t" + variable +
                ", assignation = " + assignation +
                "\n}\n";
    }
}
