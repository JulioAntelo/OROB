class Fecha(private val dia: Int, private val mes: Int, private val anio: Int) {
    fun validadia(): Boolean{
        if (dia < 1 || dia > 31) {return false}
        else{ return true }
    }
    fun validames():Boolean{
    if (mes < 1 || mes > 12) return false
    else{ return true }
    }
    fun dia_valido_mes():Boolean{
        var diasMes = 0
        when (mes) {

            1, 3, 5, 7, 8, 10, 12 -> diasMes = 31
            4, 6, 9, 11 -> diasMes = 30
            2 -> diasMes = if ((anio % 400 == 0) || (anio % 4 == 0 && anio % 100 != 0)) 29 else 28
        }
        return dia <= diasMes
    }
}
