package chapter07_packages.exercises.ex01

/*
  Write an example program to demonstrate that
    package com.horstmann.impatient
  is not the same as
    package com
    package horstmann
    package impatient

 */

package com.horstmann {
  object Foo {
    def sayHello() = println("com.horstmann")
  }
}

package com {
  package horstmann {
    package impatient {
      object Bar {
        def callFoo() = {
          Foo.sayHello() // can call Foo directly.
        }
      }
    }
  }
}

package com.horstmann.impatient {
  object Baz {
    def callFoo() = {
      com.horstmann.Foo.sayHello() // have to fully qualify Foo
    }
  }
}

object Main {
  def main(args: Array[String]): Unit = {

  }
}
