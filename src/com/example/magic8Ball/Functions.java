package com.example.magic8Ball;

import java.util.Random;

public class Functions {

    public static void printBall(){
        System.out.println("     ----");
        System.out.println("  --|     |-- ");
        System.out.println(" |           | ");
        System.out.println("|     |8|     | ");
        System.out.println(" |           | ");
        System.out.println("  --|     |-- ");
        System.out.println("      ---");

    }

    public static int randomNumberGenerator(){
        Random rand_int = new Random();
        return rand_int.nextInt(20) + 1;
    }

    public static void magicEightGenerator(){
        switch(randomNumberGenerator()){
            //1 - 10 are positive affirmations
            case 1:
                System.out.println("It is certain");
                break;

            case 2:
                System.out.println("It is decidedly so");
                break;

            case 3:
                System.out.println("Without a doubt");
                break;

            case 4:
                System.out.println("Yes - Definitely");
                break;

            case 5:
                System.out.println("You may rely on it");
                break;

            case 6:
                System.out.println("Ah I see it, yes");
                break;

            case 7:
                System.out.println("Most likely");
                break;

            case 8:
                System.out.println("Outlook good");
                break;

            case 9:
                System.out.println("Yes");
                break;

            case 10:
                System.out.println("Signs point to yes");
                break;


            //11 - 15 are positive neutral affirmations
            case 11:
                System.out.println("Reply hazy, try again");
                break;

            case 12:
                System.out.println("Ask again later");
                break;

            case 13:
                System.out.println("Better not tell you now");
                break;

            case 14:
                System.out.println("Cannot predict now");
                break;

            case 15:
                System.out.println("Concentrate and ask again");
                break;

            //16 - 20 are negative affirmations
            case 16:
                System.out.println("Don't count on it");
                break;

            case 17:
                System.out.println("My reply is no");
                break;

            case 18:
                System.out.println("My sources say no");
                break;

            case 19:
                System.out.println("Outlook not so good");
                break;

            case 20:
                System.out.println("Very doubtful");
                break;
        }
    }


    public static void printMessage(String message, boolean printTop, boolean printBottom){
        if(printTop){
            System.out.println("+---------------------------------+");
            System.out.print("|");
        }
        else{
            System.out.print("|");
        }

        boolean front = true;

        for(int i = message.length(); i < 33; i++){
            if(front){
                message = " " + message;
            }
            else{
                message = message + " ";
            }
            front = !front;
        }
        System.out.print(message);


        if(printBottom){
            System.out.println("|");
            System.out.println("+---------------------------------+");
        }
        else{
            System.out.println("|");
        }

    }

}
