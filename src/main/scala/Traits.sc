abstract class Prueba(val parametro1: String) {
  def metodo1 = println("Este es el método 1")
}

abstract class ClaseAbstracta {
  def metodoAbastracto2 = println("Holi")
}
class NuevaPrueba(prueba: String) extends Prueba(prueba) {

}

new NuevaPrueba("").metodo1

trait Prueba2 {
  def prueba2Imprime = println("Imprime 4")
}

trait Prueba3 {
  val ttt: Boolean
  def prueba3Imprime = println("Imprime 3")
  def aaa: Unit
}

class NPE extends Prueba("") with Prueba2 with Prueba3 {
  def aaa: Unit = print("Hola")
  val ttt = false
}

new NPE().prueba2Imprime
new NPE().prueba3Imprime
new NPE().metodo1
new NPE().aaa

class NNN extends Prueba("") with Prueba2 {

}

val lista = List((1,2), (2,3), (3,4))
lista.map(x=>(x._1 + 1) * x._2)