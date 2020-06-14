package conslist

trait myList[T] {
  def isEmpty: Boolean
  def head: T
  def tail: myList[T]
}

class myCons[T](val head: T, val tail: myList[T]) extends myList[T] {
  def isEmpty: Boolean = false
}

class myNil[T] extends myList[T] {
  def isEmpty: Boolean = true
  def head: Nothing = throw new NoSuchElementException("Nil.head")
  def tail: Nothing = throw new NoSuchElementException("Nil.tail")
}