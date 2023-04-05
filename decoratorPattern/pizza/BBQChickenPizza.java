package decoratorPattern.pizza;

public class BBQChickenPizza implements BasePizza{
    private int BBQChickenPizzaCost = 399;

    public void setBBQChickenPizzaCost(int BBQChickenPizzaCost){
        this.BBQChickenPizzaCost = BBQChickenPizzaCost;
    }

    @Override
    public int cost(){
        return BBQChickenPizzaCost;
    }
}