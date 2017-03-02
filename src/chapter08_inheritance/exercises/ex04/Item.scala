package chapter08_inheritance.exercises.ex04

/*
  Exercise 4:
    Define an abstract class Item with methods price
    and description. A SimpleItem is an item whose
    price and description are specified in the constructor.
    Take advantage of the fact that a val can override a
    def. A Bundle is an item that contains other items. Its
    price is the sum of the prices in the bundle. Also
    provide a mechanism for adding items to the bundle and
    a suitable description method.
 */

abstract class Item {
  def price: Double
  def description: String
}

class SimpleItem(val price: Double, val description: String)
    extends Item {
  override def toString: String = s"SimpleItem($description)"
}

class Bundle(private var items: List[Item], val description:String) extends Item {

  override def price(): Double = items.map(_.price).sum
  def addItem(item: Item): Unit = items = item :: items
  override def toString: String = items.toString().replaceFirst("List","Bundle")
}

object Bundle {
  def main(args: Array[String]): Unit = {
    val items = List(new SimpleItem(10,"a"),new SimpleItem(20,"b"))
    val bundle = new Bundle(items,"bundle")
    println(bundle)
  }
}
