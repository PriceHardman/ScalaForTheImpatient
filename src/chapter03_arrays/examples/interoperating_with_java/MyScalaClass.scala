package chapter03_arrays.examples.interoperating_with_java

/*
  Since Scala arrays are just Java arrays, it makes
  interoperating between the two languages very easy.
  Here, we take the Java array myJavaArray, which is
  a static member of the Java class MyJavaClass,
  assign it to a Scala val, and print it.
 */

object MyScalaClass {
  def main(args: Array[String]) {
    val myJavaArray: Array[Int] = MyJavaClass.myJavaArray
    println(myJavaArray.mkString("[",", ","]"))
  }
}
