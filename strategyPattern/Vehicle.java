package strategyPattern;

import strategyPattern.strategy.EngineStrategy;

public class Vehicle {
    EngineStrategy engine;
    
    public Vehicle(EngineStrategy engine){
        this.engine = engine;
    }

    public void start(){
        engine.start();
    }
}
