public class RPSSelector {
    //first example has to be R P or S
    public static void main(String[] args)
    {
        String playerMove = "X"; //must be R P or S

        playerMove.toUpperCase(); // forces uppercase so do not have to worry about other inputs

        //closed set can only be R P S
        if (playerMove.equalsIgnoreCase("R"))
        {
            System.out.println("Rock!");
        }
        else if (playerMove.equalsIgnoreCase("P")) //
        {
            System.out.println("Paper!");
        }
        else // it is Scissors
        {
            System.out.println("Scissors!");
        }

        // open set can be R P S or anything else
        if(playerMove.equalsIgnoreCase("R"))
        {
            System.out.println("Rock!");
        }
        else if (playerMove.equalsIgnoreCase("P"))
        {
            System.out.println("Paper!");
        }
        else if (playerMove.equalsIgnoreCase("S"))// it is Scissors
        {
            System.out.println("Scissors!");
        }
        else // error conditions
        {
            System.out.println("Not a Move!");
        }
    }
}

//when you use == it is checking to see if the objects have the same location in memory, but it is not checking to see if they are equivalent