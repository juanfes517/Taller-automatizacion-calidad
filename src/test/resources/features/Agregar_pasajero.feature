Feature: Agregar pasajero.
  Como usuario final
  Quiero ingresar los datos personales de otros pasajeros
  Para agregarlos a mis reservas

  Scenario: ver nuevo pasajero
    Given un usuario que esta en el formulario de reservas
    When agregue un nuevo pasajero
    Then puede ver un formulario para el nuevo pasajero

  Scenario: Ningun pasajero tiene contacto de emergencia
    Given un usuario que se encuentra en el formulario de reserva
    When solo agregue la informacion basica de dos o mas pasajeros
    Then puede ver un mensaje de error pidiendo la informacion de contacto

  Scenario: Crear un reserva exitosamente con pasajeros
    Given Un usuario que esta en la pagina de inicio del modulo de reservas
    When ingrese al formulario de reservas
    And ingrese los datos basicos de todos los pasajeros con un contacto de emergencia
    And confirme la reserva
    Then puede ver un mensaje de creacion exitosa