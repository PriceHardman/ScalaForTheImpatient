// Here's the equivalent
// of a C-style switch
// statement in Scala:
var sign = 0
val ch: Char = '+'

// Assigning within the match.
ch match {
  case '+' => sign = 1
  case '-' => sign = -1
  case _ => sign = 0 // _ is default, and prevents MatchError
}


// Match is an expression, so
// we an do this instead:
sign = ch match {
  case '+' => 1
  case '-' => -1
  case _ => 0
}

// We could use a guard clause:
ch match {
  case '+' => sign = 1
  case '-' => sign = -1
  case c if Character.isDigit(c) => c
  case _ => 0
}