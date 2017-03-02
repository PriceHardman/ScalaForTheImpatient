package chapter07_packages.exercises.ex06

/*
  Write a program that copies all elements from a Java
  hash map into a Scala hash map. Use imports to
  rename both classes.
 */

import java.util.{HashMap => JavaHashMap}
import scala.collection.mutable.{HashMap => ScalaHashMap}
import scala.collection.JavaConversions.mapAsScalaMap

object Main {
  def copy(from: JavaHashMap[Int,String], to: ScalaHashMap[Int,String]): Unit = {
    for((k,v) <- from) to.put(k,v)
  }
  def main(args: Array[String]): Unit = {
    val a = new JavaHashMap[Int,String]()
    val b = new ScalaHashMap[Int,String]()
    a.put(1,"one")
    a.put(2,"two")
    a.put(3,"three")
    copy(a,b)
    println(b)
  }
}
