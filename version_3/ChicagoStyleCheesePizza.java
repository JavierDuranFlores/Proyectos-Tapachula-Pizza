//ChicagoStyleCheesePizza.java
public class ChicagoStyleCheesePizza extends Pizza {

	PizzaIngredientFactory ingredientFactory;
    /*public ChicagoStyleCheesePizza() {
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
