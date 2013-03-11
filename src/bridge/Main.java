package bridge;

public class Main {
	public static void main(String[] args){
		Display d1 = new Display(new StringDisplayImpl("Hello Japan."));
		Display d2 = new CountDisplay(new StringDisplayImpl("Hello World."));
		CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hellow Universe."));
		
		RandmDisplay d4 = new RandmDisplay(new StringDisplayImpl("hello kouji"));

		IncreaseDisplay d5 = new IncreaseDisplay(new CharDisplayImpl('<', '*', '>'), 2);
		
		d1.display();
		d2.display();
		d3.display();
		d3.multiDisplay(5);
		d4.rndDisplay(5);
		
		d5.increaseDisplay(5);

	}

}
