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

    fun Calcular(producto: Double, cantidad: Int, promocion: Boolean): Double {
        var PrecioBebidaPromo = 0.00
        if (promocion == true){
             PrecioBebidaPromo= producto*cantidad*0.9
            return PrecioBebidaPromo
        }else {
            PrecioBebidaPromo = producto*cantidad
            return PrecioBebidaPromo
        }
    }

}