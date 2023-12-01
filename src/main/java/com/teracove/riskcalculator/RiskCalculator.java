/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.teracove.riskcalculator;
import java.util.Scanner;
/**
 *
 * @author Kevin Thomas
 */
public class RiskCalculator {

    public static void main(String[] args) {
        //Initialize Scanner object
        Scanner scanner = new Scanner(System.in);
        
        //Set risk tolerance to 2%
        double riskTolerance = 0.02;
        
        //Set account size
        System.out.println("Enter your account size: ");
        int accountSize = scanner.nextInt();
        scanner.nextLine();
        
        //Get share price
        System.out.println("Enter the price per share: ");
        double sharePrice = scanner.nextDouble();
        scanner.nextLine();
        
        //Get number of shares
        System.out.println("Enter the number of shares: ");
        int numShares = scanner.nextInt();
        scanner.nextLine();
        
        //Calculate the dollar amount able to risk
        double amountRisk = riskTolerance * accountSize;
        //Compute how far down the share price can go before selling
        double priceMove = amountRisk/numShares;
        
        //Output sale price
        System.out.printf("Sell at: $%.2f", (sharePrice - priceMove) );
    }
}
