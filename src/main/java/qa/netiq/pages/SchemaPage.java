package qa.netiq.pages;

import org.testng.Assert;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import qa.netiq.base.BaseTest;

public class SchemaPage extends BaseTest{
	//private Page page;
	private String schemaTile = "Schema Management Create, Delete classes and attributes and extend objects";
	private String headerLoc= "div[class=\"modulelTitle wordWrap\"] h2";
	private String pageurl=HelperMethods.getPageUrl("#/schemamanagement");
	private String expectedheader= "Schema Management";
	
	
	//constructor
	public SchemaPage(Page page) throws InterruptedException
	{
		this.page=page;
		page.click(HelperMethods.homeLoc);
	  	page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(schemaTile)).click();
	  	page.waitForURL(pageurl);
	}
	
	//actions
	public SchemaPage schemaPageTitle() throws InterruptedException {
		String actualTitle= page.title();
		Assert.assertEquals(actualTitle, titlename); 
		return this;
		
	}
	
	public SchemaPage schemaPageUrl() {
		String actualUrl=page.url();
		System.out.println(actualUrl);
		Assert.assertEquals(actualUrl,pageurl);
		return this;
	}
	
	public void headerschema() {
		String header=page.textContent(headerLoc);
		System.out.println(header);
		Assert.assertEquals(header, expectedheader );
	}

}
