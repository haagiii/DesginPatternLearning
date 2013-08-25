package composite;

import java.util.Iterator;
import java.util.ArrayList;

public class Directory extends Entry {
	private String name;
	private ArrayList<Entry> directory = new ArrayList<Entry>();

	public Directory(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public int getSize() {
		int size = 0;
		Iterator<Entry> it = this.directory.iterator();

		while (it.hasNext()) {
			Entry entry = it.next();
			size += entry.getSize();
		}

		return size;
	}

	public Entry add(Entry entry) {
		this.directory.add(entry);
		return this;
	}

	@Override
	protected void printList(String prefix) {
		System.out.println(prefix + "/" + this);
		Iterator<Entry> it = this.directory.iterator();

		while (it.hasNext()) {
			Entry entry = it.next();
			entry.printList(prefix + "/" + name);
		}
	}
}
