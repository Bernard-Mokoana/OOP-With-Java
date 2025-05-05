public class BoardGame extends Game {
    private int boardSize;

    public BoardGame(String name, int players, int boardSize) {
        super(name, players);
        this.boardSize = boardSize;
    }

    public int getBoardSize() {
        return boardSize;
    }

    public void setBoardSize(int boardSize) {
        this.boardSize = boardSize;
    }

    @Override
    public void play() {
        System.out.println("Playing board game " + getName() + " with " + getPlayers() + " players on a board of size " + boardSize);
    }

    @Override
    public String toString() {
        return "BoardGame{" + "name='" + name + '\'' + ", players=" + players + ", boardSize=" + boardSize + '}';
    }

    @Override
    public String getTimeComplexity() {
        return "O(1)";
    }
}