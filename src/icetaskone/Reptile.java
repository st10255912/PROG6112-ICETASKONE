

package icetaskone;

import java.util.Scanner;


public class Reptile extends Animal{
    //Creating private variable to contain the blood temperature of the reptile & Scanner object
    private double bloodTemp;
    Scanner kb = new Scanner(System.in);
    
    /*
        Because input() is also found in parent class, @Override is required.
        
        Run the parent input() method to get the input for the IDtag and species.
        
        Request user to input a double to correlate to the reptiles temperature.
        
        Assigns what the user entered to the bloodTemp variable.
    */
    @Override
    public void input() {
        super.input();
        System.out.print("Enter blood temperature in C (eg. 10,5): ");
        bloodTemp = kb.nextDouble();
    }
    
    /*
        Because output() is also found in parent class, @Override is required.
        
        Run the parent output() method to output the IDtag and species.
    
        Output a message and the corresponding blood temperature.
    */
    @Override
    public void output() {
        super.output();
        System.out.println("Blood Temperature: " + bloodTemp + "C.");
    }
    
}
