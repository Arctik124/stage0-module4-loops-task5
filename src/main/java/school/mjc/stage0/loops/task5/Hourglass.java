package school.mjc.stage0.loops.task5;

/**
 * Write a program write to console filled Hourglass of a given length(it should consist of '8'-s).
 */

public class Hourglass {
    public static void main(String[] args) {
        Hourglass hourglass = new Hourglass();
        hourglass.printHourglassOfGivenSize(5);
        System.out.println("**************");
        hourglass.printHourglassOfGivenSize(6);
    }

    public void printHourglassOfGivenSize(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if ((j >= i && j < height - i) || (i >= height / 2 && (j < i + 1 && i + 1 >= height - j))) {
                    System.out.print(8);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");

        }
    }
}

