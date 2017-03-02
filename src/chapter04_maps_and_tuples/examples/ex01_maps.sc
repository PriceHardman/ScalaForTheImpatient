val scores = Map(
  "Alice" -> 10,
  "Bob" -> 3,
  "Cindy" -> 8
)

// A pair is a grouping of two values, not necessarily of the same type.
// Pairs are created with the -> operator. We can see that -> is just a method.
// The expression a -> b has the value (a,b)
"Alice".->(10) // (String, Int) = (Alice,10)

// Maps are simply collections of pairs.

val moreScores = Map(
  "Dave" -> 2,
  ("Evan",3), // we can declare Map elements both ways.
  "Fran" -> 7
)

// We access map values by
scores("Bob")

// Exceptions are thrown for nonexistent map keys:
// scores("bad") // java.util.NoSuchElementException: key not found: bad

// We can either make sure the key exists, or set a default value
scores.contains("bad")
scores.getOrElse("Bad",0)




// In a mutable map, we can update the values
val m = scala.collection.mutable.Map("key1" -> 1, "key2" -> 2)
m.update("key1",3)
m

// Iterating over maps:
for((k,v) <- scores) println(s"scores(${k}) \t= ${v}")

for((k,v) <- scores) yield (v,k) // swap keys with values

scores.keySet // returns the keys as a set
scores.values // Iterable of the values

// Sorted maps:
// By default maps are unsorted and are implemented as hash tables.
// If you want to visit the keys in sorted order, or don't have keys/
// that would hash well, Scala lets you use a map implemented as a balanced
// tree: SortedMap.
val sortedScores = scala.collection.immutable.SortedMap("Alice" -> 10, "Bob" -> 5)
