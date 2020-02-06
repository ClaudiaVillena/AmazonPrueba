package web.lib;

import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cucumber.api.Scenario;


public class WebDriverManager {
	private static final Logger LOG = LoggerFactory.getLogger(WebDriverManager.class);
	
	private static HashMap<Long, WebDriver> map = new HashMap<Long, WebDriver>();
	private static HashMap<Long, WebDriverWait> waitMap = new HashMap<Long, WebDriverWait>();
	
	private static final ThreadLocal<Scenario> scenarioInstance = new ThreadLocal<Scenario>();
	
	private static final ThreadLocal<WebDriver> driverInstance = new ThreadLocal<WebDriver>();
	private static final ThreadLocal<WebDriverWait> waitInstance = new ThreadLocal<WebDriverWait>();
	/**
	 * Gets the driver instance.
	 * 
	 * @return the driver instance
	 */
	public static WebDriver getDriverInstance() {
		return map.get(Thread.currentThread().getId());
	}

	/**
	 * Gets the wait.
	 * 
	 * @return the wait
	 */
	public static WebDriverWait getWaitInstance() {
		return waitMap.get(Thread.currentThread().getId());
	}

	
	public static WebDriverWait GetDriverWait() {
		return WebDriverManager.waitInstance.get();
	}
	
	public static WebDriver GetDriver() throws Exception {
		WebDriver driver = WebDriverManager.driverInstance.get();
		if (driver != null)
			return driver;
		else {
			throw new Exception("please call before and scenario to create web driver");
		}
	}
	public static void setScenario(Scenario scenario) {
		WebDriverManager.scenarioInstance.set(scenario);
	}
	
	public static Scenario getScenario() {
		return WebDriverManager.scenarioInstance.get();
	}

	/**
	 * Start driver.
	 * 
	 * @param type      the type
	 * @param portalUrl the portal url
	 * @param timeout   the timeout
	 * @return the web driver
	 * @throws IOException
	 */
	public static WebDriver getDriver(String type, String portalUrl, int timeout, Scenario scenario) throws IOException {
		System.out.println("Thread started: " + Thread.currentThread().toString());
		LOG.info("Type: " + type);
		WebDriverManager.setScenario(scenario);
		WebDriver d;
		if (type.equalsIgnoreCase("chrome")) {
			String BASE_PATH = System.getProperty("user.dir") + "/";
			BASE_PATH = BASE_PATH + "resources/driver/chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", BASE_PATH);
			d = new ChromeDriver();
			//map.put(Thread.currentThread().getId(), d);
		} else if (type.equalsIgnoreCase("firefox")) {
			FirefoxProfile profile = new FirefoxProfile();
			profile.setPreference("browser.download.folderList", 2);
			profile.setPreference("browser.download.manager.showWhenStarting", false);
			profile.setPreference("pdfjs.disabled", true);
			profile.setPreference("pdfjs.disabled", true);
			d = new FirefoxDriver(profile);
			//map.put(Thread.currentThread().getId(), d);
		} else if (type.equalsIgnoreCase("ie")) {
			String BASE_PATH = System.getProperty("user.dir") + "\\";
			BASE_PATH = BASE_PATH + "resources\\driver\\IEDriverServer32.exe";
			System.setProperty("webdriver.ie.driver", BASE_PATH);
			DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();
			ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			d = new InternetExplorerDriver(ieCapabilities);
			//map.put(Thread.currentThread().getId(), d);
		} else {
			throw new IllegalArgumentException("Browser type not supported: " + type);
		}
		
		map.put(Thread.currentThread().getId(), d);
		waitMap.put(Thread.currentThread().getId(), new WebDriverWait(d, timeout));
		
		d.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		
		WebDriverManager.driverInstance.set(d);
		WebDriverManager.waitInstance.set(new WebDriverWait(d, timeout));

		d.get(portalUrl);
		return d;
	}

	/**
	 * Stop driver.
	 * 
	 * @throws InterruptedException
	 */

	public static void stopDriver(Scenario scenario) throws Exception {
		WebDriverManager.scenarioInstance.remove();
		WebDriver d = getDriverInstance();
		if (d != null) {
			try {
				CaptureScreen(d, scenario);
			} catch (Exception ex) {
				System.out.println(ex.getMessage());
			}
			try {
				CaptureExecutionInformation(d, scenario);
			} catch (Exception ex) {
				System.out.println(ex.getMessage());
			}
			try {
				d.close();
			} catch (Exception ex) {
				System.out.println(ex.getMessage());
			}
			try {
				d.quit();
			} catch (Exception ex) {
				// this is just in case close failed
			} finally {
				map.remove(Thread.currentThread().getId(), d);
			}
		}
	}

	public static void CaptureScreen(WebDriver driver, Scenario scenario) {
		try {
			byte[] screenshot = ((org.openqa.selenium.TakesScreenshot) driver)
					.getScreenshotAs(org.openqa.selenium.OutputType.BYTES);
			scenario.embed(screenshot, "image/png");
		} catch (Exception ex) {
			scenario.write(ex.getMessage());
		}
	}

	private static void CaptureExecutionInformation(WebDriver driver, Scenario scenario) {
		try {
			String current_url = driver.getCurrentUrl();
			String current_title = driver.getTitle();
			scenario.write(String.format("title: %s , url: %s ", current_title, current_url));
		} catch (Exception ex) {
			scenario.write(ex.getMessage());
		}
	}
}
