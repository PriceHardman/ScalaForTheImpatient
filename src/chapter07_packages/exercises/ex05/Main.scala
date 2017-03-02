package chapter07_packages.exercises.ex05

/*
  What is the meaning of
    private[com] def giveRaise(rate: Double)?
  Is it useful?

  => Suppose giveRaise is defined in
    foo.com.bar. The private[com] qualifier
    makes giveRaise visible within com and
    its subpackages, which could be useful
    for a variety of reasons. If com is
    actually the top level however, then private[com]
    might not be very useful.
 */

object Main {

}
