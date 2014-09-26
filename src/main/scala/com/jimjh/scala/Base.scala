package com.jimjh.scala

/** A Base class with some protected members.
  *
  * @author Jim Lim - jim@quixey.com
  */
class Base {
  protected val x = 0
  protected[this] val y = 1
  protected[scala] val z = 2

  def compare(other: Base): Int = {
    return other.x - x + other.y - y + other.z - z
  }
}

protected class ProtectedBase {
  protected val x = 0
  protected[this] val y = 1
  protected[scala] val z = 2
}

protected[this] class ProtectedThisBase {
  protected val x = 0
  protected[this] val y = 1
  protected[scala] val z = 2
}

protected[scala] class ProtectedScalaBase {
  protected val x = 0
  protected[this] val y = 1
  protected[scala] val z = 2
}