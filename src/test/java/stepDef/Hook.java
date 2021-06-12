package stepDef;

import java.util.concurrent.CopyOnWriteArrayList;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseUtils;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Hook extends BaseUtils{
	BaseUtils base;
	
	public Hook(BaseUtils base) {
		this.base=base;
	}
	
	@Before
	public void beforeTest(Scenario sc) {
		WebDriverManager.chromedriver().setup();
		base.driver = new ChromeDriver();
	}
	@After
	public void afterTest() {
		base.driver.quit();
		CopyOnWriteArrayList<Integer> li = new CopyOnWriteArrayList<Integer>();
		
		li.add(2);
	}
	@BeforeStep
	public void beforeStep(Scenario sc) {
		System.out.println(sc.getName());;
	}
	

}
