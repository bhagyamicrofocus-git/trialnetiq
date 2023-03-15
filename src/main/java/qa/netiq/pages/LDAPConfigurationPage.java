package qa.netiq.pages;

import org.testng.Assert;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class LDAPConfigurationPage {
	private Page page;

	public LDAPConfigurationPage(Page page) {
		this.page = page;
//		page.navigate("https://10.71.36.143:9000/identityconsole/#/");
		page.click("button[title=\"Cancel\"]");
		page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("LDAP Configuration Create, Delete and Modify LDAP Servers and Groups")).click();
	}

	public void lDAPConfigurationPage() {
		String header = page.textContent("div[class=\"col-md-12 col-lg-12\"] h2");
		System.out.println(header);
		HelperMethods.validation(header, "LDAP", "header not matched");
	}
	public LDAPConfigurationPage ldapConfigurationPageUrl() {
		page.waitForURL("https://10.71.36.143:9000/identityconsole/#/ldappage");
		String actualUrl=page.url();
		System.out.println(actualUrl);
		Assert.assertEquals(actualUrl,"https://10.71.36.143:9000/identityconsole/#/ldappage");
		return this;
	}
}
