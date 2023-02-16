package Empresa_Alquiler_Vehiculos

abstract class VehiculoTransporte:Vehiculo() {
    var num_plazas:Int = 5
        get():Int {
            return field
        }
        set(value) {
            if (value >7 || value<2){
                println("la duración no es correcta")
            }
            else{field =value}
        }

    override fun alquiler() {

    }

    override fun recibo() {
    }
}