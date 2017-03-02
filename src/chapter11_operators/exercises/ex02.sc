/*
  Exercise 2:
  The BigInt class has a pow method,
  not an operator. Why didn’t the Scala
  library designers choose ** (as in Fortran)
  or ^ (as in Pascal) for a power operator?

 */
// Because ** would have the
// same precedence as *, which
// violates PEMDAS, and because
// ^ is already a method of
// BigInt, denoting bitwise XOR.