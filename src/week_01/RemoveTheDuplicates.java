package week_01;

public class RemoveTheDuplicates {


    public static void main(String[] args) {

        int[] arr = {1,1,2,3,2,4,2,2,5,6};


        for (int each : arr) {

            int count =0;

            for (int each1 : arr) {

                if(each1 == each){
                    count++;
                }

            }

            if(count == 1){
                System.out.println(each);
            }


        }








    }
}
  /*
    Remove Duplicates from Array: Write a Java program to remove duplicates from an array of integers.
    Try to achieve this with and without using additional data structures.

     */
