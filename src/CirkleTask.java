public class CirkleTask {
    public static void main(String[] args) {
        /*
        есть два молотка. один забивает по 3, а другой забтвает по 1
        хочу забтвать по 3, а когда гвоздя осталось менбше 3, то поменять молоток
         */
        int[] box = new int[5];
        int normalLength = 10;
        byte bigBit = 3;
        byte smallBit = 1;
        int coin = 1;
        int i = 0;
        do {
            System.out.println("coin " + coin);
            int numberOfIndex = box[i];
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
            i++;
            coin++;
        } while (i<box.length);
        System.out.println("Good Job!!! All nails is hammered");
    }
}
