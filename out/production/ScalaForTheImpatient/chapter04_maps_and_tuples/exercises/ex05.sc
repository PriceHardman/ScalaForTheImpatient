/*
  Repeat the preceding exercise with a java.util.TreeMap that you adapt to the Scala API.
 */


import java.util

import scala.collection.JavaConversions.mapAsScalaMap
import scala.collection.mutable.Map

def wordFrequencies(file: String): Map[String,Int] = {
  val source = scala.io.Source.fromFile(file)
  var wordFreqs: Map[String,Int] = new util.TreeMap[String, Int]()
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