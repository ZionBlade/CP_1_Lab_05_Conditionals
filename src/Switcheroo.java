public class Switcheroo
{
    public static void main(String[] args)
    {
        String playerA = "R";
        playerA.toUpperCase();

        switch(playerA)
        {
            case "R":
            case "r":
                System.out.println("It's a ROCK!");
                break; //should never code with two cases and one break, should just force uppercase
            case "P":
                System.out.println("It's PAPER");
                break;
            case "S":
                System.out.println("It's SCISSORS");
                break;
            default:
                System.out.println("ILLEGAL MOVE");
                break;
        }
    }

}
