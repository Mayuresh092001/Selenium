package FunctionalityTesting;

import org.testng.annotations.Test;

import com.crm.BaseClass.BaseClass;
import com.crm.pom.CalendarRepo;

public class TC1 extends BaseClass  {
	public static CalendarRepo cr;
	@Test
	public void calendar_page()
	{
		cr = new CalendarRepo(driver);
		cr.calendarTab().click();
		
	}
}
