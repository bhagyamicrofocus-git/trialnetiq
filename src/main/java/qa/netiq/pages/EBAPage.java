package qa.netiq.pages;

import org.testng.Assert;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class EBAPage {
	private Page page;
	private String tile = "EBA Manage Enhanced Background Authentication";
	private String headerLoc= "div[class=\"titleSection\"] h2";
	private String pageurl=HelperMethods.getPageUrl("#/eba");
	private String expectedheader= "EBA CA Management ";

	public EBAPage(Page page) {
		this.page = page;
		page.click(HelperMethods.homeLoc);
		page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(tile)).click();
	}

	public void eBAPage() {
		String header = page.textContent(headerLoc);
		System.out.println(header);
		HelperMethods.validation(header, expectedheader , "header not matched");
	}
	
	public EBAPage ebaPageUrl() {
		page.waitForURL(pageurl);
		String actualUrl=page.url();
		System.out.println(actualUrl);
		Assert.assertEquals(actualUrl,pageurl);
		return this;
	}
}