package strategyPattern;

import strategyPattern.strategy.SuperEngineStrategy;

public class SportsVehicle extends Vehicle{
    public SportsVehicle(){
        super(new SuperEngineStrategy());
    }
}
