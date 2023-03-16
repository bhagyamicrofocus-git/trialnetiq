package qa.netiq.pages;

import org.testng.Assert;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

import qa.netiq.base.BaseTest;

public class EncryptedAttributesPage extends BaseTest {
	
	private String tile = "Encrypted Attributes Create, Modify and Delete Encrypted Attribute Policies";
	private String headerLoc= "div[class=\"pageHeading wordWrap_heading\"] h2";
	private String pageurl=HelperMethods.getPageUrl("#/encryptedattributes");
	private String expectedheader= "Encrypted Attributes";
	
	//private Page page;
	public EncryptedAttributesPage(Page page) {
		this.page=page;
		page.click(HelperMethods.homeLoc);
		page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(tile)).click();
		
	}
	public EncryptedAttributesPage encryptedAttributesPageTitle() throws InterruptedException {
		   String actualTitle= page.title();
		   Assert.assertEquals(actualTitle, titlename);
		   return this;
		}
	
	public EncryptedAttributesPage encryptedAttributesPageUrl() {
		String actualUrl=page.url();
		Assert.assertEquals(actualUrl,pageurl);
		return this;
	}
	
	public void headerAttributes() {
		String header=page.textContent(headerLoc);
		System.out.println(header);
		Assert.assertEquals(header, expectedheader);
	}

}



