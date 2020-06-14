import conslist._

def nth[T](n: Int, xs: myList[T]): T = {
  if (xs.isEmpty) throw new IndexOutOfBoundsException
  else if (n == 0) xs.head
  else nth(n - 1, xs.tail)
}

val list = new myCons(1, new myCons(2, new myCons(3, new myNil)))

nth(2, list)
nth(-1, list)