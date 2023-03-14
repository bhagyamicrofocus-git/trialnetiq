package qa.netiq.tests;

import org.testng.annotations.Test;

import qa.netiq.base.BaseTest;
import qa.netiq.pages.AuditingPage;
import qa.netiq.pages.DnManagementPage;
import qa.netiq.pages.EncryptedAttributesPage;
import qa.netiq.pages.EncryptedReplication;
import qa.netiq.pages.HomePage;
import qa.netiq.pages.PartitionManagementPage;
import qa.netiq.pages.SchemaPage;

public class PageTest extends BaseTest {
	
   @Test(priority=1)
   public void homePageTest() {
	   new HomePage(page)
	   .homePageTitle()
	   .homePageUrl()
	   .headerHome();
   }
   
   @Test(priority=2)
   public void schemaPageTest() throws InterruptedException {
	   Thread.sleep(2000);
	   new SchemaPage(page)
	   .schemaPageUrl()
	   .schemaPageTitle()
	    .headerschema();
	   }
	   
   
   @Test(priority=3)
   public void auditingPageTest() throws InterruptedException {
	   Thread.sleep(2000);
	   new AuditingPage(page)
	   .auditPageUrl()
	   .auditPageTitle()
	   .headeraudit();
	   
   }
   
   @Test(priority=4)
   public void encryptedAttributesPageTest() throws InterruptedException {
	   Thread.sleep(2000);
	   new EncryptedAttributesPage(page)
	   .encryptedAttributesPageTitle()
	   .encryptedAttributesPageUrl()
	   .headerAttributes();
   }
   
   @Test(priority=5)
   public void encryptedReplicationPageTest() throws InterruptedException {
	   Thread.sleep(2000);
	   new EncryptedReplication(page)
	   .encryptedReplicationPageTitle()
	   .encryptedReplicationPageUrl()
	   .headerReplication();
   }
   
   @Test(priority=6)
   public void dnManagementPageTest() throws InterruptedException {
	   Thread.sleep(2000);
	   new DnManagementPage(page)
	   .dnManagementPageTitle()
	   .dnManagementPageUrl()
	   .headerDn();
   }
   
   
   @Test(priority=7)
   public void partitionManagementTest() throws InterruptedException {
	   Thread.sleep(2000);
	   new PartitionManagementPage(page)
	   .partitionManagementPageTitle()
	   .partitionManagementPageUrl()
	   .headerPartition();
   }
   
   
}
