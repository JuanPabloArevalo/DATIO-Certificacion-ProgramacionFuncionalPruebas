object Main extends App {

  class PrintOps() {
    def print(implicit i: Int) = println(i);
  }

  implicit def str2PrintOps(s: Double): PrintOps = {
    println("str2PrintOps")
    new PrintOps
  }

  implicit def str2int(implicit s: String): Int = {
    println("str2int")
    Integer.parseInt(s)
  }

  implicit def getString = {
    println("getString")
    "123"
  }

  00.00.print
}


// El siguiente código tendrá tres conversiones implícitas
// Primero, el compilador encontró que el tipo String no tiene método de impresión
// Prueba la conversión implícita, usa el método str2PrintOps para convertir String
// Convertir a PrintOps (primera vez)
// Luego llama al método de impresión, pero el método de impresión acepta parámetros enteros implícitos
// En este momento, el compilador buscará el valor implícito, pero no se da en el programa.
// El compilador intentará llamar al método str2int para la conversión implícita, pero este método
// Acepte un parámetro de tipo String implícito, el compilador lo intentará de nuevo
// Encuentra un valor implícito correspondiente, no hay en este momento, por lo que el compilador intentará llamar
// La cadena correspondiente al método getString (esta es la segunda conversión implícita,
// Obtener una cadena, el proceso desde cero)
// Después de obtener la cadena, llame al método str2int para convertir la cadena de tipo String
// Convertido a tipo Int (esta es la tercera conversión implícita)

