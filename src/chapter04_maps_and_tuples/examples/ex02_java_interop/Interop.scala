package chapter04_maps_and_tuples.examples.ex02_java_interop

import scala.collection.JavaConversions.mapAsScalaMap
import scala.collection.JavaConversions.mapAsJavaMap

object Interop {
  def main(args: Array[String]): Unit ={
    val mapFromScala = (new MyScalaClass).myMap
    val mapFromJava: scala.collection.mutable.Map[String, Integer] = new MyJavaClass().myMap
    println("Scala: map(Alice) = " + mapFromScala("Alice"))
    println("Java: map(Alice) = " + mapFromJava("Alice"))
  }
}
