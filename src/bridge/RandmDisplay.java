package bridge;

import java.util.Random;

public class RandmDisplay extends Display {

	public RandmDisplay(DisplayImpl impl){
		super(impl);
	}

	public void rndDisplay(int times){
		open();
		int rnd = new Random().nextInt(times);
		for(int i = 0; i<=rnd; i++){
			print();
		}
		close();
	}
}
