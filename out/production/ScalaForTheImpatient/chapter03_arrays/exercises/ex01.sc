/*
  Write a code snippet that sets a to an array of n
  random integers between 0 (inclusive) and n (exclusive).
 */

val rand = util.Random
rand.setSeed(42)

val n = 10
val a: Array[Int] = (0 until n).map(i => rand.nextInt(n)).toArray