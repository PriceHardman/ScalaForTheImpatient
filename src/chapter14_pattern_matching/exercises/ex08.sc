/*
  Exercise 8: Extend the tree in the preceding exercise
  so that each nonleaf node stores an operator in addition
  to the child nodes. Then write a function eval that
  computes the value. For example, the tree
          +
        / | \
       *  2  -
      / \    |
     3   8   5
  has value (3 × 8) + 2 + (–5) = 21.
 */
sealed abstract class Tree
case class Leaf(value: Int) extends Tree
case class Node(op: String, elems: Tree*) extends Tree

def eval(t: Tree): Double = t match {
    // Base case
  case Leaf(value) => value
    // Unary minus
  case Node("-", elems @ _*) if elems.length == 1 => -eval(elems.head)
    // Addition
  case Node("+", elems @ _*) => elems.foldLeft(0.0)((sum,elem) => sum + eval(elem))
    // Subtraction
  case Node("-", elems @ _*) => eval(elems.head) - elems.tail.foldLeft(0.0)((sum,elem) => sum + eval(elem))
    // Multiplication
  case Node("*", elems @ _*) => elems.foldLeft(1.0)((prod,elem) => prod * eval(elem))
    // Division
  case Node("/", elems @ _*) => eval(elems.head) * elems.tail.foldLeft(1.0)((prod,elem) => prod * (1.0/eval(elem)))
}

val t: Tree = Node("+",Node("*",Leaf(3),Leaf(8)),Leaf(2),Node("-",Leaf(5)))
eval(t) // => 21.0

