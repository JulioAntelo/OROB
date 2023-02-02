class hora(horas:Int, minutos:Int, segundos:Int) {
    var hora = horas
    var minuto = minutos
    var segundo = segundos

    init {
        if (hora!=null){
            require(hora>=0 && hora<=23){"la hora no está dentro de los parámetros"}
        }
        if (minuto!=null){
        require(minuto>=0 && minuto<=60){"la hora no está dentro de los parámetros"}
        }
        if (segundo!=null){
         require(segundo>=0 && segundo<=60){"la hora no está dentro de los parámetros"}
        }
    }

    constructor():this(0,0,0)

    fun setSegundos(horas: Int,minutos: Int,segundos: Int){
        if (segundos>=60){
            minuto += segundos/60
            segundo = segundos%60
            hora += minutos/60
            minuto = minutos%60
        }
    }

    fun setMinutos(horas: Int,minutos: Int){
        if (minutos>=60){
            hora += minutos/60
            minuto = minutos%60
        }
    }

    fun setHoras(horas: Int){
        if (horas>=25) hora % 24
    }

    fun mostrarhora12(){
        if (hora>12){
            hora = hora-12
            println("son las $hora horas, $minuto minutos, $segundo segundos, de la tarded")
        }
        else{
            println("son las $hora horas, $minuto minutos, $segundo segundos, de la mañana")

        }
    }

    override fun toString(): String {
        return "son las $hora horas , $minuto minutos, $segundo segundos"
    }


}

