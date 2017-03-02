/*
  Exercise 5: Write a Scala program that
    writes the powers of 2 and their
    reciprocals to a file, with the exponent
    ranging from 0 to 20. Line up the columns:
    1     1
    2     0.5
    4     0.25
    ...   ...
 */
for(i <- 0 to 20){
  println(s"$i\t${1.0/i}")
}