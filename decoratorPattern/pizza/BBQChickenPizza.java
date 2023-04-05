package decoratorPattern.pizza;

public class BBQChickenPizza implements BasePizza{
    private int BBQChickenPizzaCost;
    
    public BBQChickenPizza(int BBQChickenPizzaCost){
        this.BBQChickenPizzaCost = BBQChickenPizzaCost;
    }

    @Override
    public int cost(){
        return BBQChickenPizzaCost;
    }
}