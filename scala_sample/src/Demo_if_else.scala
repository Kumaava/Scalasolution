
object Demo_if_else {
  def main(args: Array[String]){
    val x:Int = 10;
    var res = "";
    var y:Int = 31;
    
    /*if (x == 20){res = "x == 20";} else {res = "x != 20";}
    println(res); */
    
    println( if (x >= 20 || y==30) "x >= 20 " else "x <= 20");
    }
  }