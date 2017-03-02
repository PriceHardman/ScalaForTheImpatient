/*
  Exercise 8:
  In Section 12.8, “Currying,” on page 149, you saw the
  corresponds method used with two arrays of strings.
  Make a call to corresponds that checks whether the
  elements in an array of strings have the lengths given
  in an array of integers.
 */

val strings = "To be or not to be".split(" ")
val lengths = Array(2,2,2,3,2,2)

strings.corresponds(lengths)((s,l) => s.length == l)