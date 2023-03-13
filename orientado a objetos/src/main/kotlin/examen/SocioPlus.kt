package examen

class SocioPlus(numero_socio:Int, Nombre: String, Edad:Int):Socio(numero_socio,Nombre,Edad){

    val Numero_socio = numero_socio
    val nombre = Nombre
    val edad= Edad
    override fun balanceMensual(): Double {
        var Balance = 40.0
        if(Edad<18){
            Balance = 60.0
            return Balance
        }
        else{return Balance}
    }

    override fun toString(): String {
        return "SocioPlus(Numero_socio=$Numero_socio, nombre='$nombre', edad=$edad)"
    }


}