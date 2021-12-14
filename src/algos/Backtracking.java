package algos;

import csp.Arc;
import csp.CSP;
import csp.Contrainte;

import java.util.ArrayList;

/**
 * Backtracking chronologique
 */
public class Backtracking
{
    public ArrayList<Solution> BT(CSP csp)
    {
        int i = 0, j, assignation;
        boolean ok;
        ArrayList<Solution> listeSolutions = new ArrayList<>();
        ArrayList<Domaine> listeDomaines = new ArrayList<>();

        // Initialisation des listes de solutions et des domaines
        for(j = 0; j < csp.getListeVariables().size(); j++)
        {
            listeSolutions.add(new Solution(csp.getListeVariables().get(j) ) );
            listeDomaines.add(new Domaine(csp.getListeVariables().get(j).getDomaine() ) );
        }
        while( (i >= 0) && (i < csp.getListeVariables().size() ) )
        {
            ok = false;
            while( (!ok) && (listeDomaines.get(i).getListeValeurs().size() != 0) )
            {
                assignation = listeDomaines.get(i).getListeValeurs().get(0);
                listeDomaines.get(i).getListeValeurs().remove(0);
                listeSolutions.get(i).setAssignation(assignation);
                if(assignationCouranteCoherente(csp, listeSolutions) )
                {
                    ok = true;
                }
            }
            if(!ok)
            {
                listeDomaines.get(i).getListeValeurs().clear();
                for(j = 0; j <= csp.getListeVariables().size(); j++)
                {
                    listeDomaines.get(i).getListeValeurs().add(j);
                }
                listeSolutions.get(i).setAssignation(-1);
                i--;
            }
            else
            {
                i++;
            }
        }
        if(i == -1)
        {
            return null;
        }
        else
        {
            return listeSolutions;
        }
    }

    /**
     * Permet de vérifier que l'assignation est cohérente avec les contraintes
     * @param csp
     * @param listeSolutions Liste de solutions
     * @return true si l'assignation est cohérente, false sinon
     */
    boolean assignationCouranteCoherente(CSP csp, ArrayList<Solution> listeSolutions)
    {
        boolean ok;
        for(Arc arc : csp.getListeArcs() )
        {
            Solution solution1 = null;
            Solution solution2 = null;
            for(Solution solution : listeSolutions)
            {
                if(arc.getSommet1().equals(solution.getVariable() ) )
                {
                    solution1 = solution;
                }
                if(arc.getSommet2().equals(solution.getVariable() ) )
                {
                    solution2 = solution;
                }
            }
            ok = false;
            for(Contrainte contrainte : arc.getListeContraintes() )
            {
                if( (contrainte.getValeur1() == solution1.getAssignation() && contrainte.getValeur2() == solution2.getAssignation() )
                || (solution1.getAssignation() == -1 && solution2.getAssignation() == -1)
                || (solution1.getAssignation() == -1 && contrainte.getValeur2() == solution2.getAssignation() )
                || (solution2.getAssignation() == -1 && contrainte.getValeur1() == solution1.getAssignation() ) )
                {
                    ok = true;
                }
            }
            if(!ok)
            {
                return false;
            }
        }
        return true;
    }
}
