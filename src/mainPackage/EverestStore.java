package mainPackage;

public class EverestStore {
	PizzaStore everestStore = new EverestPizzaStore();
	
	public EverestStore() {
	}
	
	public void up() {
		System.out.println("Everest store is open\n");
	}
	
	public void down() {
		System.out.println("Everest store is closed");
	}
	
	public void orderCheesePizza() {
		everestStore.orderPizza("cheese");
	}
	
	public void orderMeatPizza() {
		everestStore.orderPizza("meat");
	}
	
	public void orderVeggiePizza() {
		everestStore.orderPizza("veggie");
	}
}
	
