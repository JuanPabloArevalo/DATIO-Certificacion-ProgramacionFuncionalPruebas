abstract class FiguraGeometrica {
  val numeroLados = 5
  val x : String = ""
  def area: Int
  def perimeter: Int
  def getNumeroLados :Int = numeroLados


  def areaGeneral: Int = numeroLados * 8
}
