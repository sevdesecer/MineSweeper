package Exercises.MineSweeper2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = 0;
        int col = 0;
        System.out.println("\nPlease select difficulty level.\n=================\n1 => Easy\n2 => Intermediate\n3 => Hard\n4 => Insane");
        System.out.print(": ");
        int level = scanner.nextInt();

        while (!(level > 0 && level < 5)) {
            System.out.println("You entered an invalid value, please enter valid difficulty level between 1 and 4.");
            System.out.print(": ");
            level = scanner.nextInt();
        }

        if (level == 1) {
            row = 4;
            col = 4;
        } else if (level == 2) {
            row = 6;
            col = 6;
        } else if (level == 3) {
            row = 8;
            col = 8;
        } else {
            row = 20;
            col = 20;
        }
        MineSweeper2 m = new MineSweeper2(row, col);
        m.start();
    }
}

