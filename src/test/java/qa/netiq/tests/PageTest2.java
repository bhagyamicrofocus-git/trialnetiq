package qa.netiq.tests;

import org.testng.annotations.Test;

import qa.netiq.base.BaseTest;
import qa.netiq.pages.AuditingPage;
import qa.netiq.pages.DnManagementPage;
import qa.netiq.pages.EncryptedAttributesPage;
import qa.netiq.pages.EncryptedReplication;
import qa.netiq.pages.PartitionManagementPage;
import qa.netiq.pages.SchemaPage;

public class PageTest2 extends BaseTest {
   @Test(priority=1)
   public void schemaPageTest() throws InterruptedException {
	   new SchemaPage(page)
	   .schemaPageUrl()
	   .schemaPageTitle()
	    .headerschema();
	   }
	   
   
   @Test(priority=2)
   public void auditingPageTest() throws InterruptedException {
	   new AuditingPage(page)
	   .auditPageUrl()
	   .auditPageTitle()
	   .headeraudit();
	   
   }
   
   @Test(priority=3)
   public void encryptedAttributesPageTest() throws InterruptedException {
	   new EncryptedAttributesPage(page)
	   .encryptedAttributesPageTitle()
	   .encryptedAttributesPageUrl()
	   .headerAttributes();
   }
   
   @Test(priority=4)
   public void encryptedReplicationPageTest() throws InterruptedException {
	   new EncryptedReplication(page)
	   .encryptedReplicationPageTitle()
	   .encryptedReplicationPageUrl()
	   .headerReplication();
   }
   
   @Test(priority=5)
   public void dnManagementPageTest() throws InterruptedException {
	   new DnManagementPage(page)
	   .dnManagementPageTitle()
	   .dnManagementPageUrl()
	   .headerDn();
   }
   
   
   @Test(priority=6)
   public void partitionManagementTest() throws InterruptedException {
	   new PartitionManagementPage(page)
	   .partitionManagementPageTitle()
	   .partitionManagementPageUrl()
	   .headerPartition();
   }
   
   
   
}
