package missionToMoon;

import java.util.Random;

public class R2 extends Rocket {

	R2() {
        setCost(120);
        setWeight(18000);
        setCurrentWeight(18000);
        setMaxWeight(29000);
    }
	
	@Override
	 public boolean launch() {
        Random r = new Random();
        double randomValue = r.nextDouble();
        int factor = (int) (0.04 * (getWeight()) / getWeight());
        return (factor >= randomValue);
    }
	
	@Override
    public boolean land() {
        Random r = new Random();
        double randomValue = r.nextDouble();
        int factor = (int) (0.08 * (getWeight()) /  getWeight());
        return (factor >= randomValue);
    }

}
