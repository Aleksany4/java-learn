import java.util.Scanner;

public class CirkleTask2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int boardSize = scan.nextInt();
        System.out.println("Board is " + boardSize + " sm");
        int fixSize = 15;
        boardSize -= fixSize;
        int normalLength = 10;
        byte bigBit = 3;
        byte smallBit = 1;
        int coin = 1;

        do {
            System.out.println("coin " + coin);
            int length = normalLength;
            do {
                System.out.println("bit " + length);
                length = length - bigBit;
            } while (length>3);
            do {
                System.out.println("bit " + length);
                length = length - smallBit;
                if (length == 0) {
                    System.out.println("The nail is hammered");
                }
            } while (length>0);

            coin++;
            boardSize -= fixSize;
            System.out.println("Left size of board is " + boardSize);
        } while (fixSize<boardSize);
        System.out.println("Good Job!!! " + coin + " nails is hammered");

    }
}
