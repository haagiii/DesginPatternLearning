package facede.pagemeker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class PageMaker {
    private PageMaker() {
    }

    public static void makeWelcomPage(String mailAddr, String fileName) {
	try {
	    Properties mailProp = Database.getPropertis("D:\\Users\\kouji\\Documents\\GitHub\\DesginPatternLearning\\src\\facede\\maildata");
	    String userName = mailProp.getProperty(mailAddr);
	    
	    HtmlWriter writer = new HtmlWriter(new FileWriter(fileName));
	    writer.title("Welcome to " + userName + "'s page!");
	    writer.paragraph(userName + "のページへようこそ");
	    writer.paragraph("メール待ってますね");
	    writer.mailto(mailAddr, userName);
	    writer.close();
	    System.out.println(fileName + " is created for " + mailAddr + " ("
		    + userName + ")");

	} catch (IOException e) {
	    e.printStackTrace();
	}
    }
    
    public static void makeLinkPage(String fileName) {
	try {
	    Properties mailProp = Database.getPropertis("D:\\Users\\kouji\\Documents\\GitHub\\DesginPatternLearning\\src\\facede\\maildata");
	    HtmlWriter writer = new HtmlWriter(new FileWriter(fileName));
	    Enumeration en = mailProp.propertyNames();
	    
	    writer.title("Link Page");
	    
	    while (en.hasMoreElements()) {
		String mailAddr = (String)en.nextElement();
		String userName = mailProp.getProperty(mailAddr);
		writer.mailto(mailAddr, userName);
	    }
	    
	    writer.close();
	    System.out.println(fileName + " is created.");

	} catch (IOException e) {
	    e.printStackTrace();
	}
    }

}
