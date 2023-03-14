package qa.netiq.pages;

import org.testng.Assert;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import qa.netiq.base.BaseTest;

public class SchemaPage extends BaseTest{
	//private Page page;
	
	//constructor
	public SchemaPage(Page page) throws InterruptedException
	{
		this.page=page;
	  	page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Schema Management Create, Delete classes and attributes and extend objects")).click();
	  	page.waitForURL("https://10.71.36.143:9000/identityconsole/#/schemamanagement");
	}
	
	//actions
	public SchemaPage schemaPageTitle() throws InterruptedException {
		Thread.sleep(2000);
		String actualTitle= page.title();
		Assert.assertEquals(actualTitle, "Identity Console");
		return this;
		
	}
	
	public SchemaPage schemaPageUrl() {
		page.waitForURL("https://10.71.36.143:9000/identityconsole/#/schemamanagement");
		String actualUrl=page.url();
		System.out.println(actualUrl);
		Assert.assertEquals(actualUrl,"https://10.71.36.143:9000/identityconsole/#/schemamanagement");
		return this;
	}
	
	public void headerschema() {
		String header=page.textContent("div[class=\"modulelTitle wordWrap\"] h2");
		System.out.println(header);
		Assert.assertEquals(header, "Schema Management");
	}

}
