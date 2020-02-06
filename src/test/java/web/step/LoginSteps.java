package web.step;

import static org.junit.Assert.assertTrue;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.runtime.java.StepDefAnnotation;
import web.generic.Parameters;
import web.lib.WebDriverManager;
import web.page.login_page.LoginPage;

@StepDefAnnotation
public class LoginSteps {
	// ---------------------------------------------------------
	// --------------- - VARIABLES - ---------------------------
	// ---------------------------------------------------------

	private Scenario scenario;
	private LoginPage loginPage;
	
	@Before
    public void Before(Scenario scenario) throws Throwable {
		this.scenario=scenario;
    }
	
	@After
	public void ending(Scenario scenario) throws Throwable{
		WebDriverManager.stopDriver(scenario);
	}
	
	@Given("^Cargar la pagina de Amazon on LoginSteps$")
    public void cargar_la_pagina_de_Interbank() throws Throwable {
		WebDriverManager.getDriver(Parameters.ChromeDriver, Parameters.Url_IBK_UAT, Parameters.TimeOutDriver,scenario);
		this.loginPage = new LoginPage(WebDriverManager.GetDriver(), WebDriverManager.GetDriverWait());
		assertTrue(this.loginPage.isPageRenderedProperly());
    }

    @And("Escribir en el cuadro de busqueda (.+) on LoginSteps$")
    public void escribir_el_numero_de_la_tarjeta(String sCreditCard) throws Throwable {
	   this.loginPage = new LoginPage(WebDriverManager.GetDriver(), WebDriverManager.GetDriverWait());
	   this.loginPage.setTextNroTarjeta(sCreditCard);
    }

    @And("^Selecciono el tipo de marca Bose on LoginSteps$")
    public void seleccionar_el_tipo_de_documento() throws Throwable {
    	this.loginPage.clicChkMarca();
    }

    @And("^Escribir el numero de documento (.+) on LoginSteps$")
    public void escribir_el_numero_de_documento(String sNumeroDocumento) throws Throwable {
    	this.loginPage.setTextNroDoc(sNumeroDocumento);
    }

    @And("^Escribir la clave web (.+) on LoginSteps$")
    public void escribir_la_clave_web(String sClaveWeb) throws Throwable {
    	this.loginPage.setTextClaveWeb(sClaveWeb);
    }
    @And("^Recordar Nro Tarjeta y Nro Documento on LoginSteps$")
    public void recordar__nro_tarjeta_y_nro_documento_on_loginsteps() throws Throwable {
    	this.loginPage.clicBtnRecordar();
    }
//    @And("^Click al boton ingresar on LoginSteps$")
//    public void click_al_boton_ingresar_on_loginsteps() throws Throwable {
//        this.loginPage.clickButtonIngresar();
//    }
    @And("^Recordar solo Nro Tarjeta on LoginSteps$")
    public void recordar_solo_nro_tarjeta_on_loginsteps() throws Throwable {
    	this.loginPage.clicBtnRecordarNroDocumento();
    }
  
    @And("^Recordar solo Nro Documento on LoginSteps$")
    public void recordar_solo_nro_documento_on_loginsteps() throws Throwable {
    	this.loginPage.clicBtnRecordarNroTarjeta();
    }
 
    @And("^Click al boton ingresar on LoginSteps$")
    public void click_al_boton_ingresar_on_loginsteps() throws Throwable {
        this.loginPage.clickButtonIngresar();
    }

    @And("^Mostrar la pagina Inicio on LoginSteps$")
    public void mostrar_la_pagina_inicio_on_loginsteps() throws Throwable {
        this.loginPage.waitPageHome();
    }
    
    @Then("^Click cerrar sesion on LoginSteps$")
    public void click_cerrar_session_on_loginsteps() throws Throwable {
        this.loginPage.clickBotonCerrarSesion();
    }

    @And("Hago Click en el boton buscar")
    public void hagoClickEnElBotonBuscar() throws Throwable {
	    this.loginPage.clicBtnBuscar();
    }

    @And("Imprimo el numero de resultados")
    public void imprimoElNumeroDeResultados() throws Throwable {
        String log = this.loginPage.obtenerTextoResultado();
        System.out.println(log);
    }

    @And("Ordeno de manera ascendente")
    public void ordenoDeManeraAscendente()  throws Throwable{
	    this.loginPage.ordenarAsendente();
    }

    @And("Selecciono el primer elemento y imprimo detalles")
    public void seleccionoElPrimerElementoYImprimoDetalles()   throws Throwable{
	    this.loginPage.clickElementoBusqueda1();
    }


    @And("Selecciono el segundo elemento y imprimo detalles")
    public void seleccionoElSegundoElementoYImprimoDetalles()  throws Throwable{
        this.loginPage.clickElementoBusqueda2();
    }

    @And("Selecciono el tercer elemento y imprimo detalles")
    public void seleccionoElTercerElementoYImprimoDetalles() throws Throwable {
        this.loginPage.clickElementoBusqueda3();
    }

    @And("Regreso a la pagina anterior")
    public void regresoALaPaginaAnterior() throws Throwable{
	    this.loginPage.regresarNavegacionBack();
    }

}