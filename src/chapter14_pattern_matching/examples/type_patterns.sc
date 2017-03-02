// You can match on the
// type of an expression,
// for example:
import scala.util.Random

val choices = List(1,"2",BigInt(3),Array(4,5,6))
val choice = choices(Random.nextInt(choices.length))
choice match {
  case x: Int => x
  case s: String => Integer.parseInt(s)
  case _: BigInt => Int.MaxValue
  case _ => 0
}