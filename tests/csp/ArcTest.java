package csp;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

/**
 * Tests de la classe Arc
 */
class ArcTest
{
    /**
     * Test de la classe Arc où on créée 2 variables avec une liste de contraintes
     */
    @Test
    void arcTest1()
    {
        // Variables
        Variable variable1 = new Variable(1, 3);
        Variable variable2 = new Variable(2, 3);

        // Liste de contraintes
        ArrayList<Contrainte> listeContraintes = new ArrayList<>();
        listeContraintes.add(new Contrainte(1, 2) );
        listeContraintes.add(new Contrainte(1, 3) );
        listeContraintes.add(new Contrainte(3, 2) );

        // Arc
        Arc arc = new Arc(variable1, variable2, listeContraintes);
        System.out.println(arc);
    }

}