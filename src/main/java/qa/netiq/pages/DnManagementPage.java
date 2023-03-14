package qa.netiq.pages;

import org.testng.Assert;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

import qa.netiq.base.BaseTest;

public class DnManagementPage extends BaseTest {
	
	//private Page page;
	public DnManagementPage(Page page) {
		this.page=page;
		page.click("button[title=\"Cancel\"]");
		page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("DN Management Move, Rename and Copy of Objects")).click();
		
	}
	public DnManagementPage dnManagementPageTitle() throws InterruptedException {
		Thread.sleep(2000);
		   String actualTitle= page.title();
		   Assert.assertEquals(actualTitle, "Identity Console");
		   return this;
		}
	
	public DnManagementPage dnManagementPageUrl() {
		String actualUrl=page.url();
		Assert.assertEquals(actualUrl,"https://10.71.36.143:9000/identityconsole/#/dnmanagement");
		return this;
	}
	
	public void headerDn() {
		String header=page.textContent("div[class=\"moduleTitle wordWrap\"] h2");
		System.out.println(header);
		Assert.assertEquals(header, "DN Management");
	}
}




