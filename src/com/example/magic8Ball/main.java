package com.example.magic8Ball;

import java.util.Scanner;
import static com.example.magic8Ball.Functions.*;

public class main {

    public static void main(String[] args){
        printMessage("MAGIC 8 BALL", true, true);
        printBall();

        Scanner stdin = new Scanner(System.in);
        char c;

        do {
            System.out.print("Enter y to see your future!(n to exit): "); c = stdin.next().charAt(0);
            if(c == 'y')
                magicEightGenerator();
            System.out.println("___________________________________");
        }while(c != 'n');

        stdin.close();
    }
}
