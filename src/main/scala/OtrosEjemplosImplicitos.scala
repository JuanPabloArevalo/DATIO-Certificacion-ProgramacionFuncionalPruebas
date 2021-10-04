object OtrosEjemplosImplicitos extends App{

  case class Persona(nombre: String){
    def saludar = println(s"Hola mi nombre es $nombre")
  }

  case class Fraccion(numerador: String, denominador: String){
    def imprimir = println(s"Fracción: ${numerador} / $denominador")
  }

  implicit def stringToPerson (nombre: String): Persona = Persona(nombre)
  implicit def stringToFraccion(fraccion: String): Fraccion = Fraccion(fraccion.split("/")(0),fraccion.split("/")(1))

  "3/4".saludar
  "3/4".imprimir
}
