$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 2,
  "name": "Login",
  "description": "As un usuario comun\r\nI quiere realizar busqueda\r\nSo mostrara pantalla de inicio",
  "id": "login",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@LOGIN"
    }
  ]
});
formatter.scenarioOutline({
  "line": 8,
  "name": "Iniciar sesion",
  "description": "",
  "id": "login;iniciar-sesion",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@LOGIN1"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "Cargar la pagina de Amazon on LoginSteps",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "Escribir en el cuadro de busqueda \u003csBusqueda\u003e on LoginSteps",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Hago Click en el boton buscar",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Selecciono el tipo de marca Bose on LoginSteps",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Imprimo el numero de resultados",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Ordeno de manera ascendente",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Selecciono el primer elemento y imprimo detalles",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Regreso a la pagina anterior",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Selecciono el segundo elemento y imprimo detalles",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Regreso a la pagina anterior",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Selecciono el tercer elemento y imprimo detalles",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Regreso a la pagina anterior",
  "keyword": "And "
});
formatter.examples({
  "line": 22,
  "name": "",
  "description": "",
  "id": "login;iniciar-sesion;",
  "rows": [
    {
      "cells": [
        "sBusqueda"
      ],
      "line": 23,
      "id": "login;iniciar-sesion;;1"
    },
    {
      "cells": [
        "speakers"
      ],
      "line": 24,
      "id": "login;iniciar-sesion;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 29568300,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Iniciar sesion",
  "description": "",
  "id": "login;iniciar-sesion;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@LOGIN1"
    },
    {
      "line": 1,
      "name": "@LOGIN"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "Cargar la pagina de Amazon on LoginSteps",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "Escribir en el cuadro de busqueda speakers on LoginSteps",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Hago Click en el boton buscar",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Selecciono el tipo de marca Bose on LoginSteps",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Imprimo el numero de resultados",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Ordeno de manera ascendente",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Selecciono el primer elemento y imprimo detalles",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Regreso a la pagina anterior",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Selecciono el segundo elemento y imprimo detalles",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Regreso a la pagina anterior",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Selecciono el tercer elemento y imprimo detalles",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Regreso a la pagina anterior",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.cargar_la_pagina_de_Interbank()"
});
formatter.result({
  "duration": 8946950600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "speakers",
      "offset": 34
    }
  ],
  "location": "LoginSteps.escribir_el_numero_de_la_tarjeta(String)"
});
formatter.result({
  "duration": 1284281900,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.hagoClickEnElBotonBuscar()"
});
formatter.result({
  "duration": 60295596700,
  "error_message": "org.openqa.selenium.TimeoutException: Timed out after 60 seconds waiting for element to be clickable: By.xpath: //*[@id\u003d\u0027nav-search\u0027]/form/div[2]/div/input\u0027]\nBuild info: version: \u00272.42.2\u0027, revision: \u00276a6995d31c7c56c340d6f45a76976d43506cd6cc\u0027, time: \u00272014-06-03 10:52:47\u0027\nSystem info: host: \u0027DESKTOP-3VCU4PG\u0027, ip: \u0027192.168.56.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002713.0.1\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.support.ui.FluentWait.timeoutException(FluentWait.java:259)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:228)\r\n\tat web.generic.WebDriverDOM.waitAndClick(WebDriverDOM.java:29)\r\n\tat web.page.login_page.LoginPage.clicBtnBuscar(LoginPage.java:74)\r\n\tat web.step.LoginSteps.hagoClickEnElBotonBuscar(LoginSteps.java:97)\r\n\tat ✽.And Hago Click en el boton buscar(Login.feature:11)\r\nCaused by: org.openqa.selenium.InvalidSelectorException: invalid selector: Unable to locate an element with the xpath expression //*[@id\u003d\u0027nav-search\u0027]/form/div[2]/div/input\u0027] because of the following error:\nSyntaxError: Failed to execute \u0027evaluate\u0027 on \u0027Document\u0027: The string \u0027//*[@id\u003d\u0027nav-search\u0027]/form/div[2]/div/input\u0027]\u0027 is not a valid XPath expression.\n  (Session info: chrome\u003d79.0.3945.130)\n  (Driver info: chromedriver\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab),platform\u003dWindows NT 10.0.17763 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 25 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/invalid_selector_exception.html\nBuild info: version: \u00272.42.2\u0027, revision: \u00276a6995d31c7c56c340d6f45a76976d43506cd6cc\u0027, time: \u00272014-06-03 10:52:47\u0027\nSystem info: host: \u0027DESKTOP-3VCU4PG\u0027, ip: \u0027192.168.56.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002713.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab), userDataDir\u003dC:\\Users\\ALEXIS\\AppData\\Local\\Temp\\scoped_dir10536_12737}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d79.0.3945.130, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dfalse, acceptInsecureCerts\u003dfalse, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: 18e7db33c4da08175d0523bd4f85ec76\r\n\tat jdk.internal.reflect.GeneratedConstructorAccessor12.newInstance(Unknown Source)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:204)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:156)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:599)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:352)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:449)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:357)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:344)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.findElement(ExpectedConditions.java:730)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.access$000(ExpectedConditions.java:39)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$4.apply(ExpectedConditions.java:130)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$4.apply(ExpectedConditions.java:126)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$17.apply(ExpectedConditions.java:528)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$17.apply(ExpectedConditions.java:521)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:208)\r\n\tat web.generic.WebDriverDOM.waitAndClick(WebDriverDOM.java:29)\r\n\tat web.page.login_page.LoginPage.clicBtnBuscar(LoginPage.java:74)\r\n\tat web.step.LoginSteps.hagoClickEnElBotonBuscar(LoginSteps.java:97)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:567)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:34)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:13)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:30)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:35)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:298)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:48)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:91)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:127)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:26)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.runtime.junit.ExamplesRunner.run(ExamplesRunner.java:59)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:127)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:26)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.runtime.junit.ScenarioOutlineRunner.run(ScenarioOutlineRunner.java:53)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:93)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:37)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:98)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:160)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)\r\n\tat com.intellij.rt.execution.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:47)\r\n\tat com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:242)\r\n\tat com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:70)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:567)\r\n\tat com.intellij.rt.execution.application.AppMainV2.main(AppMainV2.java:131)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginSteps.seleccionar_el_tipo_de_documento()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginSteps.imprimoElNumeroDeResultados()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginSteps.ordenoDeManeraAscendente()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginSteps.seleccionoElPrimerElementoYImprimoDetalles()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginSteps.regresoALaPaginaAnterior()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginSteps.seleccionoElSegundoElementoYImprimoDetalles()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginSteps.regresoALaPaginaAnterior()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginSteps.seleccionoElTercerElementoYImprimoDetalles()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginSteps.regresoALaPaginaAnterior()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.write("title: Amazon.com: Compras en Línea de Electrónicos, Ropa, Computadoras, Libros, DVDs y más , url: https://www.amazon.com/ ");
formatter.after({
  "duration": 4158257399,
  "status": "passed"
});
});