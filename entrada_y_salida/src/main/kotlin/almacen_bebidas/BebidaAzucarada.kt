package almacen_bebidas

class BebidaAzucarada(litros:Double, precio:Double, marca:String, porcentajeAzucar:Double, var promocion: Boolean):
    Bebida(litros, precio, marca) {

    var porazucar = porcentajeAzucar
        set(value){
            if (value <= 0.0){
                println("Introduzca un porcentaje válido.")
            }else{
                field = value
            }
        }
        get(){
            return field
        }


    override fun Calcular(cant_prod: Int): Double {
        val totaldescuento: Double
        if (promocion == true){
            println("Tiene un 10 % de descuento.")
            totaldescuento = super.Calcular(cant_prod) - super.Calcular(cant_prod)*10/100
            return totaldescuento
        }else{
            println("No tiene descuento.")
            return super.Calcular(cant_prod)
        }
    }

    override fun toString(): String {
        return super.toString() + "\nPorcentaje de azucar:$porazucar%\nPromoción:$promocion"

    }
}