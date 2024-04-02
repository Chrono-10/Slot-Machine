/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package slotmachine;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author curtc
 */
public class SlotMachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random random = new Random();
        Scanner myObj = new Scanner(System.in);
        Scanner myObj2 = new Scanner(System.in);
        int credits = 100;
        int min = 1;
        int max = 10;
        boolean again = true;
        System.out.println("====================================");
        System.out.println("WELCOME TO WILL YOU ALWAYS LOSE");
        System.out.println("====================================");
        System.out.println("WIN BIG OR GO HOME WITH NOTHING.....");
        System.out.println("====================================");
        System.out.println("GET 3 OF THE SAME NUMBER AND DOUBLE WHAT YOU PLAYED");
        System.out.println("====================================");
        
        while(again == true && credits > 0){
            System.out.println("YOU CURRENTLY HAVE " + credits + " CREDITS. HOW MUCH WOULD YOU LIKE TO PLAY" );
            int bet = myObj.nextInt();
            if (bet <= credits){
                int num1 = random.nextInt(min, max);
                int num2 = random.nextInt(min, max);
                int num3 = random.nextInt(min, max);

                System.out.println(num1 + " || " +  num2 + " || " + num3);
                credits = credits - bet;
                // System.out.println("YOU HAVE " + credits + " CREDITS LEFT");

                if (num1 == num2 && num2 == num3){
                    System.out.println("YOU HAVE WON " + (bet * 2) + " CREDITS!!!!!!!!!!!!!!!!!!!!!!!!");
                    credits = credits + (bet * 2);
                    System.out.println("WOULD YOU LIKE TO PLAY AGAIN???? Y/N");
                    System.out.println("====================================");
                    String question = myObj2.nextLine().toUpperCase();
                    System.out.println("====================================");
                    if ("N".equals(question)){
                        System.out.println("YOU HAVE CASHED OUT " + credits + " CREDITS\n"
                                + "COME LOSE AGAIN SOON!!!!!!! HAHAHAHAHA");
                        again = false;
                    }
                }
                else if (num1 == num2 || num1 == num3 || num2 == num3){
                    System.out.println("ALMOST.....");
                    System.out.println("====================================");
                    System.out.println("WOULD YOU LIKE TO PLAY AGAIN???? Y/N");
                    System.out.println("====================================");
                    String question = myObj2.nextLine().toUpperCase();
                    System.out.println("====================================");
                    if ("N".equals(question)){
                        System.out.println("YOU HAVE CASHED OUT " + credits + " CREDITS\n"
                                + "COME LOSE AGAIN SOON!!!!!!! HAHAHAHAHA");
                        again = false;
                    }
                }
                else{
                    System.out.println("YOU LOST THAT ONE!!!!!!!! HAHAHAHAHA!");
                    System.out.println("====================================");
                    System.out.println("WOULD YOU LIKE TO PLAY AGAIN???? Y/N");
                    System.out.println("====================================");
                    String question = myObj2.nextLine().toUpperCase();
                    System.out.println("====================================");
                    if ("N".equals(question)){
                        System.out.println("YOU HAVE CASHED OUT " + credits + " CREDITS\n"
                                + "COME LOSE AGAIN SOON!!!!!!! HAHAHAHAHA");
                        again = false;
                    }
                }
            }
            else{
                System.out.println("====================================");
                System.out.println("YOU BIT OFF MORE THEN YOU CAN CHEW!");
                System.out.println("====================================");
                break;
            }
        }
    }
}
