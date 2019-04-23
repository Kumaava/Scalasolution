/* Currying is the technique of transforming a function that 
takes multiple arguments into a function that takes a single argument*/

object Demo_Func_Currying {
  def add(x:Int, y:Int) = x+y;
  
  def add2(x:Int) = (y:Int) => x+y;
  
  //scala technique (second signature)
  def add3(x:Int)(y:Int) = x+y;
  
  def main(args:Array[String]){
    println("ln")
 
    println(add(20,10));
    println(add2(20)(10));
    
    val sum40 = add2(40);
    println(sum40(100));
    println(add3(100)(200));
    
    val sum5 = add3(30)_;
    println(sum5(400))
    println("kilo")
  }
 }
