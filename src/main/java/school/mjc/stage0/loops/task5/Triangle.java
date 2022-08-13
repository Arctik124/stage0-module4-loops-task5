package school.mjc.stage0.loops.task5;

/**
 * Write a program will write to console a rectangular triangle(cathetus should be of a given size)
 * of a given length(it should consist of '8'-s).
 */
public class Triangle {
    public void printTriangle(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            for (int j = 1; j <= cathetusLength; j++) {
                if (i >= j  ) {
                    System.out.print(8);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
