package com.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Class {

// **WEB DRIVER METHODS**//

	public static WebDriver driver;

// urlpath
	public static WebDriver browserlaunch(String s) {

		if (s.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\TIKSHANA B\\eclipse-workspace\\MAVEN_PROJECT\\Driver\\chromedriver.exe");

			ChromeOptions co = new ChromeOptions();
			co.addArguments("incognito");

			driver = new ChromeDriver(co);
		} else if (s.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "firefox path");
			driver = new FirefoxDriver();
		} else if (s.equalsIgnoreCase("safari")) {
			System.setProperty("webdriver.safari.driver", "safari path");
			driver = new SafariDriver();
		} else if (s.equalsIgnoreCase("opera")) {
			System.setProperty("webdriver.opera.driver", "opera path");
			driver = new OperaDriver();
		}

		else {
			System.out.println("Different browser");
		}
		return driver;

	}

// get
	public static void urllaunch(String s) {
		driver.get(s);

	}

// gettitle
	public static void title() {
		driver.getTitle();

	}

// get current url
	public static void currenturl() {
		driver.getCurrentUrl();

	}

// close
	public static void close() {
		driver.close();
	}

// quit
	public static void quit() {
		driver.quit();

	}

// navigateto
	public static void navigateto(String s) {
		driver.navigate().to(s);

	}

// navigateback
	public static void navigateback() {
		driver.navigate().back();
	}

// navigate forward
	public static void navigateforward() {
		driver.navigate().forward();
	}

// refresh
	public static void refresh() {
		driver.navigate().refresh();
	}

// maximize
	public static void max() {
		driver.manage().window().maximize();

	}

//**************************************************************************************************//

// **WEB ELEMENT METHODS**//

// sendkeys
	public static void inputvalues(WebElement we, String s) {
		we.sendKeys(s);

	}

// click
	public static void clickelement(WebElement we) {
		we.click();
	}

// check box & radio button
	public static void filter(WebElement we) {
		we.click();
	}

// get text
	public static void getthetext(WebElement we) {
		String text1 = we.getText();
		System.out.println(text1);
	}

// get attribute
	public static void gettheattribute(WebElement bysearchbutton) {
		WebElement gta = driver.findElement((By) bysearchbutton);
		System.out.println(gta);

	}

// IsDisplayed
	public static void display(WebElement we) {
		System.out.println("Is Displayed" + we.isDisplayed());

	}

// IsEnabled
	public static void enable(WebElement we) {
		System.out.println("Is enabled" + we.isEnabled());

	}

// IsSelected
	public static void Select(WebElement we) {
		System.out.println("Is Selected" + we.isSelected());
	}

// clear
	public static void erase(WebElement we) {
		we.clear();

	}

//**************************************************************************************************//

// Takesscreenshot
	public static void sc(String s) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);

		File destination = new File(s);

		FileUtils.copyFile(source, destination);

	}

//**************************************************************************************************//

//**DROPDOWN**//

	public static void dropdown(WebElement we, String s, String s1) {
		Select sel = new Select(we);

		if (s.equalsIgnoreCase("value")) {
			sel.selectByValue(s1);
		}

		else if (s.equalsIgnoreCase("visible text")) {
			sel.selectByVisibleText(s1);
		}

		else if (s.equalsIgnoreCase("dvalue")) {
			sel.deselectByValue(s1);
		}

		else if (s.equalsIgnoreCase("dvisible text")) {
			sel.deselectByVisibleText(s1);
		}

		else if (s.equalsIgnoreCase("index")) {
			sel.selectByIndex(Integer.parseInt(s1));
		}

		else if (s.equalsIgnoreCase("dindex")) {
			sel.deselectByIndex(Integer.parseInt(s1));
		}		
	}
	
	public static void dropdown1 (WebElement we, String s) {

		Select sel = new Select(we);
		
		if (s.equalsIgnoreCase("multi")) {
			boolean ismultiple = sel.isMultiple();
			System.out.println("Is Multiple :" + ismultiple);
		}

		else if (s.equalsIgnoreCase("getopt")) {
			List<WebElement> getopt = sel.getOptions();
			for (WebElement a : getopt) {
				System.out.println(a);
			}
		}

		else if (s.equalsIgnoreCase(" all opt")) {
			List<WebElement> allopt = sel.getAllSelectedOptions();
			for (WebElement b : allopt) {
				System.out.println(b);
			}
		}

		else if (s.equalsIgnoreCase("firstopt")) {
			WebElement firstopt = sel.getFirstSelectedOption();
			System.out.println(firstopt);
		}

		else if (s.equalsIgnoreCase("desel all")) {
			sel.deselectAll();
		}
	}

