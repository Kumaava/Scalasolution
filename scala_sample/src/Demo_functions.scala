

object Demo_functions {

  object math {
    
    def +(x: Int = 45, y: Int = 50): Int = x + y;
    def *(x: Int, y: Int): Int = x * y;
    def /(x: Int, y: Int) = x / y;
    def -(x: Int, y: Int) = x - y;
    def **(x: Int) = x * x;
    
  }
  
  def print(x:Int, y:Int): Unit = {
    println(x+y);
  }
  
  def main(args: Array[String]) {
    
    //Anonymous function 
    var add = (x : Int, y : Int) => x+y 
    println(add(300,500))
    val sum = 10+20
    print(100, 200)
    println(math.+(3))
    println(math **(3))
  }
}



