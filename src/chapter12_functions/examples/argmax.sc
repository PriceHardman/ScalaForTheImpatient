def argmax_iterative(f: (Int) => Int, X: Seq[Int]): Int = {
  var max: Int = X(0)
  for(i <- 0 until X.length){
    if(f(X(i)) >= f(max)) max = X(i)
  }
  return max
}

def argmax_functional(f: (Int) => Int, X: Seq[Int]) =
  X.map(x => (x,f(x))).maxBy(_._2)._1



val X = Array(-5,-4,-3,-2,-1,0,1,2,3,4)
argmax_iterative((x) => x*x,X)
argmax_functional((x) => x*x,X)