package FunctionalityTesting;

import org.testng.annotations.Test;

import com.crm.BaseClass.BaseClass;
import com.crm.pom.CalendarRepo;

public class Testcase1 extends BaseClass {
	public static CalendarRepo cr;
	@Test
	public void calendarPage() {
		cr = new CalendarRepo(driver);
		cr.calendarTab().click();
	}
	

}
