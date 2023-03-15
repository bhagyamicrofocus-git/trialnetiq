package qa.netiq.pages;

import org.testng.Assert;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class EBAPage {
	private Page page;

	public EBAPage(Page page) {
		this.page = page;
//		page.navigate("https://10.71.36.143:9000/identityconsole/#/");
		page.click("button[title=\"Cancel\"]");
		page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("EBA Manage Enhanced Background Authentication")).click();
	}

	public void eBAPage() {
		String header = page.textContent("div[class=\"titleSection\"] h2");
		System.out.println(header);
		HelperMethods.validation(header, "EBA CA Management ", "header not matched");
	}
	
	public EBAPage ebaPageUrl() {
		page.waitForURL("https://10.71.36.143:9000/identityconsole/#/eba");
		String actualUrl=page.url();
		System.out.println(actualUrl);
		Assert.assertEquals(actualUrl,"https://10.71.36.143:9000/identityconsole/#/eba");
		return this;
	}
}