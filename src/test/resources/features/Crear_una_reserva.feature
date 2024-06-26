Feature: Crear una reserva.
  Como usuario final
  quiero ingresar mi datos personales
  para crear un reserva

  Scenario: El sistema muestra los datos requeridos
    Given un usuario que se encuentra en la pagina de inicio del modulo de reservas
    When ingrese a realizar una reserva
    Then puede visualizar un formulario con todos los datos requeridos.

  Scenario: El usuario ingresa los datos requeridos correctamente.
    Given un usuario que se encuentra en el formulario de reservas
    When ingresa todos los datos requeridos
    Then puede visualizar una ventana de confirmacion

  Scenario: El usuario ingresa los datos requeridos incorrectamente.
    Given un usuario del sistema que se encuentra en el formulario de reservas
    When ingresa todos los datos requeridos de forma incorrecta
    Then puede visualizar un mensaje de error

  Scenario: El usuario puede crear una reserva exitosamente
    Given un usuario que se encuentra en la pagina de inicio
    When ingrese al formulario para realizar un reserva
    And llene todos los campos requeridos
    And confirme su reserva
    Then puede ver un mensaje de exito