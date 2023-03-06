package Almacen

fun main(){
    val Almacen1 = Almacen()
    val CocaCola = BebidaAzucarada(0.25,1.0,"Coca-cola",50.0, true)
    Almacen1.AgregarProducto(CocaCola)
    Almacen1.InformacionAlmacen()
    val Agua = AguaMineral(1.0,0.5,"Bezoya","Granada")
    Almacen1.AgregarProducto(Agua)
    Almacen1.InformacionAlmacen()
    val CocaCola1 = BebidaAzucarada(2.0,2.0,"Coca-cola",50.0, true)
    Almacen1.AgregarProducto(CocaCola1)
    Almacen1.InformacionAlmacen()
    val CocaCola2 = BebidaAzucarada(2.0,2.0,"Coca-cola",50.0, true)
    Almacen1.AgregarProducto(CocaCola2)
    Almacen1.InformacionAlmacen()
    val Fanta1 = BebidaAzucarada(1.0, 1.5,"Fanta", 30.0, false)
    Almacen1.AgregarProducto(Fanta1)
    Almacen1.InformacionAlmacen()
    val Agua1 = AguaMineral(2.0,1.0,"Solán de Cabras","Cuenca")
    Almacen1.AgregarProducto(Agua1)
    Almacen1.InformacionAlmacen()


    /*if(Almacen1.EliminarProducto(2) == true){
        println("Producto borrado")
    }else{
        println("Producto no borrado")
    }

   Almacen1.recolocarBebida(5)

    Almacen1.InformacionAlmacen()

    println("Precio total: ${Almacen1.PrecioTotal()}")
*/
    Almacen1.borrarMarca("Coca-cola")
    Almacen1.InformacionAlmacen()
}
