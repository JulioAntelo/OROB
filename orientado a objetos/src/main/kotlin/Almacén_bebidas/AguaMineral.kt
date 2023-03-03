package Almacén_bebidas

class AguaMineral(Identificador:Int,
                  litros:Int,
                  Precio:Double,
                  marca:String,
                  Origen:String)
    : Bebida(Identificador,
        litros,
        Precio,
        marca) {
    val origen = Origen

    override fun Calcular(cantidad: Int): Double {
        return cantidad*PrecioBebida
    }


}