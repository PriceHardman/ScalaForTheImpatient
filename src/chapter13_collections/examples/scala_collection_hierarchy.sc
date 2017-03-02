/*
  An iterable is any collection that can yield
  an Iterator with which you can access all
  elements in the collection.

  There are three general traits that fall under
  the umbrella of Iterable: Seq, Set, and Map

  The key traits in the overall hierarchy are:

  IndexedSeq <-- Seq <--
                         \
  SortedSet <-- Set <----- Iterable
                         /
  SortedMap <-- Map <---

  Whereas a Seq is an ordered sequence of elements,
  IndexSeq allows fast random access through an
  integer index.

  Set is an unordered collection of values, but
  a SortedSet allows elements to be visited in
  a sorted order.

  Map is a set of key value pairs, with SortedMap
  allowing for visiting elements as sorted by
  the keys.


  Scala supports both mutable and immutable collections.
  The language gives preference to immutable ones, with
  scala.collection containing immutable collections.
  To get mutable ones, import scala.collection.mutable
  and access them with mutable.{collection}.


  The most important immutable sequences are:
    Vector: Indexed, so offers very fast lookups by index
    Range:  Represents integer sequence. Also indexed for fast lookup.
    List:
    Stream:
    Stack:
    Queue:
 */


