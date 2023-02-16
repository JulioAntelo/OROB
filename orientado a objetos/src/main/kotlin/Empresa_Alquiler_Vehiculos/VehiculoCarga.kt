package Empresa_Alquiler_Vehiculos

class VehiculoCarga {
    var tara:Int = 0
        get():Int {
            return field
        }
        set(value) {
            if (value >1000 || value<1){
                println("la duración no es correcta")
            }
            else{field =value}
        }

    fun alquiler() {

    }

    fun recibo(){

    }
}