//**************************************************************************************************//

//**ALERT**//

	public static void alert(String s, String str) {
		Alert a = driver.switchTo().alert();

		if (s.equalsIgnoreCase("accept")) {
			a.accept();
		}

		else if (s.equalsIgnoreCase("dismiss")) {
			a.dismiss();
		}

		else if (s.equalsIgnoreCase("gettext")) {
			String gtxt = a.getText();
			System.out.println(gtxt);
		} else if (s.equalsIgnoreCase("sendkeys")) {
			a.sendKeys(str);
		}

	}

//**************************************************************************************************//

//**WAIT**//

//implicit
	public static void implicit(long l) {
		driver.manage().timeouts().implicitlyWait(l, TimeUnit.SECONDS);
	}

//explicit
	public static void explicit(long l, WebElement we) {
		WebDriverWait w1 = new WebDriverWait(driver, l);
		w1.until(ExpectedConditions.visibilityOf(we));
	}

//fluent
	public static void fluent(long l) {
		Wait<WebDriver> w2 = new FluentWait<WebDriver>(driver).withTimeout(l, TimeUnit.SECONDS)
				.pollingEvery(l, TimeUnit.SECONDS).ignoring(Exception.class);
	}

	public static void sleep(long l) throws InterruptedException {
		Thread.sleep(l);
	}

//**************************************************************************************************//

//**FRAME**//

	public static void frame(WebElement we) {
		driver.switchTo().frame(we);

	}

//**FRAMES**//

	public static void frames(String s, String str) {

		if (s.equalsIgnoreCase("index")) {
			driver.switchTo().frame(Integer.parseInt(str));
		} else if (s.equalsIgnoreCase("ID")) {
			driver.switchTo().frame(str);
		}
	}

	public static void frames1(String s) {

		if (s.equalsIgnoreCase("parent")) {
			driver.switchTo().parentFrame();
		}

		else if (s.equalsIgnoreCase("default")) {
			driver.switchTo().defaultContent();
		}

	}

//**************************************************************************************************//

//**ACTIONS**//

//MOUSE ACTIONS

	public static void Actions(WebElement we, String s) {
		Actions ac = new Actions(driver);

		if (s.equalsIgnoreCase("click")) {
			ac.click(we).build().perform();
		} else if (s.equalsIgnoreCase("doubleclick")) {
			ac.doubleClick(we).build().perform();
		} else if (s.equalsIgnoreCase("rightclick")) {
			ac.contextClick(we).build().perform();
		} else if (s.equalsIgnoreCase("move")) {
			ac.moveToElement(we).build().perform();
		} else if (s.equalsIgnoreCase("d&d")) {
			ac.dragAndDrop(we, we).build().perform();
		}
	}

//**ACTION**//

//ROBOT

//down
	public static void down() throws AWTException {
		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

	}

//enter
	public static void enter() throws AWTException {
		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
//**************************************************************************************************//

// scrollby

	public static void scrollby(String s) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(s);
	}

// scrollinto
	public static void scrollinto(WebElement we) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", we);
	}

//**************************************************************************************************//

//**WINDOW HANDLING**//

	public static void winhandles() {
		driver.getWindowHandles();
	}

	public static void winhandle() {
		driver.getWindowHandle();
	}

}
