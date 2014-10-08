
public class EventManager {
	public Event[] events;
	
	// constructor
	public EventManager() {
		// initialize the events array to size 6
		this.events = new Event[6];
		
		// creating events
		CanJamEvent canJamEvent = new CanJamEvent();
		WashoosEvent washoosEvent = new WashoosEvent();
		
		// TODO: adding events to the array
		this.events[0] = canJamEvent;
	}
	
	public Event[] getEvents() {
		return this.events;
	}
}
