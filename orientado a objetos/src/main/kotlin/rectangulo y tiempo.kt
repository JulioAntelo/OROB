class rectangle (var base:Int, var altura:Int){

    fun imprimir(){
        println("base: $base, altura: $altura")
        println("el área es: " + area())
        println("el perímetro es: " + perimetro())
    }

    fun area():Int{
        var calculo_area = base*altura
        return calculo_area
    }

    fun perimetro():Int {
        var calculo_perimetro = base+base+altura+altura
        return calculo_perimetro
    }

}

class Tiempo(var horas:Int, var minutos:Int, var segundos:Int) {

    init {
        require(horas in 0..23){"Tiempo.hora erronea"}
        require(minutos in 0..60){"minutos erroneos"}
        require(segundos in 0..60){"segundos erroneos"}

    }
    constructor(horas:Int, minutos:Int):this(horas, minutos,0){

    }

    constructor(horas:Int):this(horas, 0,0){

    }
    override fun toString(): String {
        return "Tiempo.reloj: $horas horas $minutos minutos $segundos segundos"
    }
}