package missionToMoon;

import java.util.Random;

public class R1 extends Rocket{
  
	R1() {
        setCost(100);
        setWeight(10000);
        setCurrentWeight(10000);
        setMaxWeight(18000);
    }
	
	@Override
	 public boolean launch() {
        Random r = new Random();
        double randomValue = r.nextDouble();
        int factor = (int) (0.05 * ( getWeight()) / (getMaxWeight()));
        return (factor >= randomValue);
    }
	
	@Override
    public boolean land() {
        Random r = new Random();
        double randomValue = r.nextDouble();
        int factor = (int) (0.01 * (getWeight()) / (getMaxWeight()));
        return (factor >= randomValue);
    }

}
