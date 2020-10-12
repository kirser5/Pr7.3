import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Deque<Integer> deck = new ArrayDeque<>();
        Deque<Integer> deckSec = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);

        for (int x = 0; x < 5; x = x + 1) {
            deck.push(scanner.nextInt());
        }
        for (int x = 0; x < 5; x = x + 1) {
            deckSec.push(scanner.nextInt());
        }
        int count=0;
        while(count!=106){
            int first=0;
            first=deck.removeLast();
            int second=0;
            second=deckSec.removeLast();
            if(first<second){
                deck.addFirst(first);
                deck.addFirst(second);
            }
            if(first>second){
                deckSec.addFirst(second);
                deckSec.addFirst(first);
            }
            if(deck.isEmpty()){
                System.out.println("second "+count);
                break;
            }
            if(deckSec.isEmpty()){
                System.out.println("first "+count);
                break;
            }
            count++;
        }
        if(count==106){
            System.out.println("botva");
        }
    }
}