package abstractFactory;

import abstractFactory.factory.Factory;
import abstractFactory.factory.Link;
import abstractFactory.factory.Page;
import abstractFactory.factory.Tray;

public class Main{
	public static void main(String[] args){
		if(args.length != 1){
			System.out.println("Usage: java Main class.name.of.ConcreteFactory");
			System.out.println("Exampole 1: java Main listfctory.ListFactory");
			System.out.println("Exampole 2: java Main tablefctory.TableFactory");
			System.exit(0);
		}
		Factory factory = Factory.getFactory(args[0]);
		
		Link asahi = factory.createLink("Asahi News", "http://www.asahi.com/");
		Link yomiuri = factory.createLink("Yomiuri News", "http://www.yomiuri.co.jp/");
		Link us_yahoo = factory.createLink("Yahoo!", "http://www.yahoo.com/");
		Link jp_yahoo = factory.createLink("Yahoo!Japan", "http://www.yahoo.co.jp/");
		Link excite = factory.createLink("Excite", "http://www.excite.com/");
		Link google = factory.createLink("Google", "http://www.google.com/");
		
		Tray traynews=factory.createTray("News Paper");
		traynews.add(asahi);
		traynews.add(yomiuri);
		
		Tray trayyahoo = factory.createTray("Yahoo!");
		trayyahoo.add(us_yahoo);
		trayyahoo.add(jp_yahoo);
		
		Tray traysearch = factory.createTray("Search Engine");
		traysearch.add(trayyahoo);
		traysearch.add(excite);
		traysearch.add(google);
		
		Page page = factory.createPage("LinkPage", "haagiii");
		page.add(traynews);
		page.add(traysearch);
		page.output();
	}
}
