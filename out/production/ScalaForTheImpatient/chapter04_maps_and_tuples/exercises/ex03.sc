/*
  3. Repeat the preceding exercise with an immutable map.
 */


def wordFrequencies(file: String): Map[String, Int] = {
  val source = scala.io.Source.fromFile(file)
  var wordFreqs: Map[String,Int] = Map()
  val addOrIncrement: (String) => Unit =
    (w) => wordFreqs += (w -> (wordFreqs.getOrElse(w,0)+1))

  source
    .mkString
    .split("\\s+")
    .map(_.toLowerCase)
    .foreach(addOrIncrement)
  return wordFreqs
}


val file = "/Users/hardmanp/" +
  "IdeaProjects/ScalaForTheImpatient/src/" +
  "chapter04_maps_and_tuples/" +
  "exercises/hamlet.txt"

for((word,f) <- wordFrequencies(file)){
  println(s"$word: $f")
}