package web.page.login_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import web.generic.Page;
import web.generic.Parameters;

public class LoginPage extends Page {


	//amazon
	private String txtBusqueda="//*[@id='twotabsearchtextbox']";
	private String btnSubmit="//*[@id='nav-search']/form/div[2]/div/input']";
	private String chkBrand = "//*[@id='p_89/Bose']/span/a/div/label/i";
	private String labelResultados = "//*[@id='search']/span/h1/div/div[1]/div/div/span[1]";
	private String cmbOrdenar = "//*[@id='a-autoid-0-announce']";

	private String labelResultado1 = "//*[@id='search']/div[1]/div[2]/div/span[4]/div[1]/div[1]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span";
	private String labelResultado1precio = "//*[@id='search']/div[1]/div[2]/div/span[4]/div[1]/div[1]/div/span/div/div/div[2]/div[2]/div/div[2]/div[1]/div/div/div/span[2]";

	private String labelResultado2 = "//*[@id='search']/div[1]/div[2]/div/span[4]/div[1]/div[2]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span";
	private String labelResultado2precio = "//*[@id='search']/div[1]/div[2]/div/span[4]/div[1]/div[2]/div/span/div/div/div[2]/div[2]/div/div[2]/div[1]/div/div/div/div/a/span[2]/span[2]";

	private String labelResultado3 = "//*[@id='search']/div[1]/div[2]/div/span[4]/div[1]/div[3]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span";
	private String labelResultado3precio = "//*[@id='search']/div[1]/div[2]/div/span[4]/div[1]/div[3]/div/span/div/div/div[2]/div[2]/div/div[2]/div[1]/div/div/div/span[2]";

	//ibk
	private String txtNroTarjeta="//*[@id='ccNumber']";
	private String txtNroDoc = "//input[@id='idnumber']";
	private String tipoDoc = "//div[@class='input-group__selections']";
	private String lstTipoDocumento = "//*[@class='card']";
	private String txtClaveWeb = "//input[@id='inpPasswordkeyword']";
	private String btnIngresar = "//div[@class='btn-ctn text-center']/a";
	private String alert = "//*[@id='app']/div[2]/div/div[5]/div/div/div/div/div[4]/div/div";
	private String cmbTipoTransferencia = "//*[@class='layer']";
	private String btnRecordar = "//*[@id=\"app\"]/div[2]/div/div[6]/div/div";
//	private String recordNroTarjeta = "//div[@class='layout relative-ctn input-line row wrap']//i[contains(.,'check_box')]";
    private String recordNroTarjetaOff = "//*[@id='app']/div[2]/div/div[1]/div[2]/div";
//   private String recordNroDoc = "//div[@class='flex relative-ctn input-line xs8 sm8 md8']//i[contains(.,'check_box')]";
    private String recordNroDocOff = "//*[@id='app']/div[2]/div/div[2]/div[2]/div[2]/div";
    private String lnkCerrarSesion = "//*[@class='close-session']";
    private String popupClaveSMS = "//*[@class='ibk-modal__dialog modal-container modal-type modal-warning-sms']//*[@class='button ibk-button ibk-dib']";
	
	public LoginPage(WebDriver driver, WebDriverWait wait) throws Throwable {
		super(driver,wait);
	}

	@Override
	public boolean isPageRenderedProperly() {
		this.setWebDriver(); 
		boolean pageLoaded = Page._dom.isElementDisplayed(txtBusqueda);
		return pageLoaded;
	}
	
	public LoginPage setTextNroTarjeta(String value) throws Throwable {
		Page._dom.waitAndClick(txtBusqueda);
		Page._dom.WriteOnebyOne(txtBusqueda, value);
		return this;
	}
	public LoginPage setTextNroDoc(String value) throws Throwable{
		Page._dom.WriteOnebyOne(txtNroDoc, value);
		return this;
	}
	public LoginPage setTextClaveWeb(String value) throws Exception {
		Page._dom.waitAndClick(txtClaveWeb);
		Page._dom.sendKeysPassWeb(value, Parameters.TECLADO_LOGIN_WEB);
		return this;
	}
	public void clicBtnRecordar() throws Throwable {
		Page._dom.waitAndClick(btnRecordar);
	}
	public void clicBtnBuscar() throws Throwable {
		Page._dom.waitAndClick(btnSubmit);
	}
	public void clicChkMarca() throws Throwable {
		Page._dom.waitAndClick(chkBrand);
	}
	public String obtenerTextoResultado() throws Throwable {
		return Page._dom.waitAndGetText(labelResultados);
	}
	public void ordenarAsendente() throws Throwable {
		Page._dom.waitAndClick(cmbOrdenar);
		Page._dom.clickByText(cmbOrdenar, "a", "Price: Low to High");
	}
	public void regresarNavegacionBack() throws Throwable
	{
		Page._driver.navigate().back();
	}

	public void clicBtnRecordarNroTarjeta() throws Throwable{
		Page._dom.waitAndClick(recordNroTarjetaOff);
	}
	public void clicBtnRecordarNroDocumento() throws Throwable{
		Page._dom.waitAndClick(recordNroDocOff);
	}
	public void clickButtonIngresar() throws Exception {
		Page._dom.waitAndClick(btnIngresar);
	}

	public void clickElementoBusqueda1() throws Exception {
		System.out.println(Page._dom.waitAndGetText(labelResultado1));
		System.out.println(Page._dom.waitAndGetText(labelResultado1precio));
		Page._dom.waitAndClick(labelResultado1);
	}

	public void clickElementoBusqueda2() throws Exception {
		System.out.println(Page._dom.waitAndGetText(labelResultado2));
		System.out.println(Page._dom.waitAndGetText(labelResultado2precio));
		Page._dom.waitAndClick(labelResultado2);
	}

	public void clickElementoBusqueda3() throws Exception {
		System.out.println(Page._dom.waitAndGetText(labelResultado3));
		System.out.println(Page._dom.waitAndGetText(labelResultado3precio));
		Page._dom.waitAndClick(labelResultado3);
	}


	public void clicTipoDoc(String sTipoDocumento) throws Exception {
		Page._dom.waitAndClick(tipoDoc);
		Page._dom.clickByText(lstTipoDocumento, "a", sTipoDocumento);
	}
	
	public boolean waitPageHome() throws InterruptedException {
		this.setWebDriver();
		boolean pageLoaded = Page._dom.isElementDisplayed(cmbTipoTransferencia);
		Page._dom.isAlertDisplayed(popupClaveSMS);
		Thread.sleep(600); 
		Page._dom.isAlertDisplayed(alert);
		return pageLoaded;
	}
	
	public boolean clickBotonCerrarSesion() throws Throwable {
		Page._dom.waitAndClick(lnkCerrarSesion);
		this.setWebDriver(); 
		boolean pageLoaded = Page._dom.isElementDisplayed(txtNroTarjeta); 
		return pageLoaded;	
	}



}
