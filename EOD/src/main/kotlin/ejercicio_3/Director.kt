package ejercicio_3

class Director(nombre: String, nomina: Float) :Trabajador(nombre, nomina) {
     fun costoDelPersonal(): Float {
        var costoFinal = 0f
         costoFinal = nomina
         return costoFinal
    }
}