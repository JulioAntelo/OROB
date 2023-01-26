fun main(args: Array<String>) {
    var libro1 = libro(    "petete",
            "el libro gordo",
            7,
             345)


    var libro2 = libro(    "petete",
        "el libro gordo",
        7,
        345)

    var libro3 = libro(    "petete",
        "el libro gordo",
        7,
        345)


    println("este es un menu para seleccionar lo que quieres hacer:\n 1 .- si quiere mostrar la informacion del libro. \n 2.- si quiere modificar algun dato sobre el libro. \n 3.- si quiere salir del programa")

    var seleccion = readLine()!!.toInt()
    while (true){
        when (seleccion){
            1 ->libro1.imprimir_info()
            2 ->libro1.modificar_info()
            3 ->break
        }
        seleccion = readLine()!!.toInt()
    }



}




class Carta(numero: Int, palo: Char) {
    var numero: Int = 0
        set(value) {
            if (value !in 1..13) {
                println("Numero de carta inválido.")

            } else
                field = value
        }
        get() {
            return field
        }
    var palo: Char = ' '
        set(value) {
            //'C','P', 'R', 'T'
            val l = listOf<Char>('C', 'P', 'R', 'T')

            if (value !in l) {
                println("Palo de carta inválido.")
            } else
                field = value
        }
        get() {
            return field
        }
/*
    init {
        this.numero = numero
        this.palo = palo
    }
*/
    constructor(otraCarta: Carta) : this(otraCarta.numero, otraCarta.palo) {
    }

    fun mostrarCarta() {
        var paloMostrar = ""
        var numeroMostrar = ""
        when {
            palo == 'C' -> paloMostrar = "Corazones"
            palo == 'P' -> paloMostrar = "Picas"
            palo == 'R' -> paloMostrar = "Rombos"
            palo == 'T' -> paloMostrar = "Trebol"
        }
        when {
            numero == 1 -> numeroMostrar = "As"
            numero in (2..10) -> numeroMostrar = numero.toString()
            numero == 11 -> numeroMostrar = "Jack"
            numero == 12 -> numeroMostrar = "Reina"
            numero == 13 -> numeroMostrar = "Rey"
        }
        println("$numeroMostrar de $paloMostrar.")
    }

    fun compararCarta(otraCarta: Carta) {
        var numero2 = this.numero
        var palo2 = this.palo
        if (numero > numero2) {
            print("La carta mayor es: ")
            mostrarCarta()
        } else if (numero < numero2) {
            print("La carta mayor es: ")
            mostrarCarta()
        } else {
            if (palo > palo2) {
                print("La carta mayor es: ")
                mostrarCarta()
            } else {
                print("La carta mayor es: ")
                mostrarCarta()
            }
        }
    }
}

class coche() {
    var marca:String = ""
    var color:String =""
    var modelo:String = ""
    var caballos:Int=0
    var num_puertas:Int =0
    var matricula:String=""
    fun imprimir(){
     println("marca: $marca")

     println("color: $color")
     println("modelo: $modelo")
     println("caballos: $caballos")
     println("numero de puertas: $num_puertas")
     println("matricula:  $matricula")
 }



}





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
        require(horas in 0..23){"hora erronea"}
        require(minutos in 0..60){"minutos erroneos"}
        require(segundos in 0..60){"segundos erroneos"}

    }
    constructor(horas:Int, minutos:Int):this(horas, minutos,0){

    }

    constructor(horas:Int):this(horas, 0,0){

    }
    override fun toString(): String {
        return "reloj: $horas horas $minutos minutos $segundos segundos"
    }
}