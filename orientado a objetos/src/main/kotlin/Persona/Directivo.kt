package Persona

class Directivo:Persona {
    constructor(DNI:String, nombre:String, apellidos:String, plus_direccion:Float, Dietas:Float, Cargo:String):super(DNI, nombre, apellidos)

    var plus_direccion:Float = 0.0F
    var dieta_Directivo:Float = 0.0F

    fun calcular_sueldo(): Float {
        return plus_direccion + dieta_Directivo
    }

}
