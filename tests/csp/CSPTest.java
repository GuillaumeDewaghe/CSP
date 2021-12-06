package csp;

import org.junit.jupiter.api.Test;

/**
 * Tests de la classe CSP
 */
class CSPTest
{
    /**
     * Tous les arcs, aucune contrainte
     */
    @Test
    void cspTest1()
    {
        int nbVariables = 3;
        int tailleDomaine = 3;
        double densite = 0;
        double durete = 0;
        CSP csp = new CSP(nbVariables, tailleDomaine, densite, durete);
        System.out.println(csp);
    }

    /**
     * 2/3 des arcs, 1/3 des contraintes
     */
    @Test
    void cspTest2()
    {
        int nbVariables = 3;
        int tailleDomaine = 3;
        double densite = 0.33;
        double durete = 0.33;
        CSP csp = new CSP(nbVariables, tailleDomaine, densite, durete);
        System.out.println(csp);
    }

    /**
     * 2/3 des arcs, toutes les contraintes
     */
    @Test
    void cspTest3()
    {
        int nbVariables = 3;
        int tailleDomaine = 3;
        double densite = 0.33;
        double durete = 1;
        CSP csp = new CSP(nbVariables, tailleDomaine, densite, durete);
        System.out.println(csp);
    }
}