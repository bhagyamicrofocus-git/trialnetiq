package qa.netiq.pages;

import org.testng.Assert;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

import qa.netiq.base.BaseTest;

public class EncryptedReplication extends BaseTest {
	
	private String tile = "Encrypted Replication Enable or Disable Encrypted Replication";
	private String headerLoc= "div[class=\"pageHeading\"] h2";
	private String pageurl=HelperMethods.getPageUrl("#/encryptedreplication");
	private String expectedheader= "Encrypted Replication";
	
	//private Page page;
	public EncryptedReplication(Page page) {
		this.page=page;
		page.click(HelperMethods.homeLoc);
		page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(tile)).click();
		page.waitForURL(pageurl);
		
	}
	public EncryptedReplication encryptedReplicationPageTitle() throws InterruptedException {
		   String actualTitle= page.title();
		   Assert.assertEquals(actualTitle,titlename);
		   return this;
		}
	
	public EncryptedReplication encryptedReplicationPageUrl() {
		String actualUrl=page.url();
		Assert.assertEquals(actualUrl,pageurl);
		return this;
	}
	
	public void headerReplication() {
		String header=page.textContent(headerLoc);
		System.out.println(header);
		Assert.assertEquals(header, expectedheader);
	}
}



