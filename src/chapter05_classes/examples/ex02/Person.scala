package chapter05_classes.examples.ex02

/*
  Properties with getters and setters:

  Scala provides getter and setter methods for every field.
 */

class Person {
  var age = 0 // Public by default. And since var it can be set, in addition to got.
  /*
    Under the hood, Scala generates a class for the JVM with a private
    age field and getter and setter methods for it. These methods are
    declared as public because we didn't declare age as private.
    In Scala, the getter and setter methods are called age and age_=.
    For example,
      val person = new Person()
      person.age = person.age + 1

    actually results in the call
      person.age_=(person.age() + 1)

    We can see this ourselves by decompiling the Person class
    file with javap:
      public class chapter05_classes.examples.ex02.Person {
        public static void main(java.lang.String[]);      // The main method of the companion class
        public int age();                                 // Public age() getter method
        public void age_$eq(int);                         // Public age_= setter method (= encoded as $eq)
        public chapter05_classes.examples.ex02.Person();  // Primary constructor.
      }
   */

  // We are however free to redefine the getters and setters as needed:
  private var myPrivateField = 0 // make field private and rename
  def privateField = myPrivateField
  def privateField_=(newValue: Int) = {
    // arbitrary logic
    myPrivateField = newValue
  }
}

object Person {
  def main(args: Array[String]): Unit = {
  }
}


