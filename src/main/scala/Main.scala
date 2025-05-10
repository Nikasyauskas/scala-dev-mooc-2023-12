import module1.opt.{Option => O}  
import module1.list.{List => L}
object Main {

  def main(args: Array[String]): Unit = {
    val elem0 = O(1) zip O("3")
    val elem1 = O(3).filter(_ > 1)
    val elem2 = O(3).filter(_ > 5)
    println(s"$elem0, $elem1, $elem2")

    val l1 = L(1, 2, 3)
    println(l1.mkString(", "))
    println(l1.reverse.mkString(", "))

  }
}