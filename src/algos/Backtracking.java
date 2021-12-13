package algos;

import csp.Arc;
import csp.CSP;

import java.util.ArrayList;

/**
 * Backtracking chronologique
 */
public class Backtracking
{
    public ArrayList<Solution> BT(CSP csp)
    {
        int i = 0;
        boolean ok;
        ArrayList<Solution> listeSolutions = new ArrayList<>();
        ArrayList<Domaine> listeDomaines = new ArrayList<>();

        // Initialisation des listes de solutions et des domaines
        for(i = 0; i < csp.getListeVariables().size(); i++)
        {
            listeSolutions.add(new Solution(csp.getListeVariables().get(i) ) );
            listeDomaines.add(new Domaine(csp.getListeVariables().get(i).getDomaine() ) );
        }
        while( (i >= 0) && (i < csp.getListeVariables().size() ) )
        {
            ok = false;
            while( (!ok) && (listeDomaines.get(i).getListeValeurs().size() != 0) )
            {
                int assignation = listeDomaines.get(i).getListeValeurs().get(0);
                listeDomaines.get(0).getListeValeurs().remove(0);
                listeSolutions.get(i).setAssignation(assignation);
                if(assignationCouranteCoherente(csp, listeSolutions) )
                {
                    ok = true;
                }
            }
            if(!ok)
            {
                listeDomaines.get(i).getListeValeurs().clear();
                for(int j = 0; j <= csp.getListeVariables().size(); j++)
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

    //todo fonction assignationCouranteCoherente
    boolean assignationCouranteCoherente(CSP csp, ArrayList<Solution> listeSolutions)
    {
        //todo
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
            
        }
        return true;
    }




}
