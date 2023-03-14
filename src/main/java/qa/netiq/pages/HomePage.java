package qa.netiq.pages;

import org.testng.Assert;

import com.microsoft.playwright.Page;

import qa.netiq.base.BaseTest;
public  class HomePage extends BaseTest {
	 //private Page page;

	//constructor
	public HomePage(Page page)
	{
	  	this.page=page;
	}
	
	//actions
	public HomePage homePageTitle() {
	   String actualTitle= page.title();
	   Assert.assertEquals(actualTitle, "Identity Console");
	   return this;
	}
	
	public HomePage homePageUrl() {
		String actualUrl=page.url();
		Assert.assertEquals(actualUrl,"https://10.71.36.143:9000/identityconsole/");
		return this;
	}
	
	public void headerHome() {
		String header=page.textContent("div[class=\"ias-tile-group\"] span");
		System.out.println(header);
		Assert.assertEquals(header,"eDirectory");
	}
	
}

