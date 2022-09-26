public class partyAfilliation {
    public static void main(String[] args){
        String menuChoice = "";
        String menu = "D, R, I";
        if(menuChoice.equalsIgnoreCase("D"))
        {
            System.out.print("You get a democratic donkey!");
        }
        else if(menuChoice.equalsIgnoreCase("R"))
        {
            System.out.print("You get a republican elephant!");
        }
        else if(menuChoice.equalsIgnoreCase("I"))
        {
            System.out.print("You get an independant person!");
        }
        else
        {
            System.out.print("You get an other otter!");
        }
    }
}
