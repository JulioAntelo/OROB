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

    override fun Calcular(cantidad: Int): Double {
        if (promocion == true){
            PrecioBebida= PrecioBebida*cantidad*0.9
            return PrecioBebida
        }else {
            PrecioBebida = PrecioBebida*cantidad
            return PrecioBebida
        }
    }

}