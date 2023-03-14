package qa.netiq.pages;

import org.testng.Assert;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

import qa.netiq.base.BaseTest;

public class EncryptedAttributesPage extends BaseTest {
	
	//private Page page;
	public EncryptedAttributesPage(Page page) {
		this.page=page;
		page.click("button[title=\"Cancel\"]");
		page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Encrypted Attributes Create, Modify and Delete Encrypted Attribute Policies")).click();
		
	}
	public EncryptedAttributesPage encryptedAttributesPageTitle() throws InterruptedException {
		   Thread.sleep(2000);
		   String actualTitle= page.title();
		   Assert.assertEquals(actualTitle, "Identity Console");
		   return this;
		}
	
	public EncryptedAttributesPage encryptedAttributesPageUrl() {
		String actualUrl=page.url();
		Assert.assertEquals(actualUrl,"https://10.71.36.143:9000/identityconsole/#/encryptedattributes");
		return this;
	}
	
	public void headerAttributes() {
		String header=page.textContent("div[class=\"pageHeading wordWrap_heading\"] h2");
		System.out.println(header);
		Assert.assertEquals(header, "Encrypted Attributes");
	}

}



