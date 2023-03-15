package qa.netiq.pages;

import org.testng.Assert;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class IndexManagementPage {
	private Page page;

	public IndexManagementPage(Page page) {
		this.page = page;
//		page.navigate("https://10.71.36.143:9000/identityconsole/#/");
		page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Index Management Create, Modify and Change State of Index")).click();
	}

	public void indexManagementPage() {
		String header = page.textContent("div[class=\"pageHeading\"] h2");
		System.out.println(header);
//		System.out.println(page.title());
		HelperMethods.validation(header, "Index", "header not matched");
	}
	public IndexManagementPage indexManagementPageUrl() {
		page.waitForURL("https://10.71.36.143:9000/identityconsole/#/indexmanagement");
		String actualUrl=page.url();
		System.out.println(actualUrl);
		Assert.assertEquals(actualUrl,"https://10.71.36.143:9000/identityconsole/#/indexmanagement");
		return this;
	}
}