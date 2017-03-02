/*
  What do you need to import so that you can get a
  random prime as probablePrime(100, Random),
  without any qualifiers before probablePrime and Random?
 */

import scala.util.Random
import BigInt._

probablePrime(100, Random)

// More verbose:
BigInt.probablePrime(100,scala.util.Random)