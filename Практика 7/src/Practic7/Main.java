package Practic7;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Queue player1 = new LinkedList();
        Queue player2 = new LinkedList();

        player1.add(1);
        player1.add(3);
        player1.add(5);
        player1.add(7);
        player1.add(1);

        player2.add(2);
        player2.add(4);
        player2.add(6);
        player2.add(8);
        player2.add(9);

        for (int i=0;i < 11;i++) {

            if(player1.isEmpty() |)
            if (((int)player1.element() > (int)player2.element()) || ((int)player1.element() == 0 & (int)player2.element() == 9)) {
                player1.add(player1.poll());
                player1.add(player2.poll());
                System.out.println("First win");
            }
            else if (((int)player1.element() < (int)player2.element()) || ((int)player1.element() == 9 & (int)player2.element() == 0)) {
                player2.add(player1.poll());
                player2.add(player2.poll());
                System.out.println("Second win");
            }
        }
    }
}
