package mainPackage;

public class KilaueaStore {
	PizzaStore kilaueaStore = new KilaueaPizzaStore();
	
	public KilaueaStore() {
	}
	
	public void up() {
		System.out.println("Kilauea store is open\n");
	}
	
	public void down() {
		System.out.println("Kilauea store is closed");
	}
	
	public void orderCheesePizza() {
		kilaueaStore.orderPizza("cheese");
	}
	
	public void orderMeatPizza() {
		kilaueaStore.orderPizza("meat");
	}
	
	public void orderVeggiePizza() {
		kilaueaStore.orderPizza("veggie");
	}
}
	
