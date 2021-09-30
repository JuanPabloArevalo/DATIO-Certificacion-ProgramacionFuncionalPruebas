object ImplicitoMetodos extends App {

  implicit class ClaseA(booleano: Boolean) {
    def metodoNormal(): String = {
      booleano match {
        case true => "Es un booleano HP"
        case _ => "Es un Mauricio HP"
      }
    }
    def metodoInt(): Int = {
      1
    }
  }

  println(false.metodoNormal)
  println(true.metodoInt)
}

