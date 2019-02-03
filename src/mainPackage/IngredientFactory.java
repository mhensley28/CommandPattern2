package mainPackage;

public interface IngredientFactory {
	public Bake createBake();
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Meats[] createMeats();
}
