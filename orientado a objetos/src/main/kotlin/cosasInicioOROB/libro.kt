package cosasInicioOROB

class libro (autor:String, titulo:String, puntuacion:Int, num_paginas:Int){
    var autor:String =""

    var titulo:String =""

    var puntuacion:Int = 5
        get() {
            if (field<5){
                println("no ta muy weno la verdad")
            }
            return field
        }
        set(value) {
            field = when{
                value > 10 -> 10
                value < 0 -> 0
                else -> value
            }
        }
    var num_paginas:Int = 0
        get() {
            return field
        }
        set(value) {
            field = when{
                value > 3031 -> 3031
                value < 50 -> 50
                else -> value
            }
        }



    fun imprimir_info(){
        println(" autor: $autor\n título: $titulo\n puntuacion: $puntuacion\n numero de paginas: $num_paginas ")
    }

    fun modificar_info(){
        println("que quieres modificar? \n 1.- autor \n 2.- titulo \n 3.- puntuacion \n 4.- numero de paginas")
        var seleccion_a_modificar = readLine()!!.toInt()
        when (seleccion_a_modificar){
            1 -> autor =  readLine()!!.toString()
            2 -> titulo =  readLine()!!.toString()
            3 -> puntuacion =  readLine()!!.toInt()
            4 -> num_paginas =  readLine()!!.toInt()
        }
    }


    constructor(otrolibro: libro):this(otrolibro.titulo,otrolibro.autor,otrolibro.num_paginas,otrolibro.puntuacion)
}
