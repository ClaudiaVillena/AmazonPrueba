package web.generic;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverDOM {

	protected WebDriver _driver;
	protected WebDriverWait _wait;

	public WebDriverDOM(WebDriver driver, WebDriverWait wait) {
		this._driver = driver;
		this._wait = wait;
	}

	public void waitAndClick(String xpath) throws InterruptedException {
		this._wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
		Thread.sleep(400);
		this._driver.findElement(By.xpath(xpath)).click();
	}

	public void clearText(By byxpath) {
		this._wait.until(ExpectedConditions.elementToBeClickable(byxpath));
		this._driver.findElement(byxpath).clear();
	}

	public void waitAndClearText(By byxpath) throws InterruptedException {
		this._wait.until(ExpectedConditions.visibilityOfElementLocated(byxpath));
		this._driver.findElement(byxpath).click();
		String valor = this._driver.findElement(byxpath).getAttribute("value");
		Thread.sleep(300);
		int iLongitud = valor.length();
		this._driver.findElement(byxpath).sendKeys(Keys.END);
		for(int i=0;i<iLongitud;i++) {
		this._driver.findElement(byxpath).sendKeys(Keys.BACK_SPACE);
		}
		Thread.sleep(100);
	}

	public void waitClearNChar(By byxpath,int cant) {
		this._wait.until(ExpectedConditions.visibilityOfElementLocated(byxpath));
		this._driver.findElement(byxpath).sendKeys(Keys.END);
		for(int i=0;i<cant;i++) {
		this._driver.findElement(byxpath).sendKeys(Keys.BACK_SPACE);
		}
	}
	
	public void waitAndSendKeys(By byxpath, String expectedKeys) {
		this._wait.until(ExpectedConditions.visibilityOfElementLocated(byxpath));
		this._driver.findElement(byxpath).clear();
		this._driver.findElement(byxpath).sendKeys(expectedKeys);
	}
	
	public String waitAndGetAttribute(By byxpath, String attribute) {
		String text = "";
		this._wait.until(ExpectedConditions.presenceOfElementLocated(byxpath));
		text = this._driver.findElement(byxpath).getAttribute(attribute);
		return text;
	}

	public String waitAndGetText(String xpath) {
		String text = "";
		this._wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
		text = this._driver.findElement(By.xpath(xpath)).getText();
		return text;
	}

	public boolean waitAndReturnIfTitleContains(String titleText) {
		this._wait.until(ExpectedConditions.titleContains(titleText));
		return this._driver.getTitle().contains(titleText);
	}

	public int returnNumberOfFoundElements(String xpath) {
		int iCount = 0;
		this._wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpath)));
		iCount = this._driver.findElements(By.xpath(xpath)).size();
		return iCount;
	}

	public void waitAndHover(String xpath) {
		WebElement web_Element_To_Be_Hovered = this._driver.findElement(By.xpath(xpath));
		Actions builder = new Actions(this._driver);
		builder.moveToElement(web_Element_To_Be_Hovered).build().perform();
	}

	public boolean isElementDisplayed(String xpath) {
		boolean found = false;
		try {
			this._wait.until(ExpectedConditions.visibilityOf(this._driver.findElement(By.xpath(xpath))));
			found = this._driver.findElement(By.xpath(xpath)).isDisplayed();
		} catch (Exception e) {
		}
		return found;
	}

	public boolean relatedItemsAreDisplayed(String xpath) {
		this._wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpath)));
		return true;
	}

	public void getItemsTextInConsole(String xpath, int value) {
		List<WebElement> listOfElements = this._driver.findElements(By.xpath(xpath));
		System.out.println("=========PRICES=====");
		for (int i = 0; i < value; i++) {
			System.out.println("Price" + (i + 1) + ": " + listOfElements.get(i).getText());
		}
	}

	public void WriteOnebyOne(String xpath, String ExpectedKeys) {
		this._wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		int c = 0;
		while (c < ExpectedKeys.length()) {
			char varC = ExpectedKeys.toUpperCase().charAt(c);
			this._driver.findElement(By.xpath(xpath)).sendKeys(Character.toString(varC));
			c++;
		}
	}

	public void isAlertDisplayed(String xpath) {
		boolean found = false;
		try {
			Thread.sleep(500);
			found = this._driver.findElement(By.xpath(xpath)).isDisplayed();
			if ((Boolean) found) {
				this._driver.findElement(By.xpath(xpath)).click();
			}
		} catch (Exception e) {
		}
	}

	public void sendKeysPassWeb(String clave, String tipoTeclado) {
		int c = 0, x = 0, cant;
		String varNum = "", atrib = "", varL = "";
		String[] vector = new String[36];
		clave = clave.trim();
		while (c < clave.length()) {
			char varC = clave.toUpperCase().charAt(c);
			varL = ("" + varC + "").trim();
			c++;
			if (varL.equals("")) {
				varNum = "";
			} else if (varL.equals("0")) {
				varNum = "M31.15625,35.296875 C31.15625,38.6823086 30.5781308,41.1979084 29.421875,42.84375 C28.2656192,44.4895916 26.4583456,45.3125 24,45.3125 C21.5729045,45.3125 19.7760475,44.5078205 18.609375,42.8984375 C17.4427025,41.2890545 16.8385419,38.8854327 16.796875,35.6875 L16.796875,31.828125 C16.796875,28.4843583 17.3749942,26.0000081 18.53125,24.375 C19.6875058,22.7499919 21.4999877,21.9375 23.96875,21.9375 C26.4166789,21.9375 28.2187442,22.7213463 29.375,24.2890625 C30.5312558,25.8567787 31.1249998,28.2760253 31.15625,31.546875 L31.15625,35.296875 Z M28.265625,31.34375 C28.265625,28.8958211 27.9218784,27.1119848 27.234375,25.9921875 C26.5468716,24.8723902 25.4583408,24.3125 23.96875,24.3125 C22.4895759,24.3125 21.4114617,24.8697861 20.734375,25.984375 C20.0572883,27.0989639 19.7083334,28.8124884 19.6875,31.125 L19.6875,35.75 C19.6875,38.2083456 20.0442673,40.0234316 20.7578125,41.1953125 C21.4713577,42.3671934 22.5520761,42.953125 24,42.953125 C25.4270905,42.953125 26.4869757,42.4010472 27.1796875,41.296875 C27.8723993,40.1927028 28.2343748,38.4531369 28.265625,36.078125 L28.265625,31.34375 Z";
				atrib = "d";
			} else if (varL.equals("1")) {
				varNum = "27.390625 44 24.484375 44 24.484375 24.734375 18.65625 26.875 18.65625 24.25 26.9375 21.140625 27.390625 21.140625";
				atrib = "points";
			} else if (varL.equals("2")) {
				varNum = "M31.796875,45 L16.890625,45 L16.890625,42.921875 L24.765625,34.171875 C25.9322975,32.8489517 26.736977,31.7734416 27.1796875,30.9453125 C27.622398,30.1171834 27.84375,29.2604211 27.84375,28.375 C27.84375,27.1874941 27.4843786,26.2135455 26.765625,25.453125 C26.0468714,24.6927045 25.0885477,24.3125 23.890625,24.3125 C22.4531178,24.3125 21.3359415,24.7213501 20.5390625,25.5390625 C19.7421835,26.3567749 19.34375,27.4947844 19.34375,28.953125 L16.453125,28.953125 C16.453125,26.8593645 17.1275974,25.1666731 18.4765625,23.875 C19.8255276,22.5833269 21.630197,21.9375 23.890625,21.9375 C26.0052189,21.9375 27.6770772,22.492182 28.90625,23.6015625 C30.1354228,24.710943 30.75,26.1874908 30.75,28.03125 C30.75,30.2708445 29.3229309,32.9374845 26.46875,36.03125 L20.375,42.640625 L31.796875,42.640625 L31.796875,45 Z";
				atrib = "d";
			} else if (varL.equals("3")) {
				varNum = "M21.09375,32.21875 L23.265625,32.21875 C24.6302152,32.1979166 25.7031211,31.8385452 26.484375,31.140625 C27.2656289,30.4427048 27.65625,29.5000059 27.65625,28.3125 C27.65625,25.64582 26.3281383,24.3125 23.671875,24.3125 C22.4218688,24.3125 21.4244829,24.6692673 20.6796875,25.3828125 C19.9348921,26.0963577 19.5625,27.0416608 19.5625,28.21875 L16.671875,28.21875 C16.671875,26.4166577 17.3307226,24.9192768 18.6484375,23.7265625 C19.9661524,22.5338482 21.6406148,21.9375 23.671875,21.9375 C25.8177191,21.9375 27.4999939,22.5052027 28.71875,23.640625 C29.9375061,24.7760473 30.546875,26.3541566 30.546875,28.375 C30.546875,29.3645883 30.2265657,30.322912 29.5859375,31.25 C28.9453093,32.177088 28.0729222,32.8697894 26.96875,33.328125 C28.2187562,33.7239603 29.1848924,34.3802037 29.8671875,35.296875 C30.5494826,36.2135462 30.890625,37.3333267 30.890625,38.65625 C30.890625,40.6979269 30.223965,42.3177023 28.890625,43.515625 C27.557285,44.7135477 25.8229273,45.3125 23.6875,45.3125 C21.5520727,45.3125 19.8151109,44.7343808 18.4765625,43.578125 C17.1380141,42.4218692 16.46875,40.8958428 16.46875,39 L19.375,39 C19.375,40.1979227 19.7656211,41.1562464 20.546875,41.875 C21.3281289,42.5937536 22.3749934,42.953125 23.6875,42.953125 C25.0833403,42.953125 26.151038,42.5885453 26.890625,41.859375 C27.630212,41.1302047 28,40.0833402 28,38.71875 C28,37.3958267 27.5937541,36.3802119 26.78125,35.671875 C25.9687459,34.9635381 24.7968827,34.5989584 23.265625,34.578125 L21.09375,34.578125 L21.09375,32.21875 Z";
				atrib = "d";
			} else if (varL.equals("4")) {
				varNum = "M29.09375,37.359375 L32.25,37.359375 L32.25,39.71875 L29.09375,39.71875 L29.09375,45 L26.1875,45 L26.1875,39.71875 L15.828125,39.71875 L15.828125,38.015625 L26.015625,22.25 L29.09375,22.25 L29.09375,37.359375 Z M19.109375,37.359375 L26.1875,37.359375 L26.1875,26.203125 L25.84375,26.828125 L19.109375,37.359375 Z";
				atrib = "d";
			} else if (varL.equals("5")) {
				varNum = "M18.21875,33.59375 L19.375,22.25 L31.03125,22.25 L31.03125,24.921875 L21.828125,24.921875 L21.140625,31.125 C22.2552139,30.4687467 23.5208262,30.140625 24.9375,30.140625 C27.010427,30.140625 28.6562439,30.825514 29.875,32.1953125 C31.0937561,33.565111 31.703125,35.416655 31.703125,37.75 C31.703125,40.0937617 31.0703188,41.9400974 29.8046875,43.2890625 C28.5390562,44.6380276 26.7708447,45.3125 24.5,45.3125 C22.4895733,45.3125 20.8489647,44.7552139 19.578125,43.640625 C18.3072853,42.5260361 17.5833342,40.9843848 17.40625,39.015625 L20.140625,39.015625 C20.3177092,40.3177148 20.7812463,41.2994759 21.53125,41.9609375 C22.2812537,42.6223991 23.2708272,42.953125 24.5,42.953125 C25.8437567,42.953125 26.8984337,42.4947963 27.6640625,41.578125 C28.4296913,40.6614537 28.8125,39.3958414 28.8125,37.78125 C28.8125,36.2604091 28.3984416,35.0390671 27.5703125,34.1171875 C26.7421834,33.1953079 25.6406319,32.734375 24.265625,32.734375 C23.005202,32.734375 22.0156286,33.0104139 21.296875,33.5625 L20.53125,34.1875 L18.21875,33.59375 Z";
				atrib = "d";
			} else if (varL.equals("6")) {
				varNum = "M28.234375,22.234375 L28.234375,24.6875 L27.703125,24.6875 C25.4531137,24.7291669 23.661465,25.3958269 22.328125,26.6875 C20.994785,27.9791731 20.2239594,29.7968633 20.015625,32.140625 C21.2135477,30.7656181 22.848948,30.078125 24.921875,30.078125 C26.9010516,30.078125 28.4817649,30.7760347 29.6640625,32.171875 C30.8463601,33.5677153 31.4375,35.3697806 31.4375,37.578125 C31.4375,39.9218867 30.7994855,41.796868 29.5234375,43.203125 C28.2473895,44.609382 26.5364691,45.3125 24.390625,45.3125 C22.2135308,45.3125 20.4479234,44.4765709 19.09375,42.8046875 C17.7395766,41.1328041 17.0625,38.9791798 17.0625,36.34375 L17.0625,35.234375 C17.0625,31.0468541 17.9557202,27.8463652 19.7421875,25.6328125 C21.5286548,23.4192598 24.1874823,22.2864586 27.71875,22.234375 L28.234375,22.234375 Z M24.4375,32.484375 C23.4479117,32.484375 22.5364625,32.781247 21.703125,33.375 C20.8697875,33.968753 20.2916683,34.7135372 19.96875,35.609375 L19.96875,36.671875 C19.96875,38.5468844 20.3906208,40.0572859 21.234375,41.203125 C22.0781292,42.3489641 23.130202,42.921875 24.390625,42.921875 C25.6927148,42.921875 26.7161421,42.4427131 27.4609375,41.484375 C28.2057329,40.5260369 28.578125,39.2708411 28.578125,37.71875 C28.578125,36.1562422 28.2005246,34.893234 27.4453125,33.9296875 C26.6901004,32.966141 25.6875062,32.484375 24.4375,32.484375 Z";
				atrib = "d";
			} else if (varL.equals("7")) {
				varNum = "31.578125 23.875 22.15625 45 19.125 45 28.515625 24.625 16.203125 24.625 16.203125 22.25 31.578125 22.25";
				atrib = "points";
			} else if (varL.equals("8")) {
				varNum = "M30.6875,28.1875 C30.6875,29.3229223 30.3880238,30.3333289 29.7890625,31.21875 C29.1901012,32.1041711 28.3802134,32.7968725 27.359375,33.296875 C28.5468809,33.8072942 29.4869757,34.5520784 30.1796875,35.53125 C30.8723993,36.5104216 31.21875,37.6197855 31.21875,38.859375 C31.21875,40.8281348 30.5546941,42.3958275 29.2265625,43.5625 C27.8984309,44.7291725 26.1510525,45.3125 23.984375,45.3125 C21.7968641,45.3125 20.0442774,44.7265684 18.7265625,43.5546875 C17.4088476,42.3828066 16.75,40.8177181 16.75,38.859375 C16.75,37.6302022 17.0859341,36.5208383 17.7578125,35.53125 C18.4296909,34.5416617 19.3593691,33.7916692 20.546875,33.28125 C19.5364533,32.7812475 18.7395862,32.0885461 18.15625,31.203125 C17.5729138,30.3177039 17.28125,29.3125056 17.28125,28.1875 C17.28125,26.2708237 17.8958272,24.7500056 19.125,23.625 C20.3541728,22.4999944 21.9739483,21.9375 23.984375,21.9375 C25.984385,21.9375 27.6015563,22.4999944 28.8359375,23.625 C30.0703187,24.7500056 30.6875,26.2708237 30.6875,28.1875 Z M28.328125,38.796875 C28.328125,37.5260353 27.9244832,36.4895873 27.1171875,35.6875 C26.3098918,34.8854127 25.2552148,34.484375 23.953125,34.484375 C22.6510352,34.484375 21.6067748,34.8802044 20.8203125,35.671875 C20.0338502,36.4635456 19.640625,37.5052019 19.640625,38.796875 C19.640625,40.0885481 20.0234337,41.104163 20.7890625,41.84375 C21.5546913,42.583337 22.6197848,42.953125 23.984375,42.953125 C25.3385484,42.953125 26.4010378,42.5807329 27.171875,41.8359375 C27.9427122,41.0911421 28.328125,40.0781314 28.328125,38.796875 Z M23.984375,24.3125 C22.8489527,24.3125 21.929691,24.664059 21.2265625,25.3671875 C20.523434,26.070316 20.171875,27.0260356 20.171875,28.234375 C20.171875,29.3906308 20.5182257,30.3255173 21.2109375,31.0390625 C21.9036493,31.7526077 22.8281192,32.109375 23.984375,32.109375 C25.1406308,32.109375 26.0651007,31.7526077 26.7578125,31.0390625 C27.4505243,30.3255173 27.796875,29.3906308 27.796875,28.234375 C27.796875,27.0781192 27.4375036,26.1354203 26.71875,25.40625 C25.9999964,24.6770797 25.0885472,24.3125 23.984375,24.3125 Z";
				atrib = "d";
			} else if (varL.equals("9")) {
				varNum = "M27.96875,35 C27.3645803,35.7187536 26.6432334,36.2968728 25.8046875,36.734375 C24.9661416,37.1718772 24.04688,37.390625 23.046875,37.390625 C21.7343684,37.390625 20.5911507,37.0677116 19.6171875,36.421875 C18.6432243,35.7760384 17.8906277,34.8671934 17.359375,33.6953125 C16.8281223,32.5234316 16.5625,31.2291738 16.5625,29.8125 C16.5625,28.2916591 16.8515596,26.9218811 17.4296875,25.703125 C18.0078154,24.4843689 18.8281197,23.5520866 19.890625,22.90625 C20.9531303,22.2604134 22.1927012,21.9375 23.609375,21.9375 C25.8593863,21.9375 27.632806,22.7786374 28.9296875,24.4609375 C30.226569,26.1432376 30.875,28.4374855 30.875,31.34375 L30.875,32.1875 C30.875,36.6146055 30.0000087,39.846344 28.25,41.8828125 C26.4999913,43.919281 23.8593927,44.9635414 20.328125,45.015625 L19.765625,45.015625 L19.765625,42.578125 L20.375,42.578125 C22.7604286,42.5364581 24.5937436,41.9140685 25.875,40.7109375 C27.1562564,39.5078065 27.8541661,37.6041797 27.96875,35 Z M23.515625,35 C24.4843798,35 25.3776001,34.703128 26.1953125,34.109375 C27.0130249,33.515622 27.6093731,32.7812544 27.984375,31.90625 L27.984375,30.75 C27.984375,28.8541572 27.5729208,27.3125059 26.75,26.125 C25.9270792,24.9374941 24.885423,24.34375 23.625,24.34375 C22.3541603,24.34375 21.3333372,24.8307243 20.5625,25.8046875 C19.7916628,26.7786507 19.40625,28.062492 19.40625,29.65625 C19.40625,31.2083411 19.7786421,32.4869741 20.5234375,33.4921875 C21.2682329,34.4974009 22.2656188,35 23.515625,35 Z";
				atrib = "d";
			} else {
				vector[10] = "Q";
				vector[11] = "W";
				vector[12] = "E";
				vector[13] = "R";
				vector[14] = "T";
				vector[15] = "Y";
				vector[16] = "U";
				vector[17] = "I";
				vector[18] = "O";
				vector[19] = "P";
				vector[20] = "A";
				vector[21] = "S";
				vector[22] = "D";
				vector[23] = "F";
				vector[24] = "G";
				vector[25] = "H";
				vector[26] = "J";
				vector[27] = "K";
				vector[28] = "L";
				vector[29] = "Z";
				vector[30] = "X";
				vector[31] = "C";
				vector[32] = "V";
				vector[33] = "B";
				vector[34] = "N";
				vector[35] = "M";

				for (x = 10; x <= 35;) {
					if (vector[x].equals(varL)) {
						cant = x;
						if (Parameters.TECLADO_LOGIN_WEB.equals(tipoTeclado)
								|| Parameters.TECLADO_REGISTRO_ATM.equals(tipoTeclado)) {
							this._driver
									.findElement(
											By.xpath("//*[@id='app']/div[2]/div/div[5]/div/div/a[" + (cant + 1) + "]"))
									.click();
							x = 35;
						} else if (Parameters.TECLADO_REGISTRO_WEB.equals(tipoTeclado)) {
							this._driver
									.findElement(By
											.xpath("//*[@id='app']/div[2]/div[2]/div[4]/div/div/a[" + (cant + 1) + "]"))
									.click();
							x = 35;
						} else if (Parameters.TECLADO_REGISTRO_WEB_REPITE.equals(tipoTeclado)) {
							this._driver
									.findElement(By
											.xpath("//*[@id='app']/div[2]/div[2]/div[6]/div/div/a[" + (cant + 1) + "]"))
									.click();
							x = 35;
						} else if (Parameters.TECLADO_CLAVE_ACTUAL.equals(tipoTeclado)) {
							this._driver.findElement(By.xpath(
									"//*[@id='app']/div[2]/div/section/div/div/div[2]/div[1]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div/div/a["
											+ (cant + 1) + "]"))
									.click();
							x = 35;
						} else if (Parameters.TECLADO_CLAVE_NUEVO.equals(tipoTeclado)) {
							this._driver.findElement(By.xpath(
									"//*[@id='app']/div[2]/div/section/div/div/div[2]/div[1]/div/div/div[2]/div/div/div[1]/div/div/div[4]/div/div/a["
											+ (cant + 1) + "]"))
									.click();
							x = 35;
						} else if (Parameters.TECLADO_CLAVE_REPITE.equals(tipoTeclado)) {
							this._driver.findElement(By.xpath(
									"//*[@id='app']/div[2]/div/section/div/div/div[2]/div[1]/div/div/div[2]/div/div/div[1]/div/div/div[6]/div/div/a["
											+ (cant + 1) + "]"))
									.click();
							x = 35;
						}

					}
					x++;
				}
				x = 0;
			}

			if (varNum != "") {
				if (Parameters.TECLADO_LOGIN_WEB.equals(tipoTeclado)
						|| Parameters.TECLADO_REGISTRO_ATM.equals(tipoTeclado)) {
					this._driver
							.findElement(By.xpath(
									"//*[@" + atrib + "='" + varNum + "']//ancestor::span[@class='svg']/ancestor::a"))
							.click();
				} else {
					this._driver.findElement(By.xpath("//div[@class='keyboard keyboard-responsive active all']//*[@"
							+ atrib + "='" + varNum + "']//ancestor::span[@class='svg']/ancestor::a")).click();
				}

			}
			varNum = "";
		}
	}

	public boolean clickByText(String elementoContenedor, String etiqueta, String texto) throws Exception {
		try {
			List<WebElement> LISTASELEMENTS = this._driver.findElements(By.xpath(elementoContenedor));
			for (WebElement contenedor : LISTASELEMENTS) {
				List<WebElement> listaDivs = null;

				this.isElementDisplayed(elementoContenedor);
				try {
					WebDriverWait wait = new WebDriverWait(this._driver, 30);
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elementoContenedor)));
				} catch (Exception e) {
					return false;
				}

				listaDivs = contenedor.findElements(By.xpath(".//" + etiqueta));
				String textoValor = "";
				for (WebElement div : listaDivs) {
					textoValor = div.getText();
					if (textoValor.equals(texto)) {
						div.click();
						Thread.sleep(500);
						return true;
					}
				}
			}
		} catch (Exception e) {
			return false;
		}
		return false;
	}
	
}