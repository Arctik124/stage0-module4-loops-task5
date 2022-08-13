package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        for (int i = 0; i < height; i++) {
            System.out.print(8);
            for (int j = 0; j < length - 2; j++) {
                if (i == 0 || i == height - 1) {
                    System.out.print(8);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("8\n");
        }
    }
}
