/* La siguiente secuencia de código fuente:
[PizzaStore.java] -> [SimplePizzaFactory.java] ->
[Pizza.java] -> [CheesePizza.java] -> [main] */

///PizzaStore.java
   
public class PizzaStore {
    
    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {

        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

}
