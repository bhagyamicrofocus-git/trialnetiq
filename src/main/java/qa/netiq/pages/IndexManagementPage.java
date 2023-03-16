package qa.netiq.pages;

import org.testng.Assert;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class IndexManagementPage {
	private Page page;
	private String tile = "Index Management Create, Modify and Change State of Index";
	private String headerLoc= "div[class=\"pageHeading\"] h2";
	private String pageurl=HelperMethods.getPageUrl("#/indexmanagement");
	private String expectedheader= "Index";

	public IndexManagementPage(Page page) {
		this.page = page;
		page.click(HelperMethods.homeLoc);
		page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(tile)).click();
	}

	public void indexManagementPage() {
		String header = page.textContent(headerLoc);
		System.out.println(header);
		HelperMethods.validation(header,expectedheader , "header not matched");
	}
	public IndexManagementPage indexManagementPageUrl() {
		page.waitForURL(pageurl);
		String actualUrl=page.url();
		System.out.println(actualUrl);
		Assert.assertEquals(actualUrl,pageurl);
		return this;
	}
}