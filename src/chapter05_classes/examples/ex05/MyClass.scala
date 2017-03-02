package chapter05_classes.examples.ex05


class MyClass(
    objPrivate: Int,              // object-private field
    private val privateVal: Int,  // private field with getter
    private var privateVar: Int,  // private field with getter/setter
    val publicVal: Int,           // public field with getter
    var publicVar: Int) {         // public field with setter
}
