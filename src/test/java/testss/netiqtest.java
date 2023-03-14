package testss;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

import playwrightbasic.playwrightbasic.App;

public class netiqtest extends App {
	@BeforeClass
	public void beforeClassSetUp() {
		launch();
		login();
}

	@Test(priority = 1)
	public void dashboard() {
		urlVerify(page.url(), "https://10.71.36.143:9000/identityconsole/", "url not matched");
		nameVerify(page.title(), "Identity Console", "name mismatched");
		page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Schema Management Create, Delete classes and attributes and extend objects")).click();
		}
	@Test(priority = 2)
	public void schemaManagement() {
			page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Schema Management Create, Delete classes and attributes and extend objects")).click();
		}
	
	@Test(priority = 3)
	public void exit1() {
		page.click("button[title=\"Cancel\"]");
		//page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("")).click();
		
	}

	@Test(priority = 4)
	public void auditing() {
		page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Auditing Create, Delete and Manage Audit")).click();
		}
	
	@Test(priority = 5)
	public void exit2() {
		page.click("button[title=\"Cancel\"]");
		}
	@Test(priority = 6)
	public void encryptedAtrributes(){
		page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Encrypted Attributes Create, Modify and Delete Encrypted Attribute Policies")).click();
			}
	@Test(priority = 7)
	public void exit3(){
		page.click("button[title=\"Cancel\"]");
		
		}
	
	@Test(priority = 8)
	public void encryptedReplication() {
		page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Encrypted Replication Enable or Disable Encrypted Replication")).click();
	}
	
	@Test(priority = 9)
	public void exit4() {
		page.click("button[title=\"Cancel\"]");
		
	}
	
	@Test(priority = 10)
	public void dnManagement() {
		page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("DN Management Move, Rename and Copy of Objects")).click();
		
	}
	
	@Test(priority = 11)
	public void exit5() {
		page.click("button[title=\"Cancel\"]");
		
	}
	
	@Test(priority = 12)
	public void partitionManagement() {
		page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Partition Management Create, Merge and Manage Partitions")).click();
		
	}
	
	@Test(priority = 13)
	public void exit6() {
		page.click("button[title=\"Cancel\"]");
		
	}
	
	//@Test(priority = 14)
	  
//	@AfterClass
//	public void afterClasstearDown() {
//		// logoutPage();
//		tearDown();
//		}
	}
	
	
	