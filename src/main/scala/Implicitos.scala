object Implicitos extends App {

  implicit val mensaje = "Mauricio es un HP"

  def saludar(aQuien: String)(implicit mensaje: Int) = {
    println(s"A quien saludamos: $aQuien. El mensaje: $mensaje")
  }


  implicit val mensaje2 = 5

  saludar("Juan")(6)
  saludar("Jacinto")

  new Pregunta().saludar2("NN")

}

class Pregunta {
  def saludar2(aQuien: String)(implicit mensaje: Int) = {
    println(s"A quien saludamos: $aQuien. El mensaje: $mensaje")
  }
}
