/*
  What do the take, drop, takeRight, and dropRight string functions do?
  What advantage or disadvantage do they have over using substring?
 */
val s = "Hello World"
s.take(3) // selects the first n=3 elements: "Hel"
s.drop(3) // Returns all but the first n=3 elements: "lo World"
s.takeRight(3) // Selects the last n=3 elements, "rld"
s.dropRight(3) // Selects all but the last n=3 elements, "Hello Wo"

// These have the advantage over substring() that one need
// not deal in indices.