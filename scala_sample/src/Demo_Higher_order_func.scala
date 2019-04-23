

object Demo_Higher_order_func {
  
 //higher order functions i
 // take functions as arguments and return function as result
  
  //use an anonymous function as an argument for math function
  def math(x:Double, y:Double,z:Double, f:(
      Double, Double) => Double) : Double = f(f(x,y),z);
  
  def main(args: Array[String]){
    val result = math(50,20,10,(x,y)=> x max y)
    val result1 = math(50,20,10, _ + _) //windcard underscore , can use + -, *, min, max 
    
    println(result)
    println(result1)
    
  }
}