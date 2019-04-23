
object helloworld {
  def main (args : Array[String]) {
    val name = "Mark"
    val age : Double = 18.5
    
//  string interpolation 
    println(name + " is " + age + " years old ")
    
    // S String interpolation
    println(s"$name is $age years old")
    
    //f string interpolation
    println(f"$name%s is $age%f years old")
    
    //raw interpolation
    println(raw" Hello \n world")
    
    println(s"Hello \nworld")
    println("Hello, World!")
  }
}