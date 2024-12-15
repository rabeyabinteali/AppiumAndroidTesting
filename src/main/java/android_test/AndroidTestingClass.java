package android_test;
import java.net.URL;
import java.util.Map;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.options.BaseOptions;
public class AndroidTestingClass{
	public AndroidDriver driver;
	public URL url;
	@BeforeMethod
	@BeforeClass
	public void setUp() throws Exception {
	BaseOptions options = new BaseOptions()
	.amend("appium:automationName", "UiAutomator2")
	.amend("appium:platformName", "Android")
	.amend("appium:platformVersion", "13")
	.amend("appium:deviceName", "777f539c")
	.amend("appium:newCommandTimeout", 5000)
	.amend("appium:appPackage","advanced.scientific.calculator.calc991.plus")
	.amend("appium:appActivity","advanced.scientific.calculator.calc991.plus.main.ytivitcArotaluclaCecneicS_kLCneODahnPWsyfdoUSygLOxHQLt_e")
	.amend("appium:connectHardwareKeyboard", true);
	url = new URL("http://localhost:4723");
	driver = new AndroidDriver(url, options);
	}
	@Test
	public void sampleTest() {
		driver.findElement(AppiumBy.id("android:id/button1")).click();
		//addition
		driver.findElement(AppiumBy.id("advanced.scientific.calculator.calc991.plus:id/brpejgovqdvtebgwnqdxmunpcmsc_h")).click();
		driver.findElement(AppiumBy.id("advanced.scientific.calculator.calc991.plus:id/wjqbenmwo_chpuzvhiupkfhwsrolyd")).click();
		driver.findElement(AppiumBy.id("advanced.scientific.calculator.calc991.plus:id/bsfhjjqcwpagbrvhqzezbsugofyhyn")).click();
		driver.findElement(AppiumBy.id("advanced.scientific.calculator.calc991.plus:id/jqfaxzcmpwkzvxojtmxzmvwitlnebu")).click();
		
		//subtraction
		driver.findElement(AppiumBy.id("advanced.scientific.calculator.calc991.plus:id/cyhmq_x_lwjmw_dtnoboedypvrpibs")).click();
		driver.findElement(AppiumBy.id("advanced.scientific.calculator.calc991.plus:id/ixjhzsdyrceqhplenarsqtrcayiuih")).click();
		driver.findElement(AppiumBy.id("advanced.scientific.calculator.calc991.plus:id/bsfhjjqcwpagbrvhqzezbsugofyhyn")).click();
		driver.findElement(AppiumBy.id("advanced.scientific.calculator.calc991.plus:id/jqfaxzcmpwkzvxojtmxzmvwitlnebu")).click();
		
		//multiplication
		driver.findElement(AppiumBy.id("advanced.scientific.calculator.calc991.plus:id/cyhmq_x_lwjmw_dtnoboedypvrpibs")).click();
		driver.findElement(AppiumBy.id("advanced.scientific.calculator.calc991.plus:id/lcjphehsipoeikcxcyhliualuaolsn")).click();
		driver.findElement(AppiumBy.id("advanced.scientific.calculator.calc991.plus:id/vjqptkglbnpihfyeqpoyndgolhdyxo")).click();
		driver.findElement(AppiumBy.id("advanced.scientific.calculator.calc991.plus:id/jqfaxzcmpwkzvxojtmxzmvwitlnebu")).click();
		
		//division
		driver.findElement(AppiumBy.id("advanced.scientific.calculator.calc991.plus:id/zzazvfehlwbxfbsfavgmdlfedxecov")).click();
		driver.findElement(AppiumBy.id("advanced.scientific.calculator.calc991.plus:id/wzjjyhcpjqxgxhmpkgzipygueymsaw")).click();
		driver.findElement(AppiumBy.id("advanced.scientific.calculator.calc991.plus:id/cyhmq_x_lwjmw_dtnoboedypvrpibs")).click();
		driver.findElement(AppiumBy.id("advanced.scientific.calculator.calc991.plus:id/ctlivpqodsqiosdudclgsycdlarhtz")).click();
		driver.findElement(AppiumBy.id("advanced.scientific.calculator.calc991.plus:id/jqfaxzcmpwkzvxojtmxzmvwitlnebu")).click();

	}
	@AfterMethod
	@AfterClass
	public void tearDown() {
		if (driver != null) {
		driver.quit();
		}
	}
}
