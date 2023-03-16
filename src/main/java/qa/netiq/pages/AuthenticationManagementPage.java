package qa.netiq.pages;

import org.testng.Assert;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class AuthenticationManagementPage {
	private Page page;
	private String tile = "Authentication Management Manage Passwords and Authentication";
	private String headerLoc= "div[class=\"titleSection\"] h2";
	private String pageurl=HelperMethods.getPageUrl("#/authenticationManagement");
	private String expectedheader= "Authentication Management";

	public AuthenticationManagementPage(Page page) {
		this.page = page;
		page.click(HelperMethods.homeLoc);
		page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(tile)).click();
	}

	public void authenticationManagementPage() {
		String header = page.textContent(headerLoc);
		System.out.println(header);
		HelperMethods.validation(header, expectedheader, "header not matched");
	}
	public AuthenticationManagementPage authenticationManagementPageUrl() {
		page.waitForURL(pageurl);
		String actualUrl=page.url();
		System.out.println(actualUrl);
		Assert.assertEquals(actualUrl,pageurl);
		return this;
	}
}