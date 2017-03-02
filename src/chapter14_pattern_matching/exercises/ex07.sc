/*
  Exercise 7:
  Extend the tree in the preceding exercise
  so that each node can have an arbitrary
  number of children, and reimplement the
  leafSum function. The tree in exercise 5
  should be expressible as
    Node(Node(Leaf(3), Leaf(8)), Leaf(2), Node(Leaf(5)))
 */
sealed abstract class Tree
case class Leaf(value: Int) extends Tree
case class Node(elems: Tree*) extends Tree

def leafSum(tree: Tree): Int = tree match {
  case Leaf(value) => value
  case Node(elems @ _*) =>
    elems.foldLeft(0)((sum,elem) => sum + leafSum(elem))
}

leafSum(Node(Node(Leaf(3),Leaf(8)), Leaf(2), Node(Leaf(5)))) // => 18
leafSum(Node(Leaf(1),Node(Leaf(2),Leaf(3),Node(Leaf(4),Leaf(5))))) // => 15


// Extension: Calculate height of the tree
def height(tree: Tree): Int = tree match {
  case Leaf(_) => 1
  case Node(elems @ _*) => elems.map(height).max + 1
}

height(Node(Node(Leaf(3),Leaf(8)), Leaf(2), Node(Leaf(5)))) // => 3
height(Node(Leaf(1),Node(Leaf(2),Leaf(3),Node(Leaf(4),Leaf(5))))) // => 4