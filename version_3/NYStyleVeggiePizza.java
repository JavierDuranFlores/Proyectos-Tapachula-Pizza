///NYStylePepperoniPizza.java
public class NYStyleVeggiePizza extends Pizza {

	PizzaIngredientFactory ingredientFactory;
    /*public NYStyleVeggiePizza() {
        name = "NY Style Sauce and Veggie Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";


    }   */
    
    void prepare() {
		System.out.println("Preparing " + name);

		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
	}

}

