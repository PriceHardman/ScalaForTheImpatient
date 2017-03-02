import scala.util.Random

/*
  Case classes are a special kind of class
  that are optimized for use in pattern
  matching. Here, we'll extend a regular
  (noncase) class with some case classes:
 */
abstract class Amount
case class Dollar(value: Double) extends Amount
case class Currency(value: Double, unit: String) extends Amount

// Case classes for singletons
case object Nothing extends Amount

val amts = List(Dollar(0.99), Currency(12.34,"EUR"),Nothing)
val amt = amts(Random.nextInt(amts.length))

amt match {
  case Dollar(v) => s"$$$v"
  case Currency(_, u) => s"Oh noes! I got $u"
  case Nothing => ""
}

/*
  The copy() method and named parameters:
  The copy method of a case class makes
  a new object with the same values as an
  existing one. You can use named parameters
  to modify properties:
 */
val cur = Currency(29.95, "EUR")
val price = cur.copy(value = 19.95) // becomes Currency(19.95,"EUR")


/*
  When an unapply() method yields a pair,
  you can use infix notation in the
  case clause. In particular, you can use
  it with a case class that has two parameters:
 */
amt match {
  case a Currency u => s"Same as Currency($a, $u)."
  case _ =>
}


