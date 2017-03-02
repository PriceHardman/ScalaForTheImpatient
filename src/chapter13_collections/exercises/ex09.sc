/*
  Exercise 9:
  Harry Hacker writes a program that accepts
  a sequence of file names on the command line.
  For each, he starts a new thread that
  reads the file and updates a letter frequency
  map, declared as
    val frequencies = new scala.collection.mutable.HashMap[Char, Int]
      with scala.collection.mutable.SynchronizedMap[Char, Int]
  When reading a letter c, he calls
    frequencies(c) = frequencies.getOrElse(c, 0) + 1
  Why won’t this work? Will it work if he used instead
    import scala.collection.JavaConversions.asScalaConcurrentMap
    val frequencies: scala.collection.mutable.ConcurrentMap[Char, Int] =
      new java.util.concurrent.ConcurrentHashMap[Char, Int]
 */

/*
  It won't work because concurrently mutating a synchronized
  data structure is not a threadsafe operation.
 */
