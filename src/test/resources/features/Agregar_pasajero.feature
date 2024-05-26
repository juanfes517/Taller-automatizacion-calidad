Feature: Agregar pasajero.
  Como usuario final
  Quiero ingresar los datos personales de otros pasajeros
  Para agregarlos a mis reservas

  Scenario: ver nuevo pasajero
    Given un usuario que esta en el formulario de reservas
    When presione el boton agregar un pasajero
    Then puede ver un formulario para el nuevo pasajero
