package qa.netiq.pages;

import org.testng.Assert;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

import qa.netiq.base.BaseTest;

public class EncryptedReplication extends BaseTest {
	
	//private Page page;
	public EncryptedReplication(Page page) {
		this.page=page;
		page.click("button[title=\"Cancel\"]");
		page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Encrypted Replication Enable or Disable Encrypted Replication")).click();
		
	}
	public EncryptedReplication encryptedReplicationPageTitle() throws InterruptedException {
		Thread.sleep(2000);
		   String actualTitle= page.title();
		   Assert.assertEquals(actualTitle, "Identity Console");
		   return this;
		}
	
	public EncryptedReplication encryptedReplicationPageUrl() {
		String actualUrl=page.url();
		Assert.assertEquals(actualUrl,"https://10.71.36.143:9000/identityconsole/#/encryptedreplication");
		return this;
	}
	
	public void headerReplication() {
		String header=page.textContent("div[class=\"pageHeading\"] h2");
		System.out.println(header);
		Assert.assertEquals(header, "Encrypted Replication");
	}
}



