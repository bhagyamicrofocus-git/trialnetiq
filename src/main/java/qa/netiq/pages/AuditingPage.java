package qa.netiq.pages;

import org.testng.Assert;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

import qa.netiq.base.BaseTest;

public class AuditingPage extends BaseTest {
	//private Page page;
	public AuditingPage(Page page) {
		this.page=page;
		page.click("button[title=\"Cancel\"]");
		page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Auditing Create, Delete and Manage Audit")).click();
		page.waitForURL("https://10.71.36.143:9000/identityconsole/#/auditpage");
		
	}
	public AuditingPage auditPageTitle() throws InterruptedException {
		   Thread.sleep(2000);
		   String actualTitle= page.title();
		   System.out.println(actualTitle);
		   Assert.assertEquals(actualTitle, "Identity Console");
		   return this;
		}
	
	public AuditingPage auditPageUrl() {
		String actualUrl=page.url();
		System.out.println(actualUrl);
		Assert.assertEquals(actualUrl,"https://10.71.36.143:9000/identityconsole/#/auditpage");
		return this;
	}
	
	public void headeraudit() {
		String header=page.textContent("div[class=\"titleSection\"] h2");
		System.out.println(header);
		Assert.assertEquals(header, "Audit Configuration");
	}

		
}
