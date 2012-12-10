package strategy;

import template.AbstarctDisplay;

public interface Strategy {
	public abstract Hand nextHand();
	public abstract void study(boolean win);

}
