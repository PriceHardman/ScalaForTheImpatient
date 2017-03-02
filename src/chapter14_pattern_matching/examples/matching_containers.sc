// We can match containers also:
val arr = Array(1,2,3)

arr match {
  case Array(0) => "0"
  case Array(x,y) => s"$x $y"
  case Array(1, _*) => "1 ..."
  case _ => "Something else"
}


/*
  The capability to pattern match
  on the contents of containers
  is through extractors, which are
  objects with an unapply() and
  unapplySeq() method to extract
  values from an object.
 */