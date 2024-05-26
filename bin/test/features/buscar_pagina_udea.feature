#author:
  #information

  Feature: Busqueda de pagina de la udea. Como estudiante requiero buscar la pagina oficial de udea para navegar en sitio

    Scenario: busqueda sobre el motor de google del sitio oficial
      Given estoy en la sitio de google
      When  digite la palabra clave UdeA
      Then puedo visualizar el link de la pagina oficial de la udea


