package chapter05_classes.examples.ex06

import scala.collection.mutable.ArrayBuffer

/*
  In Scala, you can nest just about anything in anything else.
 */

class Network {
  class Member(val name: String) {
    val contacts = new ArrayBuffer[Member]
  }

  private val members = new ArrayBuffer[Member]

  def join(name: String) = {
    val m = new Member(name)
    members += m
    m
  }
}

object Network {
  def main(args: Array[String]): Unit = {
    // Consider two networks:
    val chatter = new Network
    val myFace  = new Network

    /*
      In Scala, each instance has its own class Member, just like
      each instance has its own fields members. That is, chatter.Member
      and myFace.Member are DIFFERENT CLASSES. This is different from Java,
      where an inner class belongs to the outer class.
      The Scala approach is more regular. To make a new inner object, we
      simply use the new with the type name: new chatter.Member. In Java,
      you'd need special syntax: chatter.new Member().
     */
    val fred = chatter.join("Fred")
    val wilma = chatter.join("Wilma")
    fred.contacts += wilma // fred.Contacts is an ArrayBuffer[chatter.Member]
    val barney = myFace.join("Barney") // Barney is a myFace.Member

    // We cannot add barney to fred.contacts, because that would be an attempt
    // to add a myFace.Member to an ArrayBuffer containing objects of type
    // chatter.Member.
    // fred.contacts += barney // ERROR
  }
}

// While this setup likely makes sense for networks of people, it is
// possible to have Network.Member be the same class across instances
// of Network.
object Network2 {
  class Member(val name: String){
    val contacts = new ArrayBuffer[Member]
  }
}
class Network2{
  private val members = new ArrayBuffer[Network2.Member]
}