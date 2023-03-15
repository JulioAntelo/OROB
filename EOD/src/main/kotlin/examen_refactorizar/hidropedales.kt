package examen_refactorizar

class hidropedales(plazas:Int):Embarcación(plazas) {
    var plazas = plazas
    val precio = 4


    public override fun CalcularCosteTotal(horas:Int): Int {
        return horas*precio
    }

    override fun toString(): String {
        return "hidropedales(plazas=$plazas, precio=$precio)"
    }
}