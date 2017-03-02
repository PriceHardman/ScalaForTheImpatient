import scala.collection.mutable
/*
  Exercise 3:
  Write a function that removes all
  zeroes from a linked list of integers.
 */

def filterZeroes(x: mutable.LinkedList[Int]) =
  x.filter(_ != 0)

val x = mutable.LinkedList(0,1,0,2,0,3)

filterZeroes(x)

