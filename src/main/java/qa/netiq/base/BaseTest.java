package qa.netiq.base;

import java.util.Properties;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

import qa.netiq.factory.PlaywrightFactory;

public class BaseTest extends PlaywrightFactory {
//	PlaywrightFactory pf;
//	protected Page page;
//	protected HomePage homePage;
//	protected SchemaPage schemaPage;
	Properties prop;
	
	@BeforeSuite
	public void beforeClassSetUp() {
//		new PlaywrightFactory()
		launch();
		//page.navigate("https://10.71.36.143:9000/identityconsole/login.html#/");
		//page.locator("#Username_ID").type("cn=admin,o=novell");
		//page.locator("#Password_ID").type("novell");
		//page.locator("#Server").type("10.71.36.143");
		//page.locator("#loginButton").click();
		prop=init_prop();
		page.navigate(prop.getProperty("url"));
		page.locator("#Username_ID").type(prop.getProperty("username"));
		page.locator("#Password_ID").type(prop.getProperty("password"));
		page.locator("#Server").type(prop.getProperty("ipaddress"));
		page.locator("#loginButton").click();
	}


    @AfterSuite
    public void logout() throws InterruptedException {
    	Thread.sleep(2000);
		page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("admin (idconsole-tree) ")).click();
		Thread.sleep(1000);
		page.getByText("Sign out").click();
	}
}