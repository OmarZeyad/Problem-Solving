import java.util.Scanner;
import java.util.LinkedList;


public class Sereja_and_Dima {

    public static void main(String[] args) {
        LinkedList<Integer> cards = new LinkedList<>();

        Scanner sc = new Scanner(System.in);
        int numOfCards = Integer.parseInt(sc.nextLine());
        while(numOfCards > 0) {
            cards.add( Integer.parseInt(sc.next()) );
            --numOfCards;
        }

        int serejaScore = 0, dimaScore = 0;
        while(!cards.isEmpty()) {
            serejaScore += takeTurn( cards );
            if(cards.isEmpty()) // Sereja took the last card; No cards left!
                break;
            dimaScore   += takeTurn( cards );
        }

        System.out.println(serejaScore + " " + dimaScore);
    }

    public static int takeTurn( LinkedList<Integer> cards ) {
        if(cards.getFirst() > cards.getLast())
            return cards.removeFirst();
        else
            return cards.removeLast();
    }

}