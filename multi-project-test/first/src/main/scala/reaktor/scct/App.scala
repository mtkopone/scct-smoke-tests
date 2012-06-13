package reaktor.scct

object App {
  def foo(x : Array[String]) = x.foldLeft("")((a,b) => a + b)
  
  def bar(x : Array[String]) = {
    x.foldLeft("")((a,b) => a + b)
  }

  def thisGetsCalledFromDependentProjectSecond(x : String) = {
    if (x.length > 1)
      x.substring(0, 1)
    else
      x
  }
  
  def main(args : Array[String]) {
    println( "Hello World!" )
    println("concat arguments = " + foo(args))
  }
}
