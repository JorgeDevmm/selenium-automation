Feature: Acceso a la web saucedemo

  @Login
  Scenario: Login exitoso
    Given Navegamos a la url "https://www.saucedemo.com/"
    When Ingresamos las credenciales
      | Username      | Password     |
      | standard_user | secret_sauce |
    And Seleccionamos el botón Login
    Then Visualizamos el título "Products" en la página principal
