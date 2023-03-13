package examen

open class Socio (numero_socio:Int,Nombre: String, Edad:Int):Persona(Nombre,Edad){
    internal var ActividadesPosibles = mutableMapOf<Int, String>(1 to "karate",2 to "Spinning", 3 to "otra")
    var contadorActividades:Int = 0
    val numero_socio = numero_socio
    val Nombre = Nombre
    val Edad= Edad



    open fun añadir_Actividad(nueva_actividad:String){
        var nueva_actividad= readln()
        contadorActividades++
        ActividadesPosibles[contadorActividades] = nueva_actividad
    }

    fun imprimirActividades(){
        for((k,v) in ActividadesPosibles){
            println("la actividad $k, es $v")
        }
    }


    override fun balanceMensual(): Double {
        var Balance = 35.0
        if(Edad<18){
            Balance = 20.0
            return Balance
        }
        else{return Balance}
    }

    override fun toString(): String {
        return "Socio(numero_socio=$numero_socio, Nombre='$Nombre', Edad=$Edad)"
    }


}