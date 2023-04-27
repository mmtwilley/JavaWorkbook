import java.util.Map;

public class Team {

    private String name;
    private Map<String, String> players;

    public Team(String name) {
        setName(name);
        this.players = new Map<>();
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if(name.isBlank() || name == null){
            throw new IllegalArguementException("Enter a valid name");
        }
        this.name = name;
    }

    public String getPlayer(String position) {
        return this.players.get(position);
    }

    public void setPlayer(String position, String player) {
        return this.players.put(position,player);
    }    
}
