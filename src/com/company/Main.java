package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] someInts = new int[10];
        System.out.println(someInts);
//        System.out.println(Arrays.toString(someInts));

        // if you don't declare the values of each element in the Array it defaults them all to 0

//        someInts[0] = 15; //at least we can access the elements with bracket notation
//        someInts[4] = 4;
//        System.out.println(Arrays.toString(someInts));
        int[] someOtherInts = {1,3,5,7,9,11,13}; // we didn't have to declare the size, it gets dictated by the values
//        System.out.println(Arrays.toString(someOtherInts));

    }

}
