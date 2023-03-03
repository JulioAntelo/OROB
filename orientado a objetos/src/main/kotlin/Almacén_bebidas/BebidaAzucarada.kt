package Almacén_bebidas

class BebidaAzucarada(Identificador:Int,
                      litros:Int,
                      Precio:Double,
                      marca:String,
                      porcentajeAzucar:Int,
                      promocion: Boolean)
    : Bebida(Identificador,
        litros,
        Precio,
        marca) {

    val porcentaje_azucar = porcentajeAzucar
    var promocion = promocion

    fun Calcular(producto: Double, cantidad: Int): Double {
        if (promocion == true){
            PrecioBebida= producto*cantidad*0.9
            return PrecioBebida
        }else {
            PrecioBebida = producto*cantidad
            return PrecioBebida
        }
    }

}