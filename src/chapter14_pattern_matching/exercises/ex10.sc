/*
  Write a function that composes two functions of type Double => Option[Double],
  yielding another function of the same type. The composition should yield None
  if either function does. For example,
    def f(x: Double) = if (x >= 0) Some(sqrt(x)) else None
    def g(x: Double) = if (x != 1) Some(1 / (x - 1)) else None
    val h = compose(f, g)
  Then h(2) is Some(1), and h(1) and h(0) are None.
 */

def compose(f: Double => Option[Double],
            g: Double => Option[Double]): Double => Option[Double] =
  (x: Double) => g(x) match {
    case None => None
    case Some(d) => f(d)
}

def f(x: Double) = if (x >= 0) Some(math.sqrt(x)) else None
def g(x: Double) = if (x != 1) Some(1 / (x-1)) else None
val h = compose(f,g)

h(2)
h(1)
h(0)