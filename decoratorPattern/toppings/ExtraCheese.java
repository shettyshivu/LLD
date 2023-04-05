package decoratorPattern.toppings;

import decoratorPattern.pizza.BasePizza;

public class ExtraCheese implements ToppingsDecorator{
    int extraCheeseToppingCost = 49;
    BasePizza pizza;

    public void setExtraCheeseToppingCost(int extraCheeseToppingCost){
        this.extraCheeseToppingCost = extraCheeseToppingCost;
    }

    public ExtraCheese(BasePizza pizza){
        this.pizza = pizza;
    }

    @Override
    public int cost(){
        return pizza.cost() + extraCheeseToppingCost;
    }
}