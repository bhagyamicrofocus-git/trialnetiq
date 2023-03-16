package qa.netiq.pages;

import org.testng.Assert;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class SNMPPage {
	private Page page;
	private String tile = "SNMP Create, Delete and Modify SNMP Groups";
	private String headerLoc= "div[class=\"titleSection\"] h2";
	private String pageurl=HelperMethods.getPageUrl("#/snmp");
	private String expectedheader= "SNMP Groups";

	public SNMPPage(Page page) {
		this.page = page;
		page.click(HelperMethods.homeLoc);
		page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(tile)).click();
	}

	public SNMPPage snmpPageUrl() {
		page.waitForURL(pageurl);
		String actualUrl=page.url();
		System.out.println(actualUrl);
		Assert.assertEquals(actualUrl,pageurl);
		return this;
		
	}
	public void sNMPPage() {
		String header = page.textContent(headerLoc);
		System.out.println(header);
		HelperMethods.validation(header,expectedheader , "header not matched");
	}
}