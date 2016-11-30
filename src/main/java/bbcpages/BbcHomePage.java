package bbcpages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

import bbcdriver.Driver;

public class BbcHomePage extends Driver {
	String bbcurl = "http://www.bbc.co.uk/";
	protected String title = "BBC - Home";
	public String mainlinks = "div#orb-nav-links ul>li";
	public String cities = "ul.hp-dismissible-nations-links__nations>li";
    
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
	public int getOfficeLocationsList(){
		ArrayList<WebElement> offices = (ArrayList<WebElement>) driver.findElementsByCssSelector(cities);
		/*List<WebElement> offices = new ArrayList<WebElement>();
		offices = (List<WebElement>) driver.findElementByCssSelector(cities);*/
		Integer size = offices.size();
		String mystr = size.toString();
		for(WebElement element : offices){
			System.out.println("offices text value :"+element.getText());
		}
		return offices.size();
	}

}
