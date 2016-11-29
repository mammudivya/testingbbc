package testingbbcpages;

import org.testng.Assert;
import org.testng.annotations.Test;

import bbcpages.BbcHomePage;

public class BbcHomePageTests extends BbcHomePage{
	@Test
	public void verifyBbcHomePage(){
		getBbcHomePage();
		Assert.assertEquals(getTitle(), title);
		getLinksList();
	}

}
