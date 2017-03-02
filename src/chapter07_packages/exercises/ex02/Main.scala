package chapter07_packages.exercises.ex02

/*
  Write a puzzler that baffles your Scala friends,
  using a package com that isn’t at the top level.
 */

object Main {
  def main(args: Array[String]): Unit = {
    com.sun.fooledyou.Foo.sayHello();
  }
}
