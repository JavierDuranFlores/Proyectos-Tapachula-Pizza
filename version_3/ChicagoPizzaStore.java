///ChicagoPizzaStore.java

public class ChicagoPizzaStore extends PizzaStore {

	protected Pizza createPizza(String item) {

		Pizza pizza = null;

		/* Pizzerías en diferentes regiones
		compran en la fábrica de materias primas e instalan la
		fábrica de materias primas de Nueva York */

		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

 		if (item.equals("cheese")) {

			pizza = new CheesePizza(ingredientFactory);
 			pizza.setName("New York Style Cheese Pizza");

 		} else if (item.equals("veggie")) {

 			pizza = new VeggiePizza(ingredientFactory);
 			pizza.setName("New York Style Veggie Pizza");

 		} else if (item.equals("clam")) {

			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("New York Style Clam Pizza");

		} else if (item.equals("pepperoni")) {

			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("New York Style Pepperoni Pizza");
	
		}

			return pizza;

		}

}
