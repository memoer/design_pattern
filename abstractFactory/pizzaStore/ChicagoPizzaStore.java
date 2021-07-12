package pizzaStore;

import pizza.CheesePizza;
import pizza.ClamPizza;
import pizza.Pizza;
import pizza.PizzaType;
import pizza.VeggiePizza;
import pizzaIngredient.ChicagoIngredientFactory;

public class ChicagoPizzaStore extends PizzaStore {
  public ChicagoPizzaStore() {
    this.pizzaIngrdientFactory = new ChicagoIngredientFactory();
  }

  @Override
  protected Pizza createPizza(PizzaType pizzaType) {
    switch (pizzaType) {
      case CHEESE:
        return new CheesePizza(pizzaIngrdientFactory);
      case VEGGIE:
        return new VeggiePizza(pizzaIngrdientFactory);
      case CLAM:
        return new ClamPizza(pizzaIngrdientFactory);
      default:
        throw new Error(pizzaType.name() + "is None of Pizza Type");
    }
  }
}