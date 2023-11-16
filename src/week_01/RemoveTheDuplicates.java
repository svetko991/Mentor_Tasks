package week_01;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveTheDuplicates {


    public static void main(String[] args) {

        Integer[] arr = {1, 1, 2, 3, 2, 4, 2, 2, 5, 6, 6, 6};


        for (int each : arr) {


            int count = 0;

            for (int each1 : arr) {

                if (each1 == each) {
                    count++;
                }

            }

            if (count == 1) {
                System.out.println(each + " ");
            }


        }



        System.out.println("==========USING OTHER DATA STRUCTURES============");

       Set<Integer> set1 = new LinkedHashSet<>();
      set1.addAll(Arrays.asList(arr));

        System.out.println(set1);


    }
}
  /*
    Remove Duplicates from Array: Write a Java program to remove duplicates from an array of integers.
    Try to achieve this with and without using additional data structures.

     */
