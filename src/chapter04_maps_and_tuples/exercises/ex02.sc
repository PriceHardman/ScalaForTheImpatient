import java.io.File
import java.util.Scanner

/*
  Write a program that reads words from a file. Use a mutable map
  to count how often each word appears. To read the words,
  simply use a java.util.Scanner:
  val in = new java.util.Scanner(new java.io.File("myfile.txt"))
  while (in.hasNext()) process in.next()
  Or look at Chapter 9 for a Scalaesque way.
  At the end, print out all words and their counts.
 */

val file = "/Users/hardmanp/" +
  "IdeaProjects/ScalaForTheImpatient/src/" +
  "chapter04_maps_and_tuples/" +
  "exercises/hamlet.txt"

def wordFrequenciesImperative(file: String): scala.collection.mutable.Map[String,Int] = {
  val wordFreqs: scala.collection.mutable.Map[String,Int] = scala.collection.mutable.Map()
  val in = new Scanner(new File(file))
  while(in.hasNext()){
    val word = in
      .next()
      .replaceAll("[^a-zA-Z ]","")
      .toLowerCase
    wordFreqs(word) = wordFreqs.getOrElse(word,0) + 1
  }
  return wordFreqs
}

def wordFrequenciesScalaesque(file: String): scala.collection.mutable.Map[String, Int] = {
  val source = scala.io.Source.fromFile(file)
  val wordFreqs: scala.collection.mutable.Map[String,Int] = scala.collection.mutable.Map()
  val addOrIncrement: (String) => Unit =
    (w) => wordFreqs(w) = wordFreqs.getOrElse(w,0)+1

  source
    .mkString
    .split("\\s+")
    .map(_.toLowerCase)
    .foreach(addOrIncrement)
  return wordFreqs
}

//for((word,f) <- wordFrequenciesImperative(file)){
//  println(s"${word}: ${f}")
//}
for((word,f) <- wordFrequenciesScalaesque(file)){
  println(s"$word: $f")
}

