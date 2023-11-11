package week_01;

public class OddAndEven {


    public static void main(String[] args) {


        System.out.println(identify(6));


    }


    public static String identify(int number){


        if(number % 2 == 0){
            return "Even";
        }else {
            return "Odd";
        }



    }




}
/*
Write a method which can identifies given number is eve or odd

EX:

identify(5) -> "Odd"
identify(6) -> "Even"

 */