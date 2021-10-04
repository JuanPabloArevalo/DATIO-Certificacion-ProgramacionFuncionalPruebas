/*
Se requiere implementar una función que calcule el peso de una persona dependiendo en qué planeta se encuentre.
Recordando que la fórmula es la siguiente
    P = m x g
    Donde:
      * P = peso
      * m = masa
      * g = aceleración gravitacional

La aceleración gravitacional varía dependiendo el planeta, se deberá calcular para los siguientes:
    * Mercurio 3.70
    * Tierra 9.81
    * Saturno 11.67

Utilizando funciones de orden superior obten el peso en cada planeta.
Generar el siguiente metodo:
    def calcularPeso ...
      val pesoMercurio = mercurio (70)
      val pesoTierra = tierra (70)
      val pesoSaturno = saturno (70)

NOTA: Solo puedes implementar una sola función para resolver el problema
Ejemplo de entrada y salida:
  pesoMercurio => 259.0
  pesoTierra => 686.7
  pesoSaturno => 816.9
 */

def calcularPeso(gravedad: Double): Double => Double = {
  (masa: Double) => masa * gravedad
}

def calcularPeso (g:Double) = (masa: Double) => g*masa
val mercurio = calcularPeso(3.70)
val tierra = calcularPeso(9.81)
val saturno = calcularPeso(11.67)
val pesoMercurio = mercurio (70)
val pesoTierra = tierra (70)
val pesoSaturno = saturno (70)
println(pesoMercurio)
println(pesoTierra)
println(pesoSaturno)