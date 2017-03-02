/*
  Exercise 6:
  Given a list of integers lst, what is
    (lst :\ List[Int]())(_ :: _)?
    (List[Int]() /: lst)(_ :+ _)?
  How can you modify one of them to reverse the list?
 */

val lst = List(1,2,3,4,5)
(lst :\ List[Int]())(_ :: _) // is equivalent to
lst.foldRight(List[Int]())((elem, coll) => elem :: coll)
// Which rebuilds lst from right to left using
// prepend(::).

(List[Int]() /: lst)(_ :+ _) // is equivalent to
lst.foldLeft(List[Int]())((coll, elem) => coll :+ elem)
// Which rebuilds lst from left to right using
// append(:+)

// We could reverse lst by doing
(List[Int]() /: lst)((coll,elem) => elem :: coll) // or
lst.foldLeft(List[Int]())((coll,elem) => elem :: coll)
// We're still foldLeft-ing, but in our lambda
// we've switched from appending to prepending,
// so that they get inserted in reverse order.