object Implicito2 extends App{
  val hexaA = new Hexadecimal(10)
  val hexaB = new Hexadecimal(11)
  println(hexaA.getStringHexa)
  println(hexaB.getStringHexa)
  println("---------------------")
  println((hexaA + 4).getStringHexa)
  println((hexaA - 5).getStringHexa)
  println("---------------------")
  println((hexaB + hexaA).getStringHexa)
  println((hexaB - hexaA).getStringHexa)
  println("---------------------")
  println((6 + 10).getStringHexa)
  println((20 - 5).getStringHexa)

  trait HexaTrait {
    def +(that: Hexadecimal): Hexadecimal
    def -(that: Hexadecimal): Hexadecimal
    def getStringHexa(n: Int): String = n.toHexString
  }

  implicit class Hexadecimal(val n: Int) extends HexaTrait {
    def getStringHexa: String = super.getStringHexa(n)
    def +(that: Hexadecimal): Hexadecimal = new Hexadecimal(n + that.n)
    def -(that: Hexadecimal): Hexadecimal = new Hexadecimal(n - that.n)
  }
}
