import java.util.ArrayList;

public class FootballClub {
    private String name;
    private final int maxSquadSize = 25;

    private ArrayList<Player> squad = new ArrayList<>(maxSquadSize);

    public FootballClub(String chelsea) {
        name = chelsea;
    }

    public String toString() {
        String msg = "FootballClub Name: " + name + " Player Count: " + squad.size() + "\n";
        for(int i=0; i<squad.size(); i++) {
            msg += "\t" + squad.get(i) + "\n";
        }
        return msg;
    }

    public Player findPlayer(String playerFirstName, int jerseyNumber) {
        int found=0;
        int index=0;
        for(int i=0; i<squad.size(); i++) {
            if (squad.contains(playerFirstName) && squad.contains(jerseyNumber)) {
                found = 1;
                index = i;
                break;
            }
        }

        if(found == 1)
            return squad.get(index);
        else
            return new Player(null, null, 0);
    }

    public void removeAllPlayer() {
        squad.clear();
    }

    public void addPlayer(Player newPlayer) {
        squad.add(newPlayer);
    }
}
