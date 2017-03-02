/*
  Exercise 5:
  One can use lists to model trees that store values
  only in the leaves. For example, the list
  ((3 8) 2 (5)) describes the tree
       •
      /|\
     • 2 •
    /\   |
   3 8   5
  However, some of the list elements are
  numbers and others are lists. In Scala,
  you cannot have heterogeneous lists,
  so you have to use a List[Any]. Write a leafSum
  function to compute the sum of all elements in the
  leaves, using pattern matching to differentiate
  between numbers and lists.
 */
def leafSum(tree: List[Any]): Int = tree match {
  case Nil => 0 // empty leaf
  case (leaf: Int) :: Nil => leaf // match a single leaf
  case (leaf: Int) :: (branches: List[Any]) => leaf + leafSum(branches) // a leaf and more branches
  case (branches: List[Any]) :: (moreBranches: List[Any]) => leafSum(branches) + leafSum(moreBranches)
  case _ => throw new IllegalArgumentException("argument must be nested lists of ints")
}

leafSum(List(List(3,8),2,List(5)))