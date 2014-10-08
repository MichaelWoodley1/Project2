
public class Main {

    static String[] events;
    static String[][] olympians;
    static OlympianManager olympianManager = new OlympianManager();
    EventManager eventManager = new EventManager();

    public static void main(String[] args) {
    	
        createEvents();
        createOlympians();
        String command;
        
        //Display Application Name
        System.out.println("Lawn Game Olympics");

        //Reads user input and stores it as newString
        if(args.length != 0) {
            command = args[0].toLowerCase();
            if (command.equals("events") || command.equals("e")) {
                listEvents();
            } else if (command.equals("olympians") || command.equals("o")) {
                listOlympians();
            }  else if (command.equals("help") || command.equals("h")) {
                listHelp();
            } else {
                System.out.println("invalid input");
            }
        } else {
            System.out.println("Enter a command please.");
        }
    }//end main method

    //initializes the list of events for the day
    public static void createEvents() {
        events = new String[]{"Washoo","CamJam","Horsehoes","Cornhole","Ladderball","Stickgame"};

    }//end method

    //Display the list of Olympians for the day
    public static void listEvents() {

        for (int i = 0; i < events.length; i++) {
            System.out.println(events[i]);
        }
    }//end method

    public static void createOlympians() {
        olympians = new String[][]{{"Mike", "M", "20"},
                {"Katie", "F", "18"},
                {"Charlie", "M", "19"},
                {"Rachel", "F", "21"},
                {"Joe", "M", "39"},
                {"Regina", "F", "51"},
                {"Tommy", "M", "25"},
                {"Sarah", "F", "9"},
                {"Ryan", "M", "21"},
                {"Casey", "F", "18"},
                {"Billy", "F", "26"},
                {"Noah", "M", "35"},
                {"Sebastian", "M", "18"},
                {"Victoria", "F", "22"},
                {"Thomas", "M", "17"},
                {"Matthew", "M", "19"}};
    }

    //How to display the olympians in the array
    public static void listOlympians() {

//        for (int col = 0; col < olympians.length; col++) {
//            //
//            for (int row = 0; row < olympians[col].length; row++) {
//                System.out.print(olympians[col][row]);
//                System.out.print(", ");
//            }
//            System.out.println();
//        }
    	
    	for (int i = 0; i < olympianManager.olympians.length; i++) {
    		System.out.println(olympianManager.olympians[i]);
    	}
    }//end method

    //Display the list of Help options
    public static void listHelp() {
        System.out.println("events or e : list the day's events");
        System.out.println("olympians or e : list the day's olympians");
        System.out.println("help or h : display the acceptable commands as well as a description of what each command does ");

    }//end method


}
