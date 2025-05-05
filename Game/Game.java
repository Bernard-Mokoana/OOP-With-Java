public abstract class Game implements Comparable<Game> {
    protected String name;
    protected int players;

    public Game(String name, int players) {
        this.name = name;
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPlayers() {
        return players;
    }

    public void setPlayers(int players) {
        this.players = players;
    }

    public abstract void play();

    @Override
    public String toString() {
        return "Game{" + "name = '" + name + '\'' + ", players = " + players + '}';
    }

    @Override
    public int compareTo(Game other) {
        return Integer.compare(this.players, other.players);
    }
    
    public String getTimeComplexity() {
        return "O(1)"; 
    }
}
