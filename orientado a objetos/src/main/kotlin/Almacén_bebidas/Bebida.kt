package Almacén_bebidas

open class Bebida (Identificador:Int,
                   litros:Int,
                   Precio:Double,
                   marca:String){
    val listaIdentificador: MutableList<Int>
        get() = mutableListOf(this.IdentificadorBebida)
    val IdentificadorBebida = Identificador
        get():Int {
            return field
        }
    var LitrosBebida = litros
        get():Int {
            return field
        }
        set(value){
            if (value <=0){
                field = 2
            }else{field = value}
        }
    var PrecioBebida = Precio
        get():Double {
            return field
        }
        set(value) {
            if (value <=0.00){
                println("precio incorrecto")
            }else{field = value}
        }
    val MarcaBebida = marca
        get():String {
            return field
        }

    open fun Calcular(Cantidad_prod: Double): Double {
        return Cantidad_prod*PrecioBebida
    }
}

