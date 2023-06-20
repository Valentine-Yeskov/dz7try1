package Papka;

import java.util.Arrays;

public class ArrayValueCalculator {
    public static void doCalc (String[]  arrayStrings){
        int [] arrayInt = Arrays.stream(arrayStrings).mapToInt(Integer::parseInt).toArray();
        System.out.println(Arrays.toString(arrayInt));


    }
}
