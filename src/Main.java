import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Привет, куратор!");
        System.out.println("Задача 1");
        int[] ex11 = new int[3];
        ex11[0] = 1;
        ex11[1] = 2;
        ex11[2] = 3;
        System.out.println(Arrays.toString(ex11));

        float[] ex12 = {1.57f, 7.654f, 9.986f};
        System.out.println(Arrays.toString(ex12));

        int[] ex13 = {25, 3, 12, 4, 6, 22, 2};
        for (int i = 0; i < ex13.length; i++) {
            if (i == ex13.length - 1) {
                System.out.println(ex13[i]);
                break;
            }
            System.out.print(ex13[i] + ", ");
        }
        System.out.println();

        System.out.println("Задача 3");
        for (int i = ex11.length - 1; i >= 0; i--) {
            System.out.print(ex11[i] + " ");
        }
        System.out.println();
        for (int i = ex12.length - 1; i >= 0; i--) {
            System.out.print(ex12[i] + " ");
        }
        System.out.println();
        for (int i = ex13.length - 1; i >= 0; i--) {
            System.out.print(ex13[i] + " ");
        }
        System.out.println();

        System.out.println("Задача 4");
        for (int i = 0; i <= ex11.length-1; i++) {
            if (ex11[i] % 2 == 1) {
                ex11[i]+=1;
            }
        }
        System.out.println(Arrays.toString(ex11));
    }
}
