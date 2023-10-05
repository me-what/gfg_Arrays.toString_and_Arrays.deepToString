import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] a = { 1, 2, 3, 4, 5 };
        System.out.println("Использование Arrays.toString(): "
                + Arrays.toString(a));
        System.out.println("Использование Arrays.deepToString(): "
                + Arrays.deepToString(a));


        int[] array2 = { 1, 2, 3, 4, 5 };
        System.out.println("Использование Arrays.toString(): "
                + Arrays.toString(array2));
        System.out.println();


        Integer[] a1 = { 1, 2, 3, 4, 5 };
        Integer[] a2 = { 6, 7, 8, 9, 10 };
        Integer[][] multi = { a1, a2 };
        System.out.println("Using Arrays.toString(): "
                + Arrays.toString(multi));
        System.out.println("Using Arrays.deepToString(): "
                + Arrays.deepToString(multi));
    }
}