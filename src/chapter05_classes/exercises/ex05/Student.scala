package chapter05_classes.exercises.ex05

/*
  Make a class Student with read-write JavaBeans properties
  name (of type String) and id (of type Long).
  What methods are generated? (Use javap to check.)
  Can you call the JavaBeans getters and setters in Scala?
  Should you?

  => javap output
    public class chapter05_classes.exercises.ex05.Student {
      public long id();
      public void id_$eq(long);
      public void setId(long);
      public java.lang.String name();
      public void name_$eq(java.lang.String);
      public void setName(java.lang.String);
      public long getId();
      public java.lang.String getName();
      public chapter05_classes.exercises.ex05.Student();
    }

 */

import scala.beans.BeanProperty

class Student {
  @BeanProperty var id: Long = _
  @BeanProperty var name: String = _
}

object Student {
  def main(args: Array[String]): Unit = {
    val student = new Student
    student.setId(1)
    student.setName("Alice")
    student.id = 2
    student.name = "Bob"
    println(student.getId)
    println(student.getName)
  }
}
