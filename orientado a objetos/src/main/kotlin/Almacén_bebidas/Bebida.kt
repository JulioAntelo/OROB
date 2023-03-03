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
    var MarcaBebida = marca
        get():String {
            return field
        }
        set(value) {
            if (MarcaBebida.length<3){
                println("la longitud es menor de la esperada")
            }else{field = value}
        }

    open fun Calcular(cantidad: Int): Double {
        return cantidad*PrecioBebida
    }
}

