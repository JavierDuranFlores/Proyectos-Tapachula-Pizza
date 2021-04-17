//ChicagoStyleVeggiePizza.java
public class ChicagoStyleVeggiePizza extends Pizza {

PizzaIngredientFactory ingredientFactory;
    /*public ChicagoStyleVeggiePizza() {
        name = "NY Style Sauce and Veggie Pizza";
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
