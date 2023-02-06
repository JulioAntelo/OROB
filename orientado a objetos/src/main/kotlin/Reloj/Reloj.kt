class Reloj (horas:Int, minutos:Int,segundos:Int) {

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

    fun set_hora(horas: Int,minutos: Int,segundos: Int): String {
        return("son las $hora : $minuto : $segundo ")
    }
    fun display(): String {
        return ("son las $hora : $minuto : $segundo ")
    }
    fun tictac(){
        segundo += 1
    }
    fun añadir1000(){
        for (i in IntRange(0,1000)){
            segundo +=1
            if (segundo==60){
                segundo -= 60
                minuto +=1
            }
            if (minuto == 60){
                minuto -= 60
                hora +=1
            }
            if (hora==24) hora-=24
            println(display())
        }
    }
}
