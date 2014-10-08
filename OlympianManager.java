public class OlympianManager {
    public Olympian[] olympians;
    
    // Constructor
    public OlympianManager() {
        Main.createOlympians();
        this.olympians = new Olympian[16];
        for(int i = 0; i < this.olympians.length; i++) {
        	// create a new olympian object
        	Sex tempSex = this.getSex(Main.olympians[i][1]);
        	Olympian temp = new Olympian(Main.olympians[i][0], tempSex, Integer.parseInt(Main.olympians[i][2]));
        	
        	// add the new object into the array
        	this.olympians[i] = temp;
        }
    }
    
    public Olympian[] getOlympians() {
    	return this.olympians;
    }
    
    // Convert String into Enum
    public Sex getSex(String gender) {
    	if(gender == "M") {
    		return Sex.MALE;
    	} else {
    		return Sex.FEMALE;
    	}
    }
}


