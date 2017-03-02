/*
  Exercise 6:
  A better way of modeling such trees is with case classes.
  Let’s start with binary trees.
 */
sealed abstract class BinaryTree
case class Leaf(value: Int) extends BinaryTree
case class Node(left: BinaryTree, right: BinaryTree) extends BinaryTree

// Write a function to compute the sum of all elements in the leaves.

def leafSum(t: BinaryTree): Int = t match {
  case Leaf(value) => value
  case Node(left, right) => leafSum(left) + leafSum(right)
}

leafSum(Node(Leaf(3),Leaf(4))) // => 7
leafSum(Node(Node(Leaf(3),Leaf(8)),Leaf(5))) // => 16




// Extension: Height of binary tree
def max(a: Int, b: Int): Int = if(a >= b) a else b
def height(t: BinaryTree): Int = t match {
  case Leaf(_) => 1
  case Node(left,right) => max(height(left),height(right)) + 1
}

height(Leaf(2)) // => 1
height(Node(Node(Leaf(3),Leaf(8)),Leaf(5))) // => 3