package Empresa_Alquiler_Vehiculos

abstract class Vehiculo {
    var matricula:String = "1111AAA"
        get():String {
            return field
        }
        set(value) {
            if (value.length<7 || value.length>7){
                println("la longitud no es correcta")
                }
            else{field =value}
        }
    var duracion_dias:Int = 0
        get():Int {
        return field
    }
    set(value) {
        if (value >1000 || value<1){
            println("la duración no es correcta")
        }
        else{field =value}
    }
    open fun alquiler() {
        return recibo()
    }
    open fun recibo(){
    }
}