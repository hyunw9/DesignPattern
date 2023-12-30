package Factory_04;

public class ChicagoPizzaStore extends PizzaStore{

  public Pizza createPizza(String item){

    if(item.equals("cheese")){
      return new ChicagoStyleCheesePizza();
    }else{
      return null;
    }
  }
}
