/*
  Print a table of all Java properties, like this:
java.runtime.name       | Java(TM) SE Runtime Environment
sun.boot.library.path   | /home/apps/jdk1.6.0_21/jre/lib/i386
java.vm.version         | 17.0-b16
java.vm.vendor          | Sun Microsystems Inc.
java.vendor.url         | http://java.sun.com/
path.separator          | :
java.vm.name            | Java HotSpot(TM) Server VM

You need to find the length of the longest key before you can print the table.
 */

import scala.collection.JavaConversions.propertiesAsScalaMap

val props: scala.collection.Map[String,String] = System
  .getProperties
  .filter({case (k,v) => v.length < 50}) // filter out long values

// We'll place the separator 3 sports further
// than the length of the longest key.
val sep_col = props.keys.map(_.length).max + 3

for((k,v) <- props){
  // Print the key, then print (sep_col - len(key)) spaces,
  // then a vertical bar, a space, and the value
  val key_buffer = " "*(sep_col - k.length)
  println(s"$k$key_buffer| $v")
}