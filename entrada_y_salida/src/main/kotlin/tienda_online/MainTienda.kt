package Ejercicio_Compra_Online

import Book
import MP3Player
import Product
import Product.Companion.contador
import TV
import TiendaOnline.Camera
import java.io.File
import java.io.FileWriter

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


    val archivo = File("C:\\Users\\usuario tarde\\Desktop\\cosas con el itellij\\entrada_y_salida\\cosas_de_tienda_online.txt")
    val  escritor_archivos = FileWriter(archivo)
    var menu = 0
    while (true){
        menu = readln()!!.toInt()
        println("dime que quieres hacer \n 1.- añadir producto \n 2.- modificar producto \n 3.- salir del programa")
        if (menu == 1){

        }
        if (menu == 2){

        }
        if(menu==3) break
    }

}