import java.util.*;

public class CardCollection {
    private static final Map<String, List<String>> cards = new HashMap<>();

    public static void main(String[] args) {
        addCard("Hearts", "Ace");
        addCard("Hearts", "King");
        addCard("Spades", "Queen");
        addCard("Diamonds", "Jack");
        addCard("Clubs", "10");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter symbol to search cards: ");
        String symbol = scanner.nextLine();
        displayCards(symbol);
        scanner.close();
    }

    private static void addCard(String symbol, String card) {
        cards.computeIfAbsent(symbol, k -> new ArrayList<>()).add(card);
    }

    private static void displayCards(String symbol) {
        if (cards.containsKey(symbol)) {
            System.out.println("Cards in " + symbol + ": " + cards.get(symbol));
        } else {
            System.out.println("No cards found for this symbol.");
        }
    }
}
