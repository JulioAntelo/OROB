class Día (Temp_Max_Día: Int, Temp_Min_Día:Int, Estado_Día:String){

    var Temperatura_Máxima = Temp_Max_Día
    var Temperatura_Mínima = Temp_Min_Día
    var Estado = Estado_Día
        set(value) {
            val lista = listOf<String>("S", "N", "L")
            if (value !in lista) {
                println("Estado del día no válido.")
            } else
                field = value
        }
        get() {
            return field
        }

    fun Mostrar_Predicción(){
        var Mostrar_estado = ""
        when {
            Estado == "S" -> Mostrar_estado = "Soleado"
            Estado == "N" -> Mostrar_estado = "Nublado"
            Estado == "L" -> Mostrar_estado = "Luvioso"
        }
        println("Se espera un día $Mostrar_estado con temperaturas máximas de $Temperatura_Máxima y mínimas de $Temperatura_Mínima")
    }

    fun Temperatura_Actual(){
        var Temp_Actual = readLine()!!.toInt()
        if (Temp_Actual>Temperatura_Máxima) Temperatura_Máxima=Temp_Actual
        if (Temp_Actual<Temperatura_Mínima) Temperatura_Mínima=Temp_Actual
    }
}