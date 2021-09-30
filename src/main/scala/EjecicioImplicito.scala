object EjecicioImplicito extends App {
  case class Catalog(index: Int, value: String)
  case class Address(index: Int, street: String, name: String)
  case class Product(index: Int, name: String, tax: Double)

  implicit class Convert(val index:Int) {
    def toCatalog(value: String):Catalog = {
      Catalog(index, value)
    }

    def toAdress(street: String="Calle", name: String="Name") : Address = {
      Address(index, street, name)
    }

    def toProduct(name: String, tax: Double): Product = {
      Product(index, name, tax)
    }
  }

  println(20.toAdress())

}
