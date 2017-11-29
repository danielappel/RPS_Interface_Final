import java.util.Random;

public class RPSPlayer implements Player
{
    private String name;
    private String choice;
    private boolean cpu;
    private int score;
    /**
     * Constructor for objects of class RPSPlayer
     */
    public RPSPlayer(boolean computer)
    {
        // initialise instance variables
        this.cpu = computer;
        this.name = setName(cpu);
    }

    /**
     * Returns String of "Rock", "Paper" or "Scissors"
     * Will be random if computer = true
     */
    public void setChoice(boolean computer) {
         if(!cpu) {
             //ask the user
             System.out.println("Enter your choice: \nrock \npaper \nscissors");
             this.choice = scan.next();
            }
         else {
                //use random choice
                this.choice = randomChoice();
         }
    }
    
    public boolean getCPU() {
        return this.cpu;
    }
    
    public int getScore() {
        return this.score;
    }
    
    public void updateScore(int value) {
        this.score += value;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getChoice() {
        return this.choice;
    }
    
    public String toString() {
        return "The player " + name + " has choosen " + choice;
    }
    
    /**
     * Set's the player name.  If computer = true, returns "CPU"
     */
    public String setName(boolean computer) {
        if(!cpu) {
            System.out.println("What is your name?");
            this.name = scan.next();
        }
        else {
            this.name = "CPU";
        }
        return this.name;
    }
    
     /**
     * If cpu then return a random choice
     */
    public String randomChoice() {
            Random gen = new Random();
          
            int value = gen.nextInt(3);
            if(value == 0) {
                return "rock";
            }
            else if (value == 1) {
                return "paper";
            }
            else {
                return "scissors";
            }
    }
}
