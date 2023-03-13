package examen

class SocioConActividades (actividadesPosibles:Int,numero_socio:Int, Nombre: String, Edad:Int):Socio(numero_socio,Nombre,Edad){
    constructor():this(2,24, "edward elrick",87)
    val Numero_socio = numero_socio
    val nombre = Nombre
    val edad= Edad

    var Actividades_Posibles = actividadesPosibles
        set(value) {
            if(value<0 || value >3){
                field = 3
            }else{field = value}
        }

    override fun balanceMensual(): Double {
        var Balance = 20.0
        if(Edad<18){
            Balance = 35.0
            return Balance
        }
        else{return Balance}
    }

    override fun añadir_Actividad(nueva_actividad:String){
        contadorActividades++
        ActividadesPosibles[contadorActividades] = nueva_actividad
    }

    override fun toString(): String {
        return "SocioConActividades(Numero_socio=$Numero_socio, nombre='$nombre', edad=$edad)"
    }


}