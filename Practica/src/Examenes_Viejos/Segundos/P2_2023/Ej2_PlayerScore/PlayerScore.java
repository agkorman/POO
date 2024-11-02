package Examenes_Viejos.Segundos.P2_2023.Ej2_PlayerScore;

import java.util.Objects;

// debe modificarse
public class PlayerScore<S extends Comparable<? super S>> implements Comparable<PlayerScore<S>> {
    private final String player;
    private final S score;


    public PlayerScore(String player, S score) {
        this.player = player;
        this.score = score;
    }
    /*
    @Override
    public boolean equals(Object o) {
        return o instanceof PlayerScore<?> ps && player.equals(ps.player) && score.equals(ps.score);
    }

   @Override
   public int hashCode(){
        return Objects.hash(score, player);
   }
   */
   @Override
   public int compareTo(PlayerScore<S> ps) {
        return score.compareTo(ps.getScore());
   }

    public String getPlayer(){
        return player;
    }

    public S getScore(){
        return score;
    }


    @Override
    public String toString() {
        return "Player %s scored %s".formatted(player, score);
    }
}

