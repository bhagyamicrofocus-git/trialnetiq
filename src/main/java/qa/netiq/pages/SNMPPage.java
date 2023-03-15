package qa.netiq.pages;

import org.testng.Assert;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class SNMPPage {
	private Page page;

	public SNMPPage(Page page) {
		this.page = page;
//		page.navigate("https://10.71.36.143:9000/identityconsole/#/");
		page.click("button[title=\"Cancel\"]");
		page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("SNMP Create, Delete and Modify SNMP Groups")).click();
	}

	public SNMPPage snmpPageUrl() {
		page.waitForURL("https://10.71.36.143:9000/identityconsole/#/snmp");
		String actualUrl=page.url();
		System.out.println(actualUrl);
		Assert.assertEquals(actualUrl,"https://10.71.36.143:9000/identityconsole/#/snmp");
		return this;
		
	}
	public void sNMPPage() {
		String header = page.textContent("div[class=\"titleSection\"] h2");
		System.out.println(header);
//		System.out.println(page.url());
		HelperMethods.validation(header, "SNMP Groups", "header not matched");
	}
}