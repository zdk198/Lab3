import javax.swing.JOptionPane;
import java.io.*;
import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zachkorte
 */
public class EvenOddCounter {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        Random random = new Random();
        int randomNumberGenerated;
        int numberOfEvenNumbers = 0;
        int numberOfOddNumbers = 0;
        for( int currentNumber = 1; currentNumber <= 100; currentNumber++){
            randomNumberGenerated = random.nextInt(10) + 1;
            if (isEven(randomNumberGenerated)){
                numberOfEvenNumbers +=1;
            }else{
                numberOfOddNumbers +=1;
            }
        }
        System.out.println("There was " + numberOfEvenNumbers + " even numbers and " + numberOfOddNumbers + " odd numbers");
    }
    public static boolean isEven(int number){
        if((number % 2)==0){
            return true;
        }else{
            return false;
        }
    }
}
