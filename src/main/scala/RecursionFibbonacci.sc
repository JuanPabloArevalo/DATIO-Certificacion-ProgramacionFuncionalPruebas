
// This method is created to generates a StackOverflowError, comment or uncomment line where executes this function to test this error
def fibonacciExample1(wl_n:Int):Int = {
  if (wl_n equals 0|1 ) wl_n
  else fibonacciExample1(wl_n - 1) + fibonacciExample1(wl_n - 2)
}

// This method is created to recursive example, if wl_n is a big number the performance degrades and may creates a StackOverflowError
def fibonacciExample2(wl_n:Int):Int = wl_n match {
  case 0|1 => wl_n
  case _ => fibonacciExample2(wl_n - 1) + fibonacciExample2(wl_n - 2)
}

// This method is created to tail recursive example to avoid performance degrades and StackOverflowError
def fibonacciExample3(wl_n:Int):Int = {
  def fibonacciTailRecursive(wl_n:Int,wl_a:Int,wl_b:Int):Int = wl_n match {
    case 0 => wl_a
    case _ => fibonacciTailRecursive(wl_n - 1, wl_b, wl_a + wl_b)
  }
  fibonacciTailRecursive(wl_n, 0,1)
}



val wl_n:Int = 1000000 // with this value, the fibonacciExample2 creates a StackOverflowError
//val wl_n:Int = 70 // with this value, the fibonacciExample2 creates a lot performance degrades
//val wl_n:Int = 50 // with this value, the fibonacciExample2 creates a performance degrades
//val wl_n:Int = 40 // with this value, the fibonacciExample2 performance is still good
//val wl_n:Int = 10 // with this value, the fibonacciExample1 and fibonacciExample2 performance is the same

println("start recursiveObject object:"+java.time.LocalDateTime.now.toString)

//println("start fibonacciExample1:"+java.time.LocalDateTime.now.toString)
//println(fibonacciExample1(wl_n))

//println("start fibona<cciExample2:"+java.time.LocalDateTime.now.toString)
//println(fibonacciExample2(wl_n))

println("start fibonacciExample3:"+java.time.LocalDateTime.now.toString)
println(fibonacciExample3(wl_n))

println("end recursiveObject object:"+java.time.LocalDateTime.now.toString)
