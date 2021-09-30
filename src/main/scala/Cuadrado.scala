class Cuadrado(lado: Int) extends FiguraGeometrica {
  override def area: Int = lado * lado

  override def perimeter: Int = lado * 4
}