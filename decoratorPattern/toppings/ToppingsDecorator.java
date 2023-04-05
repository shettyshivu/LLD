package decoratorPattern.toppings;

import decoratorPattern.pizza.BasePizza;

public interface ToppingsDecorator extends BasePizza{
    public int cost();
}