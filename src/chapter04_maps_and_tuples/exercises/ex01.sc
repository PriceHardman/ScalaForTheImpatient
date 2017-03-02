/*
  Set up a map of prices for a number of gizmos that you covet.
  Then produce a second map with the same keys
  and the prices at a 10 percent discount.
 */

val prices = Map(
  "Widget1" -> 1.23,
  "Widget2" -> 3.21,
  "Widget3" -> 4.56
)

prices.mapValues(0.90*_)