package Ejercicio_Compra_Online

import Book
import MP3Player
import Product
import Product.Companion.contador
import TV
import TiendaOnline.Camera

fun main(){

    var listacompra= mutableListOf<Product>()
    var preciocompra=0.0
    var sony: TV = TV(800.0, "VentasAdri", 80)
    var samsung: TV = TV(680.2, "VentasDAM", 60)
    var mp31: MP3Player = MP3Player(34.5, "DjShark", "Rojo")
    var libro1: Book = Book(20.0, "Dross", 2015)
    var camera1:Camera= Camera(390.0,"CamerastotheWorld",55)
    var camera2:Camera=Camera(430.0,"FreePictures",108)

    listacompra.add(sony)
    listacompra.add(samsung)
    listacompra.add(mp31)
    listacompra.add(libro1)
    listacompra.add(camera1)
    listacompra.add(camera2)

   for (producto in listacompra){
       producto.Imprimir()
       preciocompra+=producto.computersaleprice()
       println()
   }
    print("El precio final de la compra es $preciocompra")
    println(contador)
}