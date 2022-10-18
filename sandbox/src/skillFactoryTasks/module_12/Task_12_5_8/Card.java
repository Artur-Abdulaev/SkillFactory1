package skillFactoryTasks.module_12.Task_12_5_8;

import java.util.Objects;

public class Card {

    private final String rank;
    private final String suit;

    public Card(String rank, String suit) {
        if (rank == null || suit == null) {
            throw new IllegalArgumentException();
        }
        this.rank = rank;
        this.suit = suit;
    }

    public String toString() {
        return suit + " | " + rank;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return Objects.equals(rank, card.rank) && Objects.equals(suit, card.suit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rank, suit);
    }
}
