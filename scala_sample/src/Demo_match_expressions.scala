

object Demo_match_expressions {
  def main(args: Array[String]) {
    val age = "81";
    
    //statement
    
    /*
    age match {
      case "20" => println(age);
      case "30" => println(age);
      case "40" => println(age);
      case "50" => println(age);
      case "60" => println(age);
      case "70" => println(age);

      case _    => println("default");
    }
    
    //expression 
    val result1 = age match {
      case "20" => age;
      case "30" => age;
      case "40" => age;
      case "50" => age;
      case "60" => (age);
      case "70" => age;

      case _    => "default";
    }
    println("result is " +result1) */
    
    var i : Int = 5;
    i match {
      case 1|3|5|7| 9 => println("Odd")
      case 2|4|6|8|10 => println("Even")
      
    }
    
    
  }
}