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
    }


    fun setSegundos(horas: Int,minutos: Int,segundos: Int){
        if (segundos>=60) minutos += segundos/60
    }

    fun setMinutos(horas: Int,minutos: Int){
        if (minutos>=60) horas += minutos/60
    }

    fun setHoras(horas: Int){
        if (horas>=25) horas = horas-1
    }
