//ChicagoStyleClamPizza.java
public class ChicagoStyleClamPizza extends Pizza {

	PizzaIngredientFactory ingredientFactory;
    /*public ChicagoStyleClamPizza() {
        name = "NY Style Sauce and Clam Pizza";
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
