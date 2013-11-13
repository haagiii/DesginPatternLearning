package visitor;

import java.util.Iterator;

import composite.FileTreatmentException;

public abstract class Entry implements Element{
	public abstract String getName();
	public abstract int getSize();
	public Entry add(Element entry) throws FileTreatmentException{
		throw new FileTreatmentException();
	}
	public Iterator iterator() throws FileTreatmentException{
		throw new FileTreatmentException();
	}
	public String toString() {
		return getName() + " (" + getSize() + ") ";
	}
}
