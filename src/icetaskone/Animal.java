

package icetaskone;

import java.util.Scanner;


public class Animal {
    /*
        Declaring the IDtag and species variables.
        
        Creating the scanner object.
    */
    private int IDtag;
    private String species;
    Scanner kb = new Scanner(System.in);
    
    /*
        Creating a constructor for the Bird class named brd.
        Creating a constructor for the Reptile class named rept.
    
        Output the message to indicate to the user to input the values for the corresponding bird variables
        Run the input() method from the Bird class.
    
        Output the message to indicate to the user to input the values for the corresponding reptile variables
        Run the input() method from the Reptile class.
    
        Output the message to indicate to the user that the following information is for the corresponding bird.
        Run the output() method from the Bird class.
    
        Output the message to indicate to the user that the following information is for the corresponding reptile.
        Run the output() method from the Reptile class.
    */
    public static void main(String[] args) {
        Bird brd = new Bird();
        Reptile rept = new Reptile();

        System.out.println("Input values for Bird:");
        brd.input();

        System.out.println("\nInput values for Reptile:");
        rept.input();

        System.out.println("\nBird Details:");
        brd.output();

        System.out.println("\nReptile Details:");
        rept.output();
    }
    
    /*
        Because the variables IDtag and species has to be in the Animal class, the values must be introduced in the Animal class
        
        Request the user to enter the birds ID tag.
        
        Store what the user entered to the IDtag variable.
    
        Allow the scanner to consume a newline so that the user can enter the following request.
        
        Request the user to enter the species of the bird.
    
        Store what the user entered to the species variable.
    */
    public void input() {
        System.out.println("Enter ID tag: ");
        IDtag = kb.nextInt();
        kb.nextLine();
        System.out.println("Enter species: ");
        species = kb.nextLine();
    }
    
    /*
        Output the IDtag variable with a corresponding label.
    
        Output the species variable with a corresponding label.
    */
    public void output() {
        System.out.println("ID Tag: " + IDtag);
        System.out.println("Species: " + species);
    }
    
}
