/*
Escribe una función que reciba un número entero y retorne su representación en binario, octal y Hexadecimal, también es necesario que pueda retornar el valor concatenado de los posibles tres valores.

NOTA: En caso de que no se envíe una de las cuatro posibles opciones(BINARY, OCTAL, HEXADECIMAL, ALL) se deberá de lanzar una excepción de tipo ConvertException
      No hacer uso de if else

Genrar el siguiente metodo:

  def convertDecimalTo( convertTo: String, value: Int ):String = ???

Ejemplo de entrada y salida:

  convertDecimalTo("BINARY", 20) => "10100"
  convertDecimalTo("OCTAL", 20) => "24"
  convertDecimalTo("HEXADECIMAL", 20) => "12"
  convertDecimalTo("ALL", 20) => "BINARY:10100 OCTAL:24 HEXADECIMAL:14"
 */

class ConvertException(message: String = None.orNull, cause: Throwable = None.orNull)
  extends RuntimeException(message, cause)

def convertDecimalTo( convertTo: String, value: Int ):String = {
  convertTo match {
    case "BINARY" => value.toBinaryString
    case "OCTAL" => value.toOctalString
    case "HEXADECIMAL" => value.toHexString
    case "ALL" => s"BINARY:${value.toBinaryString} OCTAL:${value.toOctalString} HEXADECIMAL:${value.toHexString}"
    case _ => throw new ConvertException()
  }
}