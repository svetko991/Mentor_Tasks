package week_01;

public class DivideTwoNumbers {

    public static void main(String[] args) {

        // 4*5 =20   -->5 + 5 + 5 + 5 =20
        // 20 /5 =5 --> 20 -5 - 5 - 5 - 5 =0


       int num1 = 50;
       int num2 = 5;

       divideTwoNumbers(num1,num2);
    }

    public static void divideTwoNumbers(int a, int b){

        int reminder = a % b;

        int result = 0;

        while (a >= b) {
            a = a - b;
            result++;

        }

        System.out.println(result + "." + reminder);


    }





}
/*
Write a method thaht cena divide two numbers without using division operator
 */