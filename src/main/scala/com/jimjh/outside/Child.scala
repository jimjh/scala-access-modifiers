package com.jimjh.outside

import com.jimjh.scala.Base

/** Demonstrates a child class that is in a different package from the parent class.
  *
  * @author Jim Lim - jim@quixey.com
  */
class Child extends Base {

  def access(): Unit = {
    println(x)
    println(y)
    println(z)
  }
}
