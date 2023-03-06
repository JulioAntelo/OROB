package Almacen

abstract class Bebida {

    companion object{
        private var contador = 1
    }

    var ID:Int = contador

    var L:Double = 0.0
        set(value){
            if (value <= 0){
                println("Introduzca un número válido de litros.")
            }else{
                field = value
            }
        }
        get(){
            return field
        }

    var p:Double = 0.0
        set(value){
            if (value <= 0.0){
                println("Introduzca un precio válido.")
            }else{
                field = value
            }
        }
        get(){
            return field
        }

    var m:String = ""
        set(value){
            if (value.isEmpty()){
                println("Introduce una marca válida.")
            }else{
                field = value
            }
        }
        get(){
            return field
        }


    constructor(litros:Double, precio:Double, marca:String){
        contador ++
        L = litros
        p = precio
        m = marca
    }
/*
    constructor(bebida: Bebida) : this(bebida.L, bebida.p, bebida.m) {
        this.ID = bebida.ID
    }
*/
    open fun Calcular(cant_prod:Int):Double{
        val total= cant_prod * this.p
        return total
    }

    override fun toString(): String {
        return "\nIdentificador: ${ID}\nLitros:$L L\nPrecio:$p€\nMarca:$m"
    }



}