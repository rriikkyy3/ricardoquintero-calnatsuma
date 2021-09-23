package co.s4n.listas

import scala.io.Source

object Main extends App{

     def deListALista(lst:List[Int]):Lista = lst match{
       	   case Nil => Vacia()
	   case (i::lstp) => Cons(i, deListaALista(lstp))
	   }
	   
     def leerArchivo(src:String):Lista = {
      	  deListaALista(Source.fromFile(src).getLines().toList.map(.toInt))
	  }

     def concatenar(lst1:Lista, lst2:Lista):Lista = lst1:::lst2

     
     def imprimirLista(lst:Lista):String = println(lst)

     def invertirLista(lst:Lista):Lista = lst.reverse

     val lista = leerArchivo(args(0))


val lista1 = Cons(1,Vacia())
val lista2 = Cons(2, Vacia())
val lista3 = concatenar(lista1,lista2)
imprimirLista(lista3)

lista4 = invertirLista(lista3)
imprimirLista(lista4)


}

     
	  


