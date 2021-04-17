/* La siguiente secuencia de código fuente:
[PizzaStore.java] -> [NYPizzaStore.java] ->
[Pizza.java] -> [CheesePizza.java] -> [main] */

///PizzaStore.java

public abstract class PizzaStore {

    abstract Pizza createPizza(String item);

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
