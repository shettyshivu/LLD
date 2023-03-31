package strategyPattern;

import strategyPattern.strategy.SuperEngineStrategy;

public class OffRoadVehicle extends Vehicle{
    public OffRoadVehicle(){
        super(new SuperEngineStrategy());
    }
}
