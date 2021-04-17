///NYStylePepperoniPizza.java
public class NYStylePepperoniPizza extends Pizza {

	PizzaIngredientFactory ingredientFactory;
   /* public NYStylePepperoniPizza() {
        name = "NY Style Sauce and Pepperoni Pizza";
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
