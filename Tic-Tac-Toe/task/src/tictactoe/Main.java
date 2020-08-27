package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        System.out.println("Enter cells: O_OXXO_XX");
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();

        System.out.println("---------");
        System.out.println("|" + line1.substring(0, 3).replaceAll("", " ") + "|");
        System.out.println("|" + line1.substring(3, 6).replaceAll("", " ") + "|");
        System.out.println("|" + line1.substring(6, 9).replaceAll("", " ") + "|");
        System.out.println("---------");
    }
}
