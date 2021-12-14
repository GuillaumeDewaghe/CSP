package algos;

import csp.CSP;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class BacktrackingTest
{
    /**
     * Test du Backtracking avec 2/3 des arcs & 1/3 des contraintes
     * nbVariables = 3
     * tailleDomaine = 3
     * densite = 0.33
     * durete = 0.33
     */
    @Test
    void BTtest1()
    {
        int nbVariables = 3;
        int tailleDomaine = 3;
        double densite = 0.33;
        double durete = 0.33;
        CSP csp = new CSP(nbVariables, tailleDomaine, densite, durete);
        System.out.println(csp);
        ArrayList<Solution> listeSolutions = new ArrayList<>();
        Backtracking bt = new Backtracking();
        listeSolutions = bt.BT(csp);
        System.out.println(listeSolutions);
    }

    /**
     * Test du Backtracking avec 2/3 des arcs & 1/3 des contraintes
     * nbVariables = 5
     * tailleDomaine = 3
     * densite = 0.33
     * durete = 0.33
     */
    @Test
    void BTtest2()
    {
        int nbVariables = 5;
        int tailleDomaine = 3;
        double densite = 0.33;
        double durete = 0.33;
        CSP csp = new CSP(nbVariables, tailleDomaine, densite, durete);
        System.out.println(csp);
        ArrayList<Solution> listeSolutions = new ArrayList<>();
        Backtracking bt = new Backtracking();
        listeSolutions = bt.BT(csp);
        System.out.println(listeSolutions);
    }
}