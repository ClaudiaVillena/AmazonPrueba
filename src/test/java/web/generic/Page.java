package web.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cucumber.api.Scenario;

public abstract class Page {

	protected String _url = null;
	protected static WebDriver _driver;
	protected static WebDriverWait _wait;
	protected static WebDriverDOM _dom;
	protected static Scenario _scenario;
	protected boolean _screenShotEnabled;

	@SuppressWarnings("unused")
	private static final Logger LOG = LoggerFactory.getLogger(Page.class);

	public Page(WebDriver driver, WebDriverWait wait) throws Throwable {
		Page._driver = driver;
		Page._wait = wait;
		Page._dom = new WebDriverDOM(Page._driver, Page._wait);
	}

	protected void setWebDriver() {
		}

	public abstract boolean isPageRenderedProperly();
}
