package co.s4n.listas

sealed trait Lista
case class Vacia() extends Lista
case class Cons(i: Int, lst:Lista) extends Lista

def longitud(lst:Lista):Int = lst match {
    case Vacia() => 0
    case Cons(i, lst) => 1+longitud(lstp)
}

