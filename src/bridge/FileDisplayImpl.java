package bridge;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileDisplayImpl extends DisplayImpl {

	private FileReader file;
	public FileDisplayImpl(String string) {
		try{
			this.file = new FileReader(string);
		}catch (Exception e) {
			System.err.println("error read file");
		}
	}

	private BufferedReader b;
	public void rawOpen(){
		b = new BufferedReader(file);
	}

	public void rawPrint(){
		String s;
		try{
			while((s = b.readLine()) != null){
				System.out.println(s);
			}
		}catch (Exception e) {
			System.err.println("error read file");
		}
	}
	public void rawClose(){
		try {
			file.close();
		} catch (Exception e) {
			System.err.println("error read file");
		}
	}

}
