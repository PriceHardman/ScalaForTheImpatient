package chapter06_objects.exercises.ex08

/*
  Write an enumeration describing the eight
  corners of the RGB color cube. As IDs, use
  the color values (for example, 0xff0000 for Red).
 */

object Color extends Enumeration {
  val Black   = Value(0x000000)
  val Red     = Value(0xff0000)
  val Yellow  = Value(0xffff00)
  val Green   = Value(0x00ff00)
  val Cyan    = Value(0x00ffff)
  val Blue    = Value(0x0000ff)
  val Magenta = Value(0xff00ff)
  val White   = Value(0xffffff)
}
