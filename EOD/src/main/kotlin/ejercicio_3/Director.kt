package ejercicio_3

class Director(nombre: String, nomina: Double) :Trabajador(nombre, nomina) {
     override fun costoDelPersonal(): Double {
         return nomina
    }
}