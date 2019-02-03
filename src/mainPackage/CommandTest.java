package mainPackage;

public class CommandTest {

	public static void main(String[] args) {
		SimpleController remote = new SimpleController();
		KilaueaStore kilaueaStore = new KilaueaStore();
		EverestStore everestStore = new EverestStore();
		remote.setCommand(everestStore::up);
		remote.buttonWasPressed();
		remote.setCommand(everestStore::orderCheesePizza);
		remote.buttonWasPressed();
		remote.setCommand(everestStore::orderMeatPizza);
		remote.buttonWasPressed();
		remote.setCommand(everestStore::orderVeggiePizza);
		remote.buttonWasPressed();
		remote.setCommand(kilaueaStore::up);
		remote.buttonWasPressed();
		remote.setCommand(kilaueaStore::orderCheesePizza);
		remote.buttonWasPressed();
		remote.setCommand(kilaueaStore::orderMeatPizza);
		remote.buttonWasPressed();
		remote.setCommand(kilaueaStore::orderVeggiePizza);
		remote.buttonWasPressed();
		remote.setCommand(everestStore::down);
		remote.buttonWasPressed();
		remote.setCommand(kilaueaStore::down);
		remote.buttonWasPressed();
	}

}
