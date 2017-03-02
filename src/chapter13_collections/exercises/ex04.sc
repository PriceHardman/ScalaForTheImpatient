/*
  Exercise 4
    Write a function that receives a
    collection of strings and a map
    from strings to integers. Return a
    collection of integers that are
    values of the map corresponding
    to one of the strings in the collection.
    For example, given
      Array("Tom", "Fred", "Harry")
    and
      Map("Tom" -> 3, "Dick" -> 4, "Harry" -> 5),
    return
      Array(3, 5).
    Hint: Use flatMap to combine the
    Option values returned by get.
 */

def valuesOf(arr: Array[String], map: Map[String,Int]): Array[Int] = {
  arr.flatMap(map.get)
}

valuesOf(
  Array("Hello","World"),
  Map("Goodbye" -> 1, "Cruel" -> 2, "World" -> 3)
)