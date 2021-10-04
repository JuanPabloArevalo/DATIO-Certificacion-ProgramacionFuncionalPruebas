/*
Se requiere implementar una función que resuelva una ecuación de segundo grado con las siguientes caracteriscas:

  * Deberán poder calcular cuando se suma y cuando se resta, recibiendo como argumentos el valor cuadrático, el lineal y el constante
  * Deberá utilizar una función de orden superior

Genrar el siguiente metodo:

  def ecuacionSegundoGrado( f:(Int, Int, Int) => Double, a:Int, b:Int, c:Int) =  ???

NOTA: La expresión if está prohibida en este ejercicio

Ejemplo de entrada y salida:

  ecuacionSegundoGrado(x1, 1, -5, 6) => 3.0
  ecuacionSegundoGrado(x2, 1, -5, 6) => 2.0
*/

val x1 = (a:Int, b:Int, c:Int) => (-b+Math.sqrt( Math.pow(b, 2)-4*a*c) )/(2*a)
val x2 = (a:Int, b:Int, c:Int) => (-b-Math.sqrt( Math.pow(b, 2)-4*a*c) )/(2*a)
def ecuacionSegundoGrado( f:(Int, Int, Int) => Double, a:Int, b:Int, c:Int) = f(a, b, c)

println ( ecuacionSegundoGrado(x1, 1, -5, 6) )
println ( ecuacionSegundoGrado(x2, 1, -5, 6) )
