import scala.io.Source

// Streams offer an immutable alternative to
// the iterators, which are mutable. A stream
// is an immutable list in which the tail is
// computed lazily.
def numsFrom(n: BigInt): Stream[BigInt] = n #:: numsFrom(n+1)

// The #:: operator is like the :: operator for lists, but it
// constructs a stream.
// We can then apply operations lazily on the stream

numsFrom(10)
  .map(x => x*x)
  .take(10)
  .foreach(println)


/*
  One can also construct a stream from
  an iterator, like so:
 */
val words = Source
  .fromFile("/usr/share/dict/words")
  .getLines
  .toStream

// Get the three longest words
words.sortBy(-_.length)
  .take(3)
  .foreach(println)

// Count words
words.length
