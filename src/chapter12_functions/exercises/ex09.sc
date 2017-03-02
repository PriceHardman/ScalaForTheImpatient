/*
  Exercise 9:
  Implement corresponds without currying.
  Then try the call from the preceding exercise.
  What problem do you encounter?
 */

def corresponds(x: Seq[String], y: Seq[Int],p: (String,Int) => Boolean) = {
  x.zip(y).map{case (s,i) => p(s,i)}.forall(_ == true)
}

val strings = "To be or not to be".split(" ")
val lengths = Array(2,2,2,3,2,2)

corresponds(strings,lengths,(s,l) => s.length == l)

/*
  The only difference is that we aren't calling corresponds
  as a method on one of the sequences. Other than that, seems
  to work okay.
 */