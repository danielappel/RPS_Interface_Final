

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

    }
    
    public boolean getCPU() {
        return false;
    }
    
    public int getScore() {
        return 0;
    }
    
    public void updateScore(int value) {
        
    }
    
    public String getName() {
        return null;
    }
    
    public String getChoice() {
        return null;
    }
    
    public String toString() {
        return "The player " + name + " has choosen " + choice;
    }
    
    /**
     * Set's the player name.  If computer = true, returns "CPU"
     */
    public String setName(boolean computer) {
        return null;
    }
    
     /**
     * If cpu then return a random choice
     */
    public String randomChoice() {
        return null;
    }
}
