package decoratorPattern.pizza;

public class VeggiePizza implements BasePizza{
    private int veggiePizzaCost = 299;
    
    public void setVeggiePizzaCost(int veggiePizzaCost){
        this.veggiePizzaCost = veggiePizzaCost;
    }

    @Override
    public int cost(){
        return veggiePizzaCost;
    }
}