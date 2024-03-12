package Factory_04;

public class NYPizzaStore extends PizzaStore {

  public Pizza createPizza(String item) {
    if (item.equals("cheese")) {
      return new NYStyleCheesePizza();
    } else {
      return null;
    }
  }
}
