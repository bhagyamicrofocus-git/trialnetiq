package qa.netiq.pages;

import org.testng.Assert;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class AuthenticationManagementPage {
	private Page page;

	public AuthenticationManagementPage(Page page) {
		this.page = page;
//		page.navigate("https://10.71.36.143:9000/identityconsole/#/");
		page.click("button[title=\"Cancel\"]");
		page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Authentication Management Manage Passwords and Authentication")).click();
	}

	public void authenticationManagementPage() {
		String header = page.textContent("div[class=\"titleSection\"] h2");
		System.out.println(header);
		HelperMethods.validation(header, "Authentication Management", "header not matched");
	}
	public AuthenticationManagementPage authenticationManagementPageUrl() {
		page.waitForURL("https://10.71.36.143:9000/identityconsole/#/authenticationManagement");
		String actualUrl=page.url();
		System.out.println(actualUrl);
		Assert.assertEquals(actualUrl,"https://10.71.36.143:9000/identityconsole/#/authenticationManagement");
		return this;
	}
}