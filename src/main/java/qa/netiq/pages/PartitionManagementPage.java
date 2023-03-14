package qa.netiq.pages;

import org.testng.Assert;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

import qa.netiq.base.BaseTest;

public class PartitionManagementPage extends BaseTest{
	
	//private Page page;
	
	public PartitionManagementPage(Page page) {
		this.page=page;
		page.click("button[title=\"Cancel\"]");
		page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Partition Management Create, Merge and Manage Partitions")).click();
	}
	
	public PartitionManagementPage partitionManagementPageTitle() throws InterruptedException {
		Thread.sleep(2000);
		   String actualTitle= page.title();
		   Assert.assertEquals(actualTitle, "Identity Console");
		   return this;
		}
	
	public PartitionManagementPage partitionManagementPageUrl() {
		String actualUrl=page.url();
		Assert.assertEquals(actualUrl,"https://10.71.36.143:9000/identityconsole/#/partitionpage");
		return this;
	}

	public void headerPartition() {
		String header=page.textContent("div[class=\"floatLeft wordWrap_heading\"] h2");
		System.out.println(header);
		Assert.assertEquals(header, "Partitions");
	}
}


