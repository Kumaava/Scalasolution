import java.util.Date

// A closures is a function which uses one or more variables 
// declared outside the function

/* when we execute a closure, it takes the last defined value of that 
 	variable
 */

object Demo_closures {
  
  // if variable value can change, impure closure.. if value is
  // defined by val, it is a pure closure
  
  val num  = 10 ;
  val add = (x : Int) => { 
     x + num;
  }
   
  def main(args: Array[String]){
    val num = 20 ;
    println(add(20));
    println(num); 
  }
}