package strategyPattern;

import strategyPattern.strategy.NormalEngineStrategy;

public class NormalVehicle extends Vehicle{
    public NormalVehicle(){
        super(new NormalEngineStrategy());
    }
}
