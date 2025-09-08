package Welcome;
import java.util.*;
import Welcome.Player.Player;
class Match{
    int p1;
    int p2;
    int p1sc;
    int p2sc;
    String winner;
    Match(int p1, int p2, int p1sc, int p2sc, String winner) {
        this.p1 = p1;
        this.p2 = p2;
        this.p1sc = p1sc;
        this.p2sc = p2sc;
        this.winner = winner;
    }
}
public class DataBase {
    private HashMap<Integer, Match> matches = new HashMap<>();
    public void addMatch(int p1, int p2, int p1sc, int p2sc, String win) {

        int id = matches.size() + 1;
        Match match = new Match(p1, p2, p1sc, p2sc, win);
        matches.put(id, match);
    }
    public void printMatches() {
        for (Map.Entry<Integer, Match> entry : matches.entrySet()) {
            Match m = entry.getValue();
            System.out.println("Match ID: " + entry.getKey() + " -> Player1 ID: " + m.p1 + ", Player2 ID: " + m.p2 + ", Player1 Score: " + m.p1sc + ", Player2 Score: " + m.p2sc + ", Winner: " + m.winner);
        }
        
for(int i=0;i<(Integer.MAX_VALUE)/12;i++){}
        
    }
}
