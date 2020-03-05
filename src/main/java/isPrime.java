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
public class isPrime {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a integer");
        int userNumber = keyboard.nextInt();
        System.out.println(isPrime( userNumber));
        
    }
    public static boolean isPrime(int userNumber){
        int evenDivisions = 0;
        if (userNumber <1 ){
            return false;
        }
        for (int currentDivision = 1; currentDivision <= userNumber; currentDivision++){
            if (userNumber % currentDivision == 0){
                evenDivisions = evenDivisions + 1;
                if ((evenDivisions > 2) || (userNumber ==1 )){
                    return false;
                }
            }
        }
        return true;
    }
    }
    