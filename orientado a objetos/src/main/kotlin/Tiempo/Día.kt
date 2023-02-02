class Día (Temp_Max_Día: Int, Temp_Min_Día:Int, Estado_Día:String){

    var Temperatura_Máxima = Temp_Max_Día
    var Temperatura_Mínima = Temp_Min_Día
    var Estado = Estado_Día
        set(value) {
            val lista = listOf<Char>('S', 'N', 'L')
            if (value !in lista) {
                println("Estado del día no válido.")
            } else
                field = value
        }
        get() {
            return field
        }


}