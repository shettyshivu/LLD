package decoratorPattern.pizza;

public class VeggiePizza implements BasePizza{
    private int veggiePizzaCost;
    
    public VeggiePizza(int veggiePizzaCost){
        this.veggiePizzaCost = veggiePizzaCost;
    }

    @Override
    public int cost(){
        return veggiePizzaCost;
    }
}