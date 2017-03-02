import scala.collection.mutable.ArrayBuffer

val array = Array(1,2,3,4,5)
val arrayBuffer = ArrayBuffer(1,2,3,4,5)

// We can traverse arrays and arrayBuffers with for loops:
for(i <- 0 until array.length){
  println(array(i))
}

for(i <- (0 until arrayBuffer.length).reverse){
  println(arrayBuffer(i))
}

// We can iterate over the elements directly,
// if we don't need indices:
for(a <- array){
  println(a)
}

