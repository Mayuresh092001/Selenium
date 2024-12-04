package FunctionalityTesting;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.BaseClass.BaseClass;
import com.crm.FileUtility.accessOrgName;
import com.crm.pom.OrganizationsRepo;
@Listeners(com.crm.Listeners.ExtentReportListeners.class)
public class DemoTestCase extends BaseClass{
	@Test
	public void org_page() throws EncryptedDocumentException, IOException, InterruptedException {
		String actual_url = driver.getCurrentUrl();
		OrganizationsRepo or = new OrganizationsRepo(driver);
		
		assertEquals(expected_url, actual_url);
		
		or.organizationsTab().click();
		Thread.sleep(2000);
		or.createButton().click();
		Thread.sleep(2000);
		
		accessOrgName org = new accessOrgName();
		String sheetData = org.orgInfo("Sheet1", 1, 2);
		String orgdata = sheetData + Math.random();
		or.orgName().sendKeys(orgdata);
		or.saveButton().click();
		Thread.sleep(2000);
		String name_header = or.organizationHeader().getText();
		assertTrue(name_header.contains(orgdata));
		System.out.println("New organization is created");
		
		
		
		
		
	}

}