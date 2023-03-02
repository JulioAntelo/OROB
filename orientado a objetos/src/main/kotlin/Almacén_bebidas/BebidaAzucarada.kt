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

    override fun Calcular(producto,cantidad): Double {
        if (promocion == true){
            var PrecioBebidaPromo = producto*cantidad*0.9
            return PrecioBebidaPromo
        }else {
            PrecioBebida = producto*cantidad
            return super.Calcular(PrecioBebida)
        }
    }

}