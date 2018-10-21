package by.haa.tms.hw002;

import java.util.Arrays;
import java.util.Random;

public class ArrayWorker {

    public static int[] buildIntOneArray (int length, int startValue, int finishValue){
        Random random = new Random();
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            do {
                array[i] = random.nextInt(finishValue);
            }
            while(array[i] < startValue);
        }
        return array;
    }

//    public static int[] buildIntMultiArray (int[] size,  int startValue, int finishValue){
//        Random random = new Random();
//
//        int[] array = new int[length];
//        for (int i = 0; i < array.length; i++) {
//            do {
//                array[i] = random.nextInt(finishValue);
//            }
//            while(array[i] < startValue);
//        }
//        return array;
//    }

    public static void printOneDimensionalArray (int[] array){
        String strArray = Arrays.toString(array);
        System.out.println(strArray);
    }

    public static void printMultiDimensionalArray (int[][] array){
        String strArray = Arrays.deepToString(array);
        System.out.println(strArray);
    }

    public static void printSeparator(){
        System.out.println("____________________________________");
    }
}
