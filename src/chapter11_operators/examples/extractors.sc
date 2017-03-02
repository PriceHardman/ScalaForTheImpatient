/*
  An extractor is an object with an unapply method.
  Think of unapply as the inverse operation
  of apply. Whereas apply takes construction
  parameters and turns them into an object,
  unapply takes an object and extracts values
  from it -- usually the values with which
  the object was constructed.
  Continuing our previous Fraction example:
 */
class Fraction(val n: Int, val d: Int) {
  def *(other: Fraction): Fraction = (this,other) match {
    case (Fraction(n1,d1),Fraction(n2,d2)) => Fraction(n1*n2,d1*d2)
  }
}
object Fraction {
  // Generally unapply should return an Option,
  // since a pattern match can fail.
  def apply(n: Int, d: Int) = new Fraction(n,d)
  def unapply(input: Fraction) =
    if (input.d == 0) None else Some((input.n, input.d))
}

val reciprocals = Fraction(1,2) * Fraction(2,1)


// UnapplySeq allows extraction of arbitrary
// sequences of values.
class MyString(private val s: String){}
object MyString {
  def apply(s: String) = new MyString(s)
  def unapplySeq(myString: MyString): Option[Seq[String]] =
    if (myString.s.trim == "") None else Some(myString.s.trim.split("\\s+"))
}

val s = MyString("a b c")
// Now we can match any number of variables
s match {
  case MyString("") => "Empty String"
  case MyString(a) => "One Word"
  case MyString(a,b) => "Two Words"
  case MyString("a","b","c") => "Specifically 'a b c'"
  case MyString(a,b,c) => "Three Words"
}
