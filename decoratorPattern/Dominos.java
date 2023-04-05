package decoratorPattern;

import decoratorPattern.pizza.*;
import decoratorPattern.toppings.*;

public class Dominos{
    public static void main(String[] args){
        BasePizza nonVegPizza = new ExtraCheese(new ChickenToppings(new BBQChickenPizza()));
        BasePizza vegPizza = new ExtraCheese(new VeggiePizza());
        System.out.println("Non-veg pizza cost "+ nonVegPizza.cost());
        System.out.println("Veg pizza cost "+ vegPizza.cost());
    }
}