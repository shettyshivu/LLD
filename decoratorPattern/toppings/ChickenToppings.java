package decoratorPattern.toppings;

import decoratorPattern.pizza.BasePizza;

public class ChickenToppings implements ToppingsDecorator{
    int chickenToppingCost = 99;
    BasePizza pizza;

    public void setChickenToppingCost(int chickenToppingCost){
        this.chickenToppingCost = chickenToppingCost;
    }

    public ChickenToppings(BasePizza pizza){
        this.pizza = pizza;
    }

    @Override
    public int cost(){
        return pizza.cost() + chickenToppingCost;
    }
}