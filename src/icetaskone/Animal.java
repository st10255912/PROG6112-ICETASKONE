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
        Because the variables IDtag and species has to be in the Animal class, the values must be introduced in the Animal class
        
        Request the user to enter the birds ID tag.
        
        Store what the user entered to the IDtag variable.
    
        Allow the scanner to consume a newline so that the user can enter the following request.
        
        Request the user to enter the species of the bird.
    
        Store what the user entered to the species variable.
    */
    public void input() {
        System.out.print("Enter ID tag: ");
        IDtag = kb.nextInt();
        kb.nextLine();
        System.out.print("Enter species: ");
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
