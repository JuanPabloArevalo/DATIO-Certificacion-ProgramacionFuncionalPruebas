/*
Descripcion:
Se tiene una lista de nombres y una lista de consulta de nombres.
Para cada consulta, se debe determinar cuántas veces aparece en la lista de nombres.
Ejemplo:

  Teniendo como entradas:

    * nombres = [“Brenda”,”Brenda”,”Jorge”,”Anais”]
    * consulta = [“Jorge”,”Brenda”,”Angelica”]

  Se debe retornar una lista con el número de ocurrencias, por lo que en este caso retornaremos la lista:

    * resultados = [1,2,0]

Generar el siguiente metodo:

  def consultaNombres (List[String], List[String]): List[Int]

Ejemplo de entrada y salida:

  consultaNombres(nombres, consulta) => resultados = [1,2,0]

 */

def consultaNombres(nombres:  List[String], consultas: List[String]): List[Int] = {
  consultas.map(nombeBuscar => nombres.count(_.equals(nombeBuscar)))
}

def consultaNombres2(nombres:  List[String], consultas: List[String]): List[Int] = {
  consultas.map(consulta => nombres.groupBy(identity).map(tupla => (tupla._1, tupla._2.length)).getOrElse(consulta, 0))
}

consultaNombres(List("Brenda","Brenda","Jorge","Anais"), List("Jorge","Brenda","Angelica"))
consultaNombres2(List("Brenda","Brenda","Jorge","Anais"), List("Jorge","Brenda","Angelica"))