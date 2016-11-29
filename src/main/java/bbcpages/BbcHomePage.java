package bbcpages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

import bbcdriver.Driver;

public class BbcHomePage extends Driver {
	String bbcurl = "http://www.bbc.co.uk/";
	protected String title = "BBC - Home";
	public String mainlinks = "div#orb-nav-links ul>li";
    
	public BbcHomePage getBbcHomePage(){
		driver.get(bbcurl);
		return new BbcHomePage();
	}
	public String getTitle(){
		return driver.getTitle();
	}
	public int getLinksList(){
		List<WebElement> links = new ArrayList<WebElement>();
		links = driver.findElementsByCssSelector(mainlinks);
		Integer size = links.size();
		String mystr = size.toString();
		for(WebElement element: links){
			System.out.println("link text value :"+element.getText());
		}	
		return links.size();
		
	}

}
