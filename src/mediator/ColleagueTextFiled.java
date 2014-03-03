package mediator;

import java.awt.Color;
import java.awt.TextField;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class ColleagueTextFiled extends TextField implements Colleague,
	TextListener {

    private Mediator mediator;

    public ColleagueTextFiled(String text, int colums) {
	super(text, colums);
    }

    @Override
    public void textValueChanged(TextEvent arg0) {
	mediator.colleagueChanged();
    }

    @Override
    public void setMediator(Mediator mediator) {
	this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
	setEnabled(enabled);
	setBackground(enabled ? Color.white : Color.lightGray);
    }
}
