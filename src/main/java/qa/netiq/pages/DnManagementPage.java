package qa.netiq.pages;

import org.testng.Assert;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

import qa.netiq.base.BaseTest;

public class DnManagementPage extends BaseTest {
	
	private String tile = "DN Management Move, Rename and Copy of Objects";
	private String headerLoc= "div[class=\"moduleTitle wordWrap\"] h2";
	private String pageurl=HelperMethods.getPageUrl("#/dnmanagement");
	private String expectedheader= "DN Management";
	public DnManagementPage(Page page) {
		this.page=page;
		page.click(HelperMethods.homeLoc);
		page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(tile)).click();
		
	}
	public DnManagementPage dnManagementPageTitle() throws InterruptedException {
		   String actualTitle= page.title();
		   Assert.assertEquals(actualTitle, titlename);
		   return this;
		}
	
	public DnManagementPage dnManagementPageUrl() {
		String actualUrl=page.url();
		Assert.assertEquals(actualUrl,pageurl);
		return this;
	}
	
	public void headerDn() {
		String header=page.textContent(headerLoc);
		System.out.println(header);
		Assert.assertEquals(header, expectedheader);
	}
}




