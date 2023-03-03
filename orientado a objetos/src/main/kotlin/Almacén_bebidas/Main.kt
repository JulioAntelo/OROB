package Almacén_bebidas

fun Main(){
    var Listabebidas = mutableMapOf<Int,MutableList<Bebida>>()
    var almacen:Almacen = Almacen()

    val CocaCola = BebidaAzucarada(1,2,1.20,"Coca-cola",60,true)
    val Awa = AguaMineral(2,2,1.00,"fuenteAlvilla","Manantial")
    val Fanta =BebidaAzucarada(3,2,1.30,"FantaNaranja",45,false)
    val Nestea = BebidaAzucarada(4,1,1.50,"Nestea",20,false)
    val Kas = BebidaAzucarada(5,2,1.40,"Kas",70,true)
    val Agua = AguaMineral(6,2,1.00,"Si","Manantial")


    var menu = 0
    print("que quieres hacer? " +
            "\n 1.- calcular el precio del almacen " +
            "\n 2.- calcular el precio total de una marca " +
            "\n 3.- calculara el precio de una estanteria" +
            "\n 4.- agregar un producto en la primer posicion libre" +
            "\n 5.- eliminar un producto " +
            "\n 6.- mostrar la informacion de cada bebida" +
            "\n 7.- salir del programa")
    menu = readLine()!!.toInt()
    while(menu!=7) {
        if (menu == 1){ almacen.Calcular()}
        if (menu == 2){ almacen.PrecioTotal()}
        if (menu == 3){ almacen.PrecioEstanteria()}
        if (menu == 4){ almacen.AniadirBebida()}
        if (menu == 5){ almacen.EliminarBebida()}
        if (menu == 6){ almacen.MostrarTodo()}
        if (menu == 7){break}
        menu = readLine()!!.toInt()
    }
}