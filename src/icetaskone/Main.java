package icetaskone;


public class Main { 
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
}
