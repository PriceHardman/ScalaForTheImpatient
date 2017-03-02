/*
  Exercise 5:
  Implement a function that works just
  like mkString, using reduceLeft.
 */

def mkString(x: Seq[Any],sep: String = ""): String = {
  x.reduceLeft((s,elem) => s + sep + elem.toString)
    .toString
}

mkString(Array(1,2,3))
mkString(Array(1,2,3),", ")