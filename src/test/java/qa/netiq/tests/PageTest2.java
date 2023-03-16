package qa.netiq.tests;

import org.testng.annotations.Test;

import qa.netiq.pages.GroupManagementPage;
import qa.netiq.pages.ObjectManagementPage;
import qa.netiq.pages.RightsManagementPage;
import qa.netiq.pages.SNMPPage;
import qa.netiq.pages.SearchPage;
import qa.netiq.pages.TreeViewPage;
import qa.netiq.pages.UserManagementPage;
import qa.netiq.base.BaseTest;
import qa.netiq.pages.AuditingPage;
import qa.netiq.pages.AuthenticationManagementPage;
import qa.netiq.pages.CertificateManagementPage;
import qa.netiq.pages.DnManagementPage;
import qa.netiq.pages.EBAPage;
import qa.netiq.pages.EncryptedAttributesPage;
import qa.netiq.pages.EncryptedReplication;
import qa.netiq.pages.HomePage;
import qa.netiq.pages.IndexManagementPage;
import qa.netiq.pages.LDAPConfigurationPage;
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
   
   @Test(priority = 7)
	public void IndexManagementTest() {
		IndexManagementPage indexManagement = new IndexManagementPage(page);
		indexManagement.indexManagementPageUrl();
		indexManagement.indexManagementPage();
	}
	

	@Test(priority = 8)
	public void LDAPConfigurationTest() {
		LDAPConfigurationPage LDAPConfiguration = new LDAPConfigurationPage(page);
		LDAPConfiguration.ldapConfigurationPageUrl();
		LDAPConfiguration.lDAPConfigurationPage();
	}
	
	@Test(priority = 9)
	public void CertificateManagementTest() {
		CertificateManagementPage CertificateManagement = new CertificateManagementPage(page);
		CertificateManagement.certificateManagementPageUrl();
		CertificateManagement.certificateManagementPage();
	}
	
	@Test(priority = 10)
	public void AuthenticationManagementTest() {
		AuthenticationManagementPage AuthenticationManagement = new AuthenticationManagementPage(page);
		AuthenticationManagement.authenticationManagementPageUrl();
		AuthenticationManagement.authenticationManagementPage();
	}
	
	@Test(priority = 11)
	public void SNMPTest() {
		SNMPPage SNMP = new SNMPPage(page);
		SNMP.snmpPageUrl();
		SNMP.sNMPPage();
	}

	@Test(priority = 12)
	public void EBAPageTest() {
		EBAPage EBA = new EBAPage(page);
		EBA.ebaPageUrl();
		EBA.eBAPage();
	}

   
   
}
