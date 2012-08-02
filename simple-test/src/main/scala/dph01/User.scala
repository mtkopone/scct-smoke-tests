package dph01

import net.liftweb.common._

object User {
  def f = Full[Int](1) openOr 0
}