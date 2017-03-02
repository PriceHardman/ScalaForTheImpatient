/*
  Make a collection of all time zones returned by
  java.util.TimeZone.getAvailableIDs that are in America.
  Strip off the "America/" prefix and sort the result.
 */

val americaTZs = java.util.TimeZone
  .getAvailableIDs()
  .filter(_.matches("^America.*")) // only get ones starting with "America"
  .map(_.drop(8)) // Take "America/" off the front of each
  .sorted
