package hackerrank.IPKit.sorting;
import java.util.*;

class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

class Checker implements Comparator<Player> {

    @Override
    public int compare(Player a, Player b) {
        /*
         * if a > b Comperator's compare method
         * needs to return -1 and 1 otherwise.
         * else if equal then 0.
         */
        if (a.score > b.score)
            return -1;
        else if (b.score > a.score)
            return 1;
        else
            return a.name.compareTo(b.name);
    }
}


public class Comperator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}