

package icetaskone;

import java.util.Scanner;


public class Bird extends Animal{
    //Creating private variable to hold the integer variable for the colour of the bird & Scanner object
    private int colour;
    Scanner kb = new Scanner(System.in);
    
    /*
        Because input() is also found in parent class, @Override is required.
        
        Run the parent input() method to get the input for the IDtag and species.
        
        Request user to input an integer which correlates to a specific colour.
        
        Assigns what the user entered to the colour variable.
    */
    @Override
    public void input() {
        super.input();
        System.out.print("Enter feather colour:\n"
                    + "1 = Grey,\n"
                    + "2 = White,\n"
                    + "3 = Black\n");
        colour = kb.nextInt();
    }

    /*
        Because output() is also found in parent class, @Override is required.
        
        Run the parent output() method to output the IDtag and species.
    
        Create a String variable to link the integer the user entered to the corresponding colour.
    
        Output a message and the corresponding colour.
    */
    @Override
    public void output() {
        super.output();
        String strColour = "";
        switch(colour){
            case 1:
                strColour = "Grey";
                break;
            case 2:
                strColour = "White";
                break;
            case 3:
                strColour = "Black";
                break;
        }
        
        System.out.println("Feather Colour: " + strColour);
    }
}
