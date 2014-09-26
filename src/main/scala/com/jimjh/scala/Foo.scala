package com.jimjh.scala

/** Used for testing access to members of other classes in the same package.
  *
  * @author Jim Lim - jim@quixey.com
  */
class Foo {

  def base():Unit = {
    val b = new Base
    // println(b.x)
    // println(b.y)
    println(b.z)
  }

  def protectedBase():Unit = {
    val b = new ProtectedBase
    // println(b.x)
    // println(b.y)
    println(b.z)
  }

  def protectedThisBase():Unit = {
    val b = new ProtectedThisBase
    // println(b.x)
    // println(b.y)
    println(b.z)
  }

  def protectedScalaBase():Unit = {
    val b = new ProtectedScalaBase
    // println(b.x)
    // println(b.y)
    println(b.z)
  }

  def child(): Unit = {
    val c = new Child
    // println(c.x)
    // println(c.y)
    println(c.z)
  }
}
