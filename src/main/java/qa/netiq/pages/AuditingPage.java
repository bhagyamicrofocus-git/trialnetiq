package qa.netiq.pages;

import org.testng.Assert;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

import qa.netiq.base.BaseTest;

public class AuditingPage extends BaseTest {
	
	//private Page page;
	
	private String auditTile = "Auditing Create, Delete and Manage Audit";
	private String headerLoc= "div[class=\"titleSection\"] h2";
	private String pageurl=HelperMethods.getPageUrl("#/auditpage");
	private String expectedheader= "Audit Configuration";
	
	public AuditingPage(Page page) {
		this.page=page;
		page.click(HelperMethods.homeLoc);
		page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(auditTile)).click();
		page.waitForURL(pageurl);
		
	}
	public AuditingPage auditPageTitle() throws InterruptedException {
		   String actualTitle= page.title();
		   System.out.println(actualTitle);
		   Assert.assertEquals(actualTitle, titlename);
		   return this;
		}
	
	public AuditingPage auditPageUrl() {
		String actualUrl=page.url();
		System.out.println(actualUrl);
		Assert.assertEquals(actualUrl,pageurl);
		return this;
	}
	
	public void headeraudit() {
		String header=page.textContent(headerLoc);
		System.out.println(header);
		Assert.assertEquals(header, expectedheader);
	}

		
}
