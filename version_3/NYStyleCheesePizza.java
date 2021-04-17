///NYStyleCheesePizza.java
public class NYStyleCheesePizza extends Pizza {

	PizzaIngredientFactory ingredientFactory;
    /*public NYStyleCheesePizza() {
        
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

	}*/

	void prepare() {
		System.out.println("Preparing " + name);

		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
	}
}
