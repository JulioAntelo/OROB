package Almacén_bebidas

fun Main(){

    val CocaCola = BebidaAzucarada(1,2,1.20,"Coca-cola",60,true)
    val Awa = AguaMineral(2,2,1.00,"fuenteAlvilla","Manantial")
    val Fanta =BebidaAzucarada(3,2,1.30,"FantaNaranja",45,false)
    val Nestea = BebidaAzucarada(4,1,1.50,"Nestea",20,false)
    val Kas = BebidaAzucarada(5,2,1.40,"Kas",70,true)


    val menu = 0
    print("que quieres hacer? " +
            "\n 1.- calcular el precio del almacen " +
            "\n 2.- calcular el precio total de una marca " +
            "\n 3.- calculara el precio de una estanteria" +
            "\n 4.- agregar un producto en la primer posicion libre" +
            "\n 5.- eliminar un producto " +
            "\n 6.- mostrar la informacion de cada bebida" +
            "\n 7.- salir del programa")
    while(menu!=7) {
        when (menu == 1){ Almacen.Calcular}
    }
}