package mainPackage;

public abstract class PizzaStore {
	 
		protected abstract Pizza createPizza(String item);
	 
		public Pizza orderPizza(String type) {
			Pizza pizza = createPizza(type);
			System.out.println("--- Making a " + pizza.getName() + " ---");
			pizza.prepare();
			//pizza.bakeString();
			pizza.bake();
			pizza.cut();
			pizza.box();
			System.out.println(pizza);
			return pizza;
		}
}
