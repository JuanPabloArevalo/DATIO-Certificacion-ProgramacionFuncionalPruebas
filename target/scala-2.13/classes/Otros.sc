object Main extends App {
  class PrintOps() {
    def print(implicit i: Int) = println(i);
  }

  implicit def str2PrintOps(s: String) = {
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

  "A".print
}

