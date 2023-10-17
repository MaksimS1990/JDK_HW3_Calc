package homework03;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("2 + 3 = " + Calculator.sum(2, 3));
        System.out.println("2 - 3 = " + Calculator.substract(2, 3));
        System.out.println("2 * 3 = " + Calculator.multiply(2, 3));
        System.out.println("2 / 3 = " + Calculator.divide(2, 3));
        System.out.println();

        Integer[] array1 = {1, 3, 5, 7};
        Integer[] array2 = {1, 3, 5, 7};
        Integer[] array3 = {11, 26, 74, 68};
        String[] array4 = {"cat", "dog", "elefant", "bird"};

        System.out.println("Массивы " + Arrays.toString(array1) + " и " + Arrays.toString(array1) + " равны? " + compareArrays(array1, array2));
        System.out.println("Массивы " + Arrays.toString(array1) + " и " + Arrays.toString(array3) + " равны? " + compareArrays(array1, array3));
        System.out.println("Массивы " + Arrays.toString(array1) + " и " + Arrays.toString(array4) + " равны? " + compareArrays(array1, array4));
        System.out.println();


        Pair pair = new Pair(5, "main");

        System.out.println(pair);

        System.out.println(compareArrays(array1, array2));

    }

    public static <T> boolean compareArrays(T[] array1, T[] array2) {
        return Arrays.equals(array1, array2);
    }
}