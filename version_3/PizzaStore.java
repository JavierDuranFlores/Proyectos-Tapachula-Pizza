/* La siguiente secuencia de código fuente:
[PizzaStore.java] -> [NYPizzaStore.java] ->
[PizzaIngredientFactory.java] ->
[NYPizzaIngredientFactory.java] -> [Pizza.java] ->
[CheesePizza.java] - > [Cheese.java] ->
[ReggianoCheese.java] -> [main] */

///PizzaStore.java (Sin cambios en PizzaStore)

public abstract class PizzaStore {

	protected abstract Pizza createPizza(String item);

	public Pizza orderPizza(String type) {
	
		Pizza pizza = createPizza(type);
		System.out.println("--- Making a " + pizza.getName() + " ---");
		pizza.prepare();
		pizza.bake();	
		pizza.cut();
		pizza.box();
		
		return pizza;
	
	}
}
