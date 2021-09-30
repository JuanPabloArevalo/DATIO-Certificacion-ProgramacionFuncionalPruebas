def sumaSiinCur(a: Int, b: Int, c:Int): Int= a + b + c
sumaSiinCur(1,2,3)

def sumaCur(a: Int): Int => Int => Int = (b: Int) => (c: Int) => a + b + c

val a = sumaCur(1)

def sumaSin2(a: Int, b: Int): Int= a + b
sumaSin2(1,2)

def sumaCur2(a:Int): Int => Int = (b:Int) => a + b
sumaCur2(2)

def sumaCur4(a: Int): Int => Int => Int => Int = (b:Int) => (c: Int) => (d: Int) => a + b + c + d

def sumCur4A(a: Int, b: Int, c: Int, d:Int) = a + b + c + d

val sumaP1 = sumCur4A(1, _:Int, _:Int, _:Int)
val sumaP2 = sumaP1(2, _:Int, _:Int)
val sumaP3 = sumaP2(3, _:Int)
sumaP3(4)


def encryptVowel(vowelsList: List[Char]): List[Char] = {
  val mapChar = Map(
    'a'-> 'L',
    'e'-> '9',
    'i'-> '$',
    'o'-> 'R',
    'u'-> '4')
  vowelsList.map(x=> mapChar(x))
}
println(encryptVowel(List('a', 'i', 'e', 'a')))
println(encryptVowel(List('a')) )
println(encryptVowel(List('i', 'e')))

def hamburgueseria(ingredientePrincipal: String): String => String = {
  (ingredienteSecundario: String) =>
    s"Crear una hamburguesa de $ingredientePrincipal con $ingredienteSecundario"
}
hamburgueseria("carne")("papas")

def permutaciones = {
  val ingredientePrincipal = List("Carne")
  val listaIg2 = List("papa", "carne")
  val retorno = for{
    x <- ingredientePrincipal;
    y <- listaIg2
  } yield (x,y)
  retorno.foreach(print)
}
permutaciones


class HigherOrderFunctionException extends Exception
def evaluarFuncion (valor1: String, func: String => String): String ={
  try{
    func(valor1)
  }
  catch{
    case _ => throw new HigherOrderFunctionException
  }
}

evaluarFuncion("Hola", n => n.toUpperCase)

class PascalRowException extends Exception

def pascalRow(rowNumber: Int): List[Int] = {
  if(rowNumber == 1) List(1)
  else if (rowNumber == 2) List(1,1)
  else{
    val listasSeparadas: List[List[Int]] = pascalRow(rowNumber-1).sliding(2).toList
    1 +: listasSeparadas.map(a => a.sum) :+ 1
  }
}


def suma(lista: List[Int]): List[Int] = {
  if(lista.size == 2) List(lista.sum)
  else  List(lista.head + lista.tail.head) ::: suma(lista.tail)
}

def pascalRow2(rowNumber: Int): List[Int] = {
  if(rowNumber == 1) List(1)
  else if (rowNumber == 2) List(1,1)
  else{
    1 +: suma(pascalRow(rowNumber-1)) :+ 1
  }
}

pascalRow(3)
pascalRow2(3)


case class Catalog(index: Int, value: String)
case class Address(index: Int, street: String, name: String)
case class Product(index: Int, name: String, tax: Double)
