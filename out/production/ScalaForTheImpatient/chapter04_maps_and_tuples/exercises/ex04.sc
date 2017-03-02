/*
  Repeat the preceding exercise with a sorted map,
  so that the words are printed in sorted order.
 */

import scala.collection.immutable.SortedMap

def wordFrequencies(file: String): SortedMap[String,Int] = {
  val source = scala.io.Source.fromFile(file)
  var wordFreqs: SortedMap[String,Int] = SortedMap()
  val addOrIncrement: (String) => Unit =
    (w) => wordFreqs += (w -> (wordFreqs.getOrElse(w,0)+1))

  source
    .mkString
    .split("\\s+")
    .map(_.toLowerCase)
    .foreach(addOrIncrement)
  wordFreqs
}


val file = "/Users/hardmanp/" +
  "IdeaProjects/ScalaForTheImpatient/src/" +
  "chapter04_maps_and_tuples/" +
  "exercises/hamlet.txt"


for((word,f) <- wordFrequencies(file)){
  println(s"$word: $f")
}