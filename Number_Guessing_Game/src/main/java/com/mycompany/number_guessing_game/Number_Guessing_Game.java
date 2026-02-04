/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.number_guessing_game;

/**
 *
 * @author Nullroot 13
 */
import java.util.Scanner;
import java.util.Random;

public class Number_Guessing_Game {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random random = new Random();

        int randomNumber = random.nextInt(100) + 1;

        int guess = 0;

        System.out.println("Welcome to Number Guessing Game!");
        System.out.println("Guess a number 1-100.");

        while (guess != randomNumber) {
            System.out.println("Enter your guess:");
            guess = sc.nextInt();
        }

        System.out.println("Enter your guess:  ");
        guess = sc.nextInt();

        if (guess < randomNumber) {
            System.out.println("Too low!");

        } else if (guess > randomNumber) {
            System.out.println("Too high!");
        } else {
            System.out.println("Correct! you have guessed the number.");
        }

        sc.close();

    }
}
