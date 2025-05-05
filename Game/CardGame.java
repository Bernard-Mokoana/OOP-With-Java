public class CardGame extends Game {
    private int deckSize;

    public CardGame(String name, int players, int deckSize) {
        super(name, players);
        this.deckSize = deckSize;
    }

    public int getDeckSize() {
        return deckSize;
    }

    public void setDeckSize(int deckSize) {
        this.deckSize = deckSize;
    }

    @Override
    public void play() {
        System.out.println("Playing card game " + getName() + " with " + getPlayers() + " players using a deck of " + deckSize + " cards");
    }

    @Override
    public String toString() {
        return "CardGame{" + "name='" + name + '\'' + ", players=" + players + ", deckSize=" + deckSize + '}';
    }

    @Override
    public String getTimeComplexity() {
        return "O(1)"; 
    }
}
