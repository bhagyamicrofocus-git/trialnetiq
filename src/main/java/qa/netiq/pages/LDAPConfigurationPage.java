package qa.netiq.pages;

import org.testng.Assert;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class LDAPConfigurationPage {
	private Page page;
	private String tile = "LDAP Configuration Create, Delete and Modify LDAP Servers and Groups";
	private String headerLoc= "div[class=\"col-md-12 col-lg-12\"] h2";
	private String pageurl=HelperMethods.getPageUrl("#/ldappage");
	private String expectedheader= "LDAP";


	public LDAPConfigurationPage(Page page) {
		this.page = page;
//		page.navigate("https://10.71.36.143:9000/identityconsole/#/");
		page.click(HelperMethods.homeLoc);
		page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(tile)).click();
	}

	public void lDAPConfigurationPage() {
		String header = page.textContent(headerLoc);
		System.out.println(header);
		HelperMethods.validation(header, expectedheader , "header not matched");
	}
	public LDAPConfigurationPage ldapConfigurationPageUrl() {
		page.waitForURL(pageurl);
		String actualUrl=page.url();
		System.out.println(actualUrl);
		Assert.assertEquals(actualUrl,pageurl);
		return this;
	}
}
