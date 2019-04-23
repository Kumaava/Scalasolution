
object Demo_for_loop {
  def main(args: Array[String]) {

    //    for (i <- 1.to(5)) {
    //      println(i);
    //    }

    //    for (i <- 1 until 6) {
    //      println(i);
    //    }

    //    for (i <- 1 to 3; j <- 1 to 3; k<- 1 until 3) {
    //      println(i + " - nested j value is " + j + " - nested k value is " + k );
    //    }

    val lst = List(1, 2, 3, 4, 5, 6, 5.5, 9.0);

//    for (i <- lst) {
//      println("values in list is " + i);
//    }
//
//    for (i <- lst; if i < 6) {
//      println("i is using filters " + i);
//    }

    println(for {i <- lst  if i < 6} yield { i*i});
    
  }
}