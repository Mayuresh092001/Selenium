package FunctionalityTesting;

import org.testng.annotations.Test;

import com.crm.BaseClass.BaseClass;
import com.crm.pom.contactsRepo;

public class contactTestCase {
	
	
	public class contactTestcase extends BaseClass{
		@Test
		public void contact_page(){
			String actual_url= driver.getCurrentUrl();
			contactsRepo cr = new contactsRepo();
			
			
			
		}
		
	}

}
