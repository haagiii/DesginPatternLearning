package facede.pagemeker;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Database {
    private Database() {
    }

    public static Properties getPropertis(String dbName) {
	String fileName = dbName + ".txt";
	Properties prop = new Properties();

	try {
	    prop.load(new FileInputStream(fileName));
	} catch (IOException e) {
	    System.out.println("Warning: " + fileName + " is not found.");
	}

	return prop;

    }
}
