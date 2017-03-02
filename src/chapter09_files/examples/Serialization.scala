import java.io._
/*
  In Java, serialization is used to transmit objects between
  JVMs, or for short-term storage.

  In Scala, we can perform serialization and deserialization
  quite easily:
 */

@SerialVersionUID(42L) // optional. Omission sets a default ID.
class MyClass(val myField: Int) extends Serializable {
  def myMethod(): Unit = println("myField = " + this.myField)
}

object MyClass {
  def main(args: Array[String]): Unit = {
    val myObject = new MyClass(10)
    val out = new ObjectOutputStream(new FileOutputStream("/tmp/test.obj"))
    out.writeObject(myObject) // Serialize to /tmp/test.obj
    out.close()

    val in = new ObjectInputStream(new FileInputStream("/tmp/test.obj"))
    val savedObject = in.readObject().asInstanceOf[MyClass]
    savedObject.myMethod()

    new File("/tmp/test.obj").delete() // Delete the serialized object.
  }
}