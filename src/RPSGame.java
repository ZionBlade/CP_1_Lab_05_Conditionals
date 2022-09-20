public class RPSGame
{
    public static void main(String[] args) // can just type main to do that
    {
        String playerA = "R";
        String playerB = "P";

        // closed set
        // nested if
        if (playerA.equalsIgnoreCase("R")) // if you don't have IgnoreCase, it is just equals, so the input would have to be an exact match
        {
            // playerB code crossed against the PlayerA Rock move
            if(playerB.equalsIgnoreCase("R"))
            {
                System.out.println("ROCK vs ROCK! It's a TIE!");
            }
            else if (playerB.equalsIgnoreCase("P"))
            {
                System.out.println("PAPER covers ROCK! Player B wins!");
            }
            else // Player B is Scissors
            {
                System.out.println("ROCK breaks SCISSORS! Player A wins!");
            }
        }
        else if (playerA.equalsIgnoreCase("P"))
        {
            if(playerB.equalsIgnoreCase("R"))
            {
                System.out.println("Paper Covers Rock! Player A Wins!");
            }
            else if (playerB.equalsIgnoreCase("P"))
            {
                System.out.println("PAPER vs PAPER! It's a TIE!");
            }
            else // Player B is Scissors
            {
                System.out.println("SCISSORS cuts PAPER! Player B wins!");
            }
        }
        else // PlayerA is Scissors
        {
            if(playerB.equalsIgnoreCase("R"))
            {
                System.out.println("ROCK breaks SCISSORS! Player B wins!");
            }
            else if (playerB.equalsIgnoreCase("P"))
            {
                System.out.println("SCISSORS cuts PAPER! Player A wins!");
            }
            else // Player B is Scissors
            {
                System.out.println("SCISSORS vs SCISSORS! It's a TIE!");
            }
        }
    }
}
