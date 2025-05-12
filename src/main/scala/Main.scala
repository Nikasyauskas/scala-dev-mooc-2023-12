import module1.opt.{Option => Opt}  
import module1.list.{List => Lst}
import module1.hof.p
object Main {

  def main(args: Array[String]): Unit = {
    val elem0 = Opt(1) zip Opt("3")
    val elem1 = Opt(3).filter(_ > 1)
    val elem2 = Opt(3).filter(_ > 5)
    println(s"Task 1:\n$elem0, $elem1, $elem2")


    println(s"Task 2:")
    val l1 = Lst(1, 2, 3)
    println(l1.mkString(", "))
    println(l1.reverse.mkString(", "))
    val strL = Lst("one","two","three")
    println(strL.map(_.toUpperCase()).mkString(", "))
//    println(strL.flatMap().mkString(", "))
    println(l1.filter(_ >= 2).mkString(", "))
  }
}