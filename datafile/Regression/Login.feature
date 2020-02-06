@LOGIN
Feature: Login
		As un usuario comun
		I quiere realizar busqueda
		So mostrara pantalla de inicio
		
    @LOGIN1
		Scenario Outline: Iniciar sesion
		Given Cargar la pagina de Amazon on LoginSteps
	    When Escribir en el cuadro de busqueda <sBusqueda> on LoginSteps
		And Hago Click en el boton buscar
	    And Selecciono el tipo de marca Bose on LoginSteps
		And Imprimo el numero de resultados
		And Ordeno de manera ascendente
		And Selecciono el primer elemento y imprimo detalles
		And Regreso a la pagina anterior
		And Selecciono el segundo elemento y imprimo detalles
		And Regreso a la pagina anterior
		And Selecciono el tercer elemento y imprimo detalles
		And Regreso a la pagina anterior
			
			Examples: 
      | sBusqueda  		 |
      | speakers 	|
      