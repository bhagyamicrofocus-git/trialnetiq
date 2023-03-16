package qa.netiq.pages;

import org.testng.Assert;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

import qa.netiq.base.BaseTest;

public class PartitionManagementPage extends BaseTest{
	
	private String tile = "Partition Management Create, Merge and Manage Partitions";
	private String headerLoc= "div[class=\"floatLeft wordWrap_heading\"] h2";
	private String pageurl=HelperMethods.getPageUrl("#/partitionpage");
	private String expectedheader= "Partitions";
	
	public PartitionManagementPage(Page page) {
		this.page=page;
		page.click(HelperMethods.homeLoc);
		page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(tile)).click();
	}
	
	public PartitionManagementPage partitionManagementPageTitle() throws InterruptedException {
		   String actualTitle= page.title();
		   Assert.assertEquals(actualTitle, titlename);
		   return this;
		}
	
	public PartitionManagementPage partitionManagementPageUrl() {
		String actualUrl=page.url();
		Assert.assertEquals(actualUrl,pageurl);
		return this;
	}

	public void headerPartition() {
		String header=page.textContent(headerLoc);
		System.out.println(header);
		Assert.assertEquals(header, expectedheader);
	}
}


