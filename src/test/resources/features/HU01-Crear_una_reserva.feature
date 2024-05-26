Feature: Crear una reserva.
  Como usuario final
  quiero ingresar mi datos personales
  para crear un reserva

  Scenario: El sistema muestra los datos requeridos
    Given un usuario que se encuentra en la pagina de inicio del modulo de reservas
    When presione el boton relizar reserva
    Then puede visualizar un formulario con todos los datos requeridos.

  Scenario: El usuario ingresa los datos requeridos correctamente.
    Given un usuario que se encuentra en el formulario de reservas
    When ingresa todos los datos requeridos
    Then puede visualizar una ventana de confirmacion