/*
  Operators can be used to build DSLs. Implicit conversions
  are another tool facilitating the creation of domain-specific
  languages.
  This chapter also discusses the special methods apply,
  update, and unapply.
 */


/*
  Identifiers:
    Identifiers are the names of variables, functions, and so on.
    As in Java, unicode characters are valid identifiers, and their
    use as such is limited only by the convenience of typing them:
 */
def √(x: Double): Double = scala.math.sqrt(x)
√(2)

// To use a reserved word as an identifer,
// enclose it in backquotes:
val `var` = "yield"

/*
  Associativity:
  In Scala, all operators are left-associative
  (evaluate left to right) EXCEPT:
    - Operators ending in a colon (e.g. +:)
    - Assignment operators
 */
// So
1 :: 2 :: Nil // evaluates as
1 :: (2 :: Nil) // ==
1 :: List(2) // ==
List(1,2)


/*
  The apply and update methods:
    Scala lets you extend the function
    call syntax to values other than
    functions. Suppose that f is not
    a function or method, then the
    expression
      f(arg1,arg2, ...)
    is merely syntactic sugar for
      f.apply(arg1, arg2, ...).

    The only exception to this is if
      f(arg1, arg2, ...) = value
    falls on the
    left hand side of an assignment,
    in which case its shorthand for
      f.update(arg1, arg2, ..., value)
 */
class Fraction(val n: Int, val d: Int) {
  def *(other: Fraction) = {
    Fraction(this.n * other.n, this.d * other.d)
  }
}
object Fraction {
  // Apply lets us conveniently make a factory
  def apply(n: Int, d: Int) = new Fraction(n, d)
}
// Not having to call new means we can
// do handy things like:
val f = Fraction(3,4) * Fraction(2,5)
