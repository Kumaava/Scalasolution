import java.util.Date

object Demo_partiallyapplied_func {
  
  def log(date : Date, message : String) = {
    println(date + " " + message);
  }
  
  def main(args:Array[String]){
    val sum = (a:Int, b: Int, c:Int ) => a+b+c
    println(sum(10, 20,30));
    
  // Implementing partially applied function
  val f = sum(10, _:Int, _: Int)
  println(f(30, 130))
  
  val date = new Date;
  
  val newlog = log(date, _ : String);
  
  newlog("The message 1");
  }
}