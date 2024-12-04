package FunctionalityTesting;

import org.testng.annotations.Test;

import com.crm.BaseClass.BaseClass;
import com.crm.pom.CalendarRepo;

public class TC2 extends BaseClass {
	@Test
	public void Testcasse2() throws InterruptedException {
		CalendarRepo cr = new CalendarRepo(driver);
		cr.calendarTab().click();
		Thread.sleep(2000);
		cr.calendarDayTab().click();
		Thread.sleep(2000);
	}
}
