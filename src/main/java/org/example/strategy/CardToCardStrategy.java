package org.example.strategy;

import org.example.model.Bank;
import org.example.model.Card;

import java.util.Scanner;

public class CardToCardStrategy implements MenuStrategy{
    @Override
    public void execute() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter card number to :");
        long cardNumber = sc.nextLong();


    }
}
