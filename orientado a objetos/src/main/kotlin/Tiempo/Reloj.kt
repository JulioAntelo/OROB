class main {
    var hora1 = hora(10,23,23)
    fun main() {
        println("Reloj \n " +
                "----------\n " +
                "1.- Mostrar hora 12 \n " +
                "2.- Mostrar hora 24 \n " +
                "3.- Modificar horas \n " +
                "4.- Modificar minutos \n " +
                "5.- Modificar segundos \n " +
                "6.- Salir")


        var menu= readLine()!!.toInt()
        while (menu != 6){
            if (menu==1){
                hora1.mostrarhora12()
            }
            if (menu==2){
                hora1.toString()
            }
            if (menu==3){
                hora1.setHoras(readLine()!!.toInt())
            }
            if (menu==4){
                hora1.setMinutos(hora1.hora, readLine()!!.toInt())
            }
            if (menu==5){
                hora1.setSegundos(hora1.hora,hora1.minuto,readLine()!!.toInt())
            }
        }
    }
}