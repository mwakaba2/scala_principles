trait Expr
case class Number(n: Int) extends Expr
case class Sum(e1:Expr, e2: Expr) extends Expr
case class Prod(e1: Expr, e2: Expr) extends Expr
case class Var(n: String) extends Expr

def show(e: Expr): String = e match {
  case Number(x) => x.toString
  case Sum(l, r) => show(l) + " + " + show(r)
  case Prod(l, r) => {
    if (l.isInstanceOf[Sum]) { "(" + show(l) + ")" + " * " + show(r)}
    else { show(l) + " * " + show(r) }
  }
  case Var(x) => x
}

show(Sum(Number(1), Number(3)))
show(Sum(Prod(Number(2), Var("x")), Var("y")))
show(Prod(Sum(Number(2), Var("x")), Var("y")))


