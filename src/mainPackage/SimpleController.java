package mainPackage;

public class SimpleController {
	Command slot;
	 
	public SimpleController() {}
 
	public void setCommand(Command command) {
		slot = command;
	}
 
	public void buttonWasPressed() {
		slot.execute();
	}
}
