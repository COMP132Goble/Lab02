package ownPest;

/** 
 * This class implements the behavior of virtual pests that annoy their
 * owner.
 * 
 * @author Tim Wahls edited by William Goble
 * @author (YOUR NAME HERE)
 * @version (PUT DATE HERE)
 */

public class OwnVirtualPest {

    private String name;    // pest name
    private int state;      // current state of the pest

    /** 
     * initialize Virtual Pest name and state
     * @param initName the name of the pest
     * @param initState the initial state of the Pest
     */
    public OwnVirtualPest(String initName, int initState) {
        name = initName;
        state = initState;
    }
  
    /** 
     * get the name of the Pest
     * @return the name of the Pest
     */
    public String getName() {
        return name;
    }
  
    /** 
     * get the state of the Pest (as an int)
     * @return the state of the Pest
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
        return "src/ownPest/myImg.jpg";
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
    	//complete this method with your own code
        
        return "";
    }
    
    /** 
     * returns the actionNumth action that can be applied to the Pest 
     * (not including random)
     * if actionNum does not correspond to a valid action, this method returns
     * the empty string ""
     * @param actionNum the number of the requested action
     * @return the name of the actionNumth action
     */
    public String getAction(int actionNum) {
    	//complete this method with your own code
        
        return "";
    }
  
    /**
     * return the sound that the pest makes in its current state
     * if the state is invalid, this method returns the empty string ""
     * @return the pest sound in the current state
     */
    public String getPestSound() {
        // replace with your own code
        return "";
    }
  
    /** 
     * return how the Pest acts in its current state
     * if the state is invalid, this method returns the empty string ""
     * @return the pest action in the current state
     */  
    public String getPestAction() {
        // replace with your own code
        return "";
    }

   
   /** 
    * change the state of the Pest in response to the specified owner action 
    * (and also the random action).  If the action is not valid, the state
    * of the pet does not change
    * @param action the action that the Pest responds to 
    */
    public void doAction(int action) {
        // replace with your own code
    }
}
