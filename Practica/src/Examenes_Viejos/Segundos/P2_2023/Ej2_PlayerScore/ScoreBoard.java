package Examenes_Viejos.Segundos.P2_2023.Ej2_PlayerScore;

import java.util.*;

public class ScoreBoard<E extends Comparable<? super E>> extends TreeSet<PlayerScore<E>> {

    public List<PlayerScore<E>> getTopScores(int n){
        List<PlayerScore<E>> ans = new ArrayList<>();
        int it = n;
        for (PlayerScore<E> player : this){
            if (it == 0) {
                return ans;
            }
            ans.add(player);
            it--;
        }
        return ans;
    }

}
