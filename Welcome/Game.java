package Welcome;
import Welcome.Player.Player;
import java.util.*;
public class Game extends DataBase {
    private HashMap<Integer, Player> players = new HashMap<>();
    private List<Player> rank = new ArrayList<>();
    public void addPlayer(Player player) {
        
        int id = players.size() + 1;
        players.put(id, player);
        rank.add(player);
        Collections.sort(rank, new Comparator<Player>() 
        {
    @Override
    public int compare(Player a, Player b) {
        return b.getScore() - a.getScore();
    }
         });
  
        System.out.println("Player " + player.getName() + " registered successfully!");
    }
    public void updateRankings() {
        Collections.sort(rank, new Comparator<Player>() {
    @Override
    public int compare(Player a, Player b) {
        return b.getScore() - a.getScore();
    }
});

    }
    public void printRankings() {
        System.out.println("Leaderboard:");
        for (int i = 0; i < rank.size(); i++) {
            Player p = rank.get(i);
            System.out.println((i + 1) + ". " + p.getName() + " - Total Runs: " + p.getScore());
        }
        for(int i=0;i<(Integer.MAX_VALUE)/12;i++){}
        
    }
    public void printPlayers()
    {
        for (Map.Entry<Integer, Player> entry : players.entrySet())
        {
        System.out.println("ID: " + entry.getKey() + " -> " + entry.getValue().getName());
        }
        
        for(int i=0;i<(Integer.MAX_VALUE)/12;i++){}
        
        
    }
    public void startGame(int a, int b, DataBase db)
    {
        Over over = new Over();
        Player p1 = players.get(a);
        Player p2 = players.get(b);
        if (p1 == null || p2 == null) {
            System.out.println("Invalid player IDs.");
            return;
        }
        over.getPerformance(p1);
        for(int i=0;i<(Integer.MAX_VALUE)/12;i++){}
        over.getPerformance(p2);
        for(int i=0;i<(Integer.MAX_VALUE)/12;i++){}
        String win="";
        // Game logic goes here
        if(p1.getLastMatchRuns() > p2.getLastMatchRuns()) {
            win = p1.getName();
        } else if(p1.getLastMatchRuns() < p2.getLastMatchRuns()) {
            win = p2.getName();
        } else {
            System.out.println("It's a tie!");
        }
        if(win.length()>0)
        System.out.println(win + " wins!");

        db.addMatch(a,b,p1.getLastMatchRuns(),p2.getLastMatchRuns(),win);
        updateRankings();
    }
}
