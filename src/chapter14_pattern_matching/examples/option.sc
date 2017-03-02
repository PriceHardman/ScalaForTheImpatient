/*
  The Option type in the
  standard library uses case
  classes to express values
  that might or might not
  be present. The case subclass
  Some wraps a value. None
  indicates there is no value.
 */

// Map.get returns an Option
val map = Map(3 -> "three", 2 -> "two")

// We can use pattern matching to get
// the value out of the option
map.get(3) match {
  case Some(value) => println(value)
  case None => println("No value")
}

// This can be shortened to
map.getOrElse(3,"No value")