package demoPest;

/**
 * This class implements the behavior of virtual pests that annoy their owners.
 * 
 * @author Tim Wahls, edits by William Goble
 * 
 * @author (Student 1 Name Here)
 * @author (Student 2 Name Here)
 * @version (Date Here)
 */
public class VirtualPest {
    private String name;    // pest name
    private int state;      // current state of the pest

    /**
     * initialize virtual pest and state
     * @param name -- the name of the pest
     * @param state -- the initial state of the pest
     */
    public VirtualPest(String name, int state) {
        this.name = name;
        this.state = state;
    }

    /**
     * get the name of the pest
     * 
     * @return the name of the pest
     */
    public String getName() {
        return name;
    }

    /**
     * Get the state of the pest as an int.
     * 
     * @return the state of the pest
     */
    public int getIntState() {
        return state;
    }

    /** 
     * returns the file name for the Pest image.  The file must be located  
     * in the DemoPest project directory.
     * @return the file name for the Pest image
     */
    public String getFile() {
        return "src/demoPest/fish.jpg";
    }
    
    /** 
     * returns the number of actions that the Pest responds to (NOT including
     * the random action)
     * @return the number of actions
     */
    public int getNumActions() {
        return 3;
    }

    /** 
     * return the current state of the Pest (as a String)
     * if the current state is invalid, this method returns "error"
     * @return the current state of the Pest
     */
    public String getState() {
        String stateStr;

        if (state == 1)
            stateStr = "hungry";
        else if (state == 2) 
            stateStr = "sleepy";
        else if (state == 3) 
            stateStr = "full";
        else if (state == 4)
            stateStr = "grouchy";
        else
            stateStr = "error";

        return stateStr;
    }

    /** 
     * returns the n-th action that can be applied to the Pest 
     * (not including random)
     * if n does not correspond to a valid action, this method returns
     * the empty string ""
     * @param actionNum the number of the requested action
     * @return the name of the actionNumth action
     */
    public String getAction(int n) {
        String action;

        if (n == 1) {
            action = "feed";
        } else if (n == 2) {
            action = "pet";
        } else if (n == 3) {
            action = "put to bed";
        } else {
            action = "";
        }

        return action;
    }

    /**
     * return the sound that the pest makes in its current state
     * if the state is invalid, this method returns the empty string ""
     * @return the pest sound in the current state
     */
    public String getPestSound() {
        // replace with your own code.
        return " ";
    }

    /** 
     * return how the Pest acts in its current state
     * if the state is invalid, this method returns the empty string ""
     * @return the pest action in the current state
     */  
    public String getPestAction() {
        // replace with your own code.
        return " ";
    }

    /** 
    * change the state of the Pest in response to the specified owner action 
    * (and also the random action).  If the action is not valid, the state
    * of the pet does not change
    * @param action the action that the Pest responds to 
    */
    public void doAction(int action) {
        // replace with your own code.
    }
}
