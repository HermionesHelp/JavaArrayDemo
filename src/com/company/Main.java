package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] someInts = new int[10];
        System.out.println(someInts); // this isn't very useful
        System.out.println(Arrays.toString(someInts)); //that's better

        // if you don't declare the values of each element in the Array it defaults them all to 0

//        someInts[0] = 15; //at least we can access the elements with bracket notation
//        someInts[4] = 4;
//        System.out.println(Arrays.toString(someInts));
        int[] someOtherInts = {1,3,5,7,9,11,13}; // we didn't have to declare the size, it gets dictated by the values
//        System.out.println(Arrays.toString(someOtherInts));

        // Arrays are much stricter in Java. There size is fixed, and they can only hold one type
        // How rude.

        // What else has Java got?
//        ArrayList<Integer> myList = new ArrayList<Integer>();
//        System.out.println(myList);
//        myList.add(1);
//        myList.add(15);
//        myList.add(42);

        // ArrayLists are more similar to what we are used to from JS, but they still only support one type of data.
    }

}
