

object Demo_while_dowhile {
  def main (args : Array[String]){
    var x = 1 ;
    
    // while loop explanation 
    while (x < 10) {
        println("x = " + x);
        x +=1;  //x = x + 1
    }
    
    var y = 0
    
    do {
      println("y  = " +y);
      y += 1 ;
    } while (y < 10);
  }
}