/*
  Whereas with the traditional, imperative
  style of traversing arrays we typically
  act on the array elements themselves, we can
  go a step further and iterate over arrays
  and yield a new transformed copy, leaving
  the original unmodified.
 */

val a = Array(1,2,3,4,5)

/*
  To transform an array, we use a for comprehension,
  which features the yield keyword.
  Here, we produce a new array of the squares
  of the elements of a:
 */
for(i <- a) yield i*i


// We can also filter the elements that are yielded
// by using an iterator guard:
for(i <- a if i%2==0) yield i*i // even squares of a


/*
  We can also adopt a more functional style and use
  map and filter instead of for comprehensions.
 */
a.map((i: Int) => i*i).filter((square: Int) => square%2==0)

// This is the pedantic, verbose way of using
// map and filter. We can pare this down to the
// equivalent:
a.map(i => i*i).filter(_%2==0)

