/*
  For regular expressions, we use scala.util.matching.Regex.

  To construct a Regex object, call the r method on a string.
 */
val numPattern = "[0-9]+".r

// If regexes contain backslashes or quotes, its a good
// idea to use the "raw" string syntax by enclosing in
// triple double quotes.
var wsnumwsPattern = """\s+[0-9]+\s+""".r // is easier to read than equivalent
wsnumwsPattern = "\\s+[0-9]+\\s+".r

// The findAllIn method returns an iterator through
// the matches.
for(n <- "\\d".r.findAllIn("867-5309")) println(n)

// Or we can put the matches into a collection:
"\\d".r.findAllIn("867-5309").toList

// We can also use regexes to perform replacements
"\\d".r.replaceAllIn("867-5309","#")

/*
  Groups are useful to get subexpressions of regexes.
  To match groups, use the regex object as an
  extractor (see Chapter 14 for extractors):
 */
val numitemPattern = "([0-9]+) ([a-z]+)".r
val numitemPattern(num,item) = "99 bottles"
println(num,item)

// To extract groups from multiple matches, use
// a for statement like this:
for(numitemPattern(num,item) <- numitemPattern.findAllIn("99 bottles, 98 bottles")){
  println(num,item)
}

