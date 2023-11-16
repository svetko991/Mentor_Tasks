package week_01;

public class Practice {

    public static void main(String[] args) {


        int firstNumber = 0;
        int secondNumber = 1;


        for (int i = 1; i <= 10; i++) {

            System.out.print(firstNumber + " ");

            int sum = firstNumber + secondNumber;

            firstNumber = secondNumber;
            secondNumber = sum;


        }


    }
}
/*
/*
    Fibonacci Series:
    Write a Java program to print the
    first 10 numbers of the Fibonacci series.
     Note: The Fibonacci Sequence is the series
     of numbers where the next number is found
     by adding up the two numbers before it.




 */